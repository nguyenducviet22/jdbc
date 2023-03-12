package ArrangmentDB;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection cont = null;
		try {
			//register the JDBC
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			String url = "jdbc:mySQL://localhost:3306/arrangment";
			String username = "root";
			String password = "";
			//create connection
			cont = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
		}
		return cont;
	}
	
	public static void closeConnection(Connection cont) {
		try {
			if (cont != null) {
				cont.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection cont) {
		try {
			if (cont != null) {
				DatabaseMetaData mtdt = cont.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
