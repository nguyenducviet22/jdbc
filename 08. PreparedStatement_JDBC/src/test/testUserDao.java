package test;

import dao.userDao;
import model.user;

public class testUserDao {

	public static void main(String[] args) {
//		user u1 = new user("u1", "UUU", "123");
//		userDao.getInstance().insert(u1);
		
//		user find = new user("u1", "UUU", "123");
//		user result = userDao.getInstance().selectById(find);
//		System.out.println(result);
		
		//hack
		user find = new user("x\' or 1=1; -- ", "", "");
		user result = userDao.getInstance().selectById(find);
		System.out.println(result);
		
	}
}
