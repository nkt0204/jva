package demoMVC.ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectPostDB {
	public static final String DRIVER = "org.springframework.jdbc.datasource.DriverManagerDataSource";
	public static final String URL = "jdbc:postgresql://localhost:5432/user_trial";
	// jdbc::postgresql://localhost:5432/myapp
	public static final String USER = "postgres";
	public static final String PASS = "postgres";
	
	public static Connection getConnectionSqlServer() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		ConnectPostDB a = new ConnectPostDB();
		Connection aaa = a.getConnectionSqlServer();
		if(aaa!=null) {
			System.out.println("ok");
		}else {
			System.out.println("false");
		}
	}
}
