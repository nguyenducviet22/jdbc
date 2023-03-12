package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import PersonsDB.JDBCUtil;
import model.customer;

public class customerDao implements daoInterface<customer>{
	
	public static customerDao getInstance() {
		return new customerDao();
	}

	@Override
	public int insert(customer t) {
		try {
			//#1 create connection with CSDL
			Connection con = JDBCUtil.getConnection();
			//#2 create statement
			Statement st = con.createStatement();
			//#3 conduct SQL command
			String sql = "Insert into customers (customerId, firstName, lastName, dateOfBirth, address)"+
						"values ('"+t.getCustomerId()+"' , '"+t.getFirstName()+"' , '"+t.getLastName()+"' , "+t.getDateOfBirth()+" , '"+t.getAddress()+"')";
			
			int result = st.executeUpdate(sql);
			
			//#4
			System.out.println("sql was conduct: " + sql);
			System.out.println(result + " line(n) changed");
			//#5 stop connection with CSDL
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<customer> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public customer selectById(customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<customer> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
