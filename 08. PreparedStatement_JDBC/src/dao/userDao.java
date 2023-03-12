package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PersonsDB.JDBCUtil;
import model.user;

public class userDao implements daoInterface<user> {

	public static userDao getInstance() {
		return new userDao();
	}

	@Override
	public int insert(user t) {
		int result = 0;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			
			// USE STATEMENT 
//			// #2 create statement
//			Statement st = con.createStatement();
//			// #3 conduct SQL command
//			String sql = "Insert into users (userName, fullName, password)"+
//						" values ('"+t.getUserName()+"' , '"+t.getFullName()+"' , '"+t.getpassword()+"')";
//			
//			result = st.executeUpdate(sql);
			
			// USE PREPAREDSTATEMENT 
			// #2 create statement
			String sql = "Insert into users (userName, fullName, password)" + " values (?, ?, ?)";

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			pst.setString(2, t.getFullName());
			pst.setString(3, t.getpassword());

			// #3 conduct SQL command
			result = pst.executeUpdate();

			// #4
			System.out.println("sql was conducted:" + sql);
			System.out.println(result + " line(s) changed");
			// #5 stop connection with CSDL
			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(user t) {
		int result = 0;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			String sql = "Update users " + 
					" Set " + 
					" fullName = ?" + 
					", password = ?" + 
					" Where userName = ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getFullName());
			pst.setString(2, t.getpassword());
			pst.setString(3, t.getUserName());
			
			// #3 conduct SQL command
			result = pst.executeUpdate();

			// #4
			System.out.println("sql was conducted:" + sql);
			System.out.println(result + " line(s) changed");
			// #5 stop connection with CSDL
			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(user t) {
		int result = 0;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			String sql = "Delete from users " + " Where userName = ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			
			// #3 conduct SQL command
			result = pst.executeUpdate();

			// #4
			System.out.println("sql was conducted:" + sql);
			System.out.println(result + " line(s) changed");
			// #5 stop connection with CSDL
			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<user> selectAll() {
		ArrayList<user> result = new ArrayList<user>();
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			String sql = "Select * from users";

			PreparedStatement pst = con.prepareStatement(sql);
			// #3 conduct SQL command
			ResultSet rs = pst.executeQuery();

			// #4
			while (rs.next()) {
				String userName = rs.getString("userName");
				String fullName = rs.getString("fullName");
				String password = rs.getString("password");

				user user = new user(userName, fullName, password);
				result.add(user);

			}
			// #5 stop connection with CSDL
			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public user selectById(user t) {
		user result = null;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			String sql = "Select * from users where userName = ?";

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			// #3 conduct SQL command
			ResultSet rs = pst.executeQuery();

			// #4
			while (rs.next()) {
				String userName = rs.getString("userName");
				String fullName = rs.getString("fullName");
				String password = rs.getString("password");

				result = new user(userName, fullName, password);

			}
			// #5 stop connection with CSDL
			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<user> selectByCondition(String condition) {
		ArrayList<user> result = new ArrayList<user>();
		return result;
	}

}
