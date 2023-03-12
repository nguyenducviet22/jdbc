package ConnectArrangmentDB;

import java.sql.Connection;

import ArrangmentDB.JDBCUtil;

public class connectDatabase {
	public static void main(String[] args) {
		Connection conn = JDBCUtil.getConnection();
//		JDBCUtil.getConnection(conn); why can not run???
		System.out.println(conn);
		JDBCUtil.printInfo(conn);
		JDBCUtil.closeConnection(conn);
	}
}
