package dao;

import java.util.ArrayList;

import model.book;

public class bookDao implements daoInterface<book>{
	
	public static bookDao getInstance() {
		return new bookDao();
	}

	@Override
	public int insert(book t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(book t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(book t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<book> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public book selectById(book t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<book> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
