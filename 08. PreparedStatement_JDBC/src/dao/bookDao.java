package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import PersonsDB.JDBCUtil;
import model.book;

public class bookDao implements daoInterface<book>{
	
	public static bookDao getInstance() {
		return new bookDao();
	}

	@Override
	public int insert(book t) {
		int result = 0;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			Statement st = con.createStatement();
			// #3 conduct SQL command
			String sql = "Insert into books (bookId, nameOfBook, price, publishedYear)"+
						" values ('"+t.getBookId()+"' , '"+t.getNameOfBook()+"' , "+t.getPrice()+" , "+t.getPublishedYear()+")";
			
			result = st.executeUpdate(sql);
			
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
	public int update(book t) {
		int result = 0;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			Statement st = con.createStatement();
			// #3 conduct SQL command
			String sql = "Update books "+
						" Set " 
					+ " nameOfBook = '"+t.getNameOfBook()+"'"
					+ ", price = "+t.getPrice()+""
					+ ", publishedYear = "+t.getPublishedYear()+""
					+ " Where bookId = '"+t.getBookId()+"'";
			
			result = st.executeUpdate(sql);
			
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
	public int delete(book t) {
		int result = 0;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			Statement st = con.createStatement();
			// #3 conduct SQL command
			String sql = "Delete from books "
					+ " Where bookId = '"+t.getBookId()+"'";
			
			result = st.executeUpdate(sql);
			
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
	public ArrayList<book> selectAll() {
		ArrayList<book> result = new ArrayList<book>();
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			Statement st = con.createStatement();
			// #3 conduct SQL command
			String sql = "Select * from books";
						
			ResultSet rs = st.executeQuery(sql);
			
			// #4 
			while (rs.next()) {
				String bookId = rs.getString("bookId");
				String nameOfBook = rs.getString("nameOfBook");
				float price = rs.getFloat("price");
				int publishedYear = rs.getInt("publishedYear");
				
				book book = new book(bookId, nameOfBook, price, publishedYear);
				result.add(book);
				
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
	public book selectById(book t) {
		book result = null;
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			Statement st = con.createStatement();
			// #3 conduct SQL command
			String sql = "Select * from books where bookId = '"+ t.getBookId()+"'";
						
			ResultSet rs = st.executeQuery(sql);
			
			// #4 
			while (rs.next()) {
				String bookId = rs.getString("bookId");
				String nameOfBook = rs.getString("nameOfBook");
				float price = rs.getFloat("price");
				int publishedYear = rs.getInt("publishedYear");
				
				result = new book(bookId, nameOfBook, price, publishedYear);
				
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
	public ArrayList<book> selectByCondition(String condition) {
		ArrayList<book> result = new ArrayList<book>();
		try {
			// #1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			// #2 create statement
			Statement st = con.createStatement();
			// #3 conduct SQL command
			String sql = "Select * from books where" + condition;
						
			ResultSet rs = st.executeQuery(sql);
			
			// #4 
			while (rs.next()) {
				String bookId = rs.getString("bookId");
				String nameOfBook = rs.getString("nameOfBook");
				float price = rs.getFloat("price");
				int publishedYear = rs.getInt("publishedYear");
				
				book book = new book(bookId, nameOfBook, price, publishedYear);
				result.add(book);
				
			}
			// #5 stop connection with CSDL
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
