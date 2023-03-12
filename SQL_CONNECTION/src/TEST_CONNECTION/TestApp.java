package TEST_CONNECTION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestApp {
	
	private static String url = "jdbc:postgresql://localhost:5432/testdb";
	private static String username = "postgres";
	private static String password = "nguyenducviet123@@@";
	
	Connection getConnection() {
		Connection cnt = null;
		try {
			cnt = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static void main(String[] args) {
		TestApp testApp = new TestApp();
		testApp.getConnection();

	}

}
