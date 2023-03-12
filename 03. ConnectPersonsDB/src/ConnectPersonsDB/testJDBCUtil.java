package ConnectPersonsDB;

import java.sql.Connection;

import PersonsDB.JDBCUtil;

public class testJDBCUtil {
	public static void main(String[] args) {
		Connection conn = JDBCUtil.getConnection();
		JDBCUtil.printInfo(conn);
		JDBCUtil.closeConnection(conn);
}
}
