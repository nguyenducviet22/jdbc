package dao;

import java.util.ArrayList;

import model.customer;

public class customerDao implements daoInterface<customer>{
	
	public static customerDao getInstance() {
		return new customerDao();
	}

	@Override
	public int insert(customer t) {
		// TODO Auto-generated method stub
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
