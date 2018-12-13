package connectionpool;

import java.sql.Connection;
import java.util.ArrayList;

public class TestConnectionPool {

	public static void main(String[] args) {
		DBConnectionPool pool=DBConnectionPool.getInstance();
		pool.setMaxConnNum(15); 
		ArrayList<Connection> conArr=new ArrayList<Connection>();
		for (int i = 0; i < 20; i++) {
			Connection connection=pool.getConnection();
			conArr.add(connection);
		}
		for (int i = 0; i < conArr.size(); i++) {
			if (i/2==0) {
				pool.releaseConnection(conArr.get(i));
			}
			pool.getConnection();
		}
	}

}
