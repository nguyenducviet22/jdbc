package ConnectPersonsDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import PersonsDB.JDBCUtil;

public class testJDBCUtil {
	public static void main(String[] args) {
		try {
			// #1 create connection
			Connection connection = JDBCUtil.getConnection();
//			JDBCUtil.printInfo(connection);

			// #2 create statement
			Statement st = connection.createStatement();

			// #3 create a sql command
			String sql = "INSERT INTO persons(last_name, first_name, gender, date_of_birth, income)\r\n"
					+ "VALUES (\"Nguyen\", \"Van C\", \"F\", \"2000-06-06\", 75000000)";
			
			int check = st.executeUpdate(sql);
			
			// #4 
			System.out.println("the number lines changed: " + check);
			if (check > 0) {
				System.out.println("Insert data succeeded");
			} else {
				System.out.println("Insert data failed");
			}

			// #5 stop connection
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
