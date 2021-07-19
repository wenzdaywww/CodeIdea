package com.www.connectionpool;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 *
 * @author www
 *
 */
public class DataBaseConnectionPool {
	/** 链接池单例*/
	private static DataBaseConnectionPool instance;
	/** 链接工程对象*/
	private ConnFactory conf;
	/** 驱动*/
	private Driver driver;
	/** 驱动名*/
	private String driverClassName="oracle.jdbc.OracleDriver";
	/** 数据库地址*/
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	/** 数据库用户*/
	private String user = "test";
	/** 数据库密码*/
	private String password = "www362412";
	/** 最大链接数*/
	private int maxConnNum = 100;
	/** 初始化链接数*/
	private int initConnNum = 10;
	/** 空闲链接数*/
	private int freeConnNum = 0;
	/** 活跃链接数*/
	private int activeConnNum = 0;
	/** 空闲链接*/
	private LinkedList<Connection> freeConnection = new LinkedList<Connection>();
	/** 活跃链接*/
	private LinkedList<Connection> activeConnection = new LinkedList<Connection>();

	private DataBaseConnectionPool(){
		this.loadDriver();
		this.createPool();
	}
	/**
	 * 取得链接池实例
	 * @return
	 */
	public static DataBaseConnectionPool getInstance(){
		if(instance == null){
			instance = new DataBaseConnectionPool();
		}
		return instance;
	}
	/**
	 * 释放所有链接
	 * @return
	 */
	public synchronized boolean releaseAllConnection(){
		System.out.println("释放所有链接。。。");
		try{
			while(this.freeConnection.size()>0){
				this.freeConnection.poll().close();
				--this.freeConnNum;
			}
			while(this.activeConnection.size()>0){
				this.activeConnection.poll().close();
				--this.activeConnNum;
			}
			System.out.println("释放所有链接后，当前空闲链接数="+freeConnNum+"，活跃链接数="+activeConnNum);
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			System.err.println("释放所有链接连接失败。。。");
			return false;
		}
	}
	/**
	 * 释放一个链接
	 * @param conn
	 * @return
	 */
	public synchronized boolean releaseConnection(Connection conn){
		System.out.println("释放当前链接。。。");
		try {
			if (conn.isClosed()) {
				--this.activeConnNum;
				System.out.println("释放当前链接后，当前空闲链接数="+freeConnNum+"，活跃链接数="+activeConnNum);
				return true;
			} else {
				this.freeConnection.add(conn);
				++this.freeConnNum;
				--this.activeConnNum;
				notifyAll();
				System.out.println("释放当前链接后，当前空闲链接数="+freeConnNum+"，活跃链接数="+activeConnNum);
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("释放当前链接失败。。。");
			return false;
		}
	}
	/**
	 * 从链接池获取一个空闲链接,带时间限制
	 * @param timeOut
	 * @return
	 */
	public synchronized Connection getConnection(long timeOut){
		Connection conn;
		while((conn=this.getConnection())==null){
			try {
				wait(timeOut);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	/**
	 * 从链接池获取一个链接
	 * @return
	 */
	public synchronized Connection getConnection(){
		System.out.println("从链接池获取一个链接。。。");
		Connection conn;
		if(this.freeConnNum>0){
			conn = this.freeConnection.poll();
			--this.freeConnNum;
			try {
				if (conn.isClosed()) {
					conn = this.getConnection();
				}else{
					this.activeConnection.add(conn);
					++this.activeConnNum;
				}
				System.out.println("空闲链接数充足获取链接后，当前空闲链接数="+freeConnNum+"，活跃链接数="+activeConnNum);
			} catch (SQLException e) {
				e.printStackTrace();
				System.err.println("从链接池获取一个链接失败。。。");
				return null;
			}
		}else if(this.activeConnNum<this.maxConnNum){
			conn = conf.newConnection();
			this.activeConnection.add(conn);
			++this.activeConnNum;
			System.out.println("空闲链接数不足获取链接后，当前空闲链接数="+freeConnNum+"，活跃链接数="+activeConnNum);
		}else{
			System.err.println("活跃链接数大于最大链接数，请等待。。。");
			return null;
		}
		return conn;
	}

	/**
	 * 创建一个链接池
	 */
	private void createPool() {
		this.conf = new ConnFactory(url, user, password);
		System.out.println("创建一个链接池。。。");
		Connection conn;
		for (int i = 0; i < initConnNum; ++i) {
			if ((conn = conf.newConnection()) != null) {
				this.freeConnection.add(conn);
				++this.freeConnNum;
			}else{
				--i;
			}
		}
		System.out.println("创建一个连接池，当前空闲链接数="+freeConnNum+"，活跃链接数="+activeConnNum);
	}
	/**
	 * 装载数据库驱动
	 */
	private void loadDriver() {
		try {
			driver = (Driver) Class.forName(driverClassName).newInstance();
			DriverManager.registerDriver(driver);
			System.out.println("实例化驱动:"+driverClassName);
		} catch (Exception e) {
			System.err.println("实例化驱动失败:"+driverClassName);
			e.printStackTrace();
		}
	}
	/**
	 * 获取当前活跃链接数
	 * @return
	 */
	public int getActiveConnNum() {
		return activeConnNum;
	}
	/**
	 * 获取当前空闲链接数
	 * @return
	 */
	public int getFreeConnNum() {
		return freeConnNum;
	}
	/**
	 * 获取最大链接数
	 * @return
	 */
	public int getMaxConnNum() {
		return maxConnNum;
	}
	/**
	 * 设置最大链接数
	 * @param maxConnNum
	 */
	public void setMaxConnNum(int maxConnNum) {
		this.maxConnNum = maxConnNum;
	}
}
