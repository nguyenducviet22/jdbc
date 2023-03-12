package test;

import dao.bookDao;
import model.book;

public class testBookDao {

	public static void main(String[] args) {

		// test insert
//		book book1 = new book("2201", "Java programming fundamental", 500000, 2023);
//		book book2 = new book("2202", "C programming fundamental", 500000, 2023);
//		book book3 = new book("2203", "Python programming fundamental", 500000, 2023);
//		book book4 = new book("2204", "C++ programming fundamental", 500000, 2023);
//		
//		bookDao.getInstance().insert(book1);

//		for (int i = 0; i < 10; i++) {
//			book book = new book("22" + i, "Java programming fundamental " + i, 500000, 2023);
//			bookDao.getInstance().insert(book);
//		}

		// test update
		book book1 = new book("2201", "Java programming fundamental", 100000, 2023);
		bookDao.getInstance().update(book1);

		book book2 = new book("2202", "C programming fundamental", 100000, 2023);
		bookDao.getInstance().update(book2);

		for (int i = 0; i < 10; i++) {
			book book = new book("22" + i, "Java programming fundamental " + i, 500000, 2023);
			bookDao.getInstance().update(book);
		}

		// test delete
		for (int i = 0; i < 10; i++) {
			book book = new book("22" + i, "Java programming fundamental " + i, 500000, 2023);
			bookDao.getInstance().delete(book);
		}

	}
}
