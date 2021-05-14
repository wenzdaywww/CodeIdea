package connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author www
 *
 */
public class ConnFactory {
	private String url;

	private String user;

	private String password;

	/**
	 *
	 * @param url
	 * @param user
	 * @param password
	 */
	public ConnFactory(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public Connection newConnection(){
		Connection conn;
		try {
			if (this.user == "") {
				conn = DriverManager.getConnection(url);
			} else {
				conn = DriverManager.getConnection(url, user, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Can not get a new Connection!");
			return null;
		}
		return conn;
	}
}
