package test;

import java.util.ArrayList;

import dao.bookDao;
import model.book;

public class testBookDao {

	public static void main(String[] args) {

		ArrayList<book> list = bookDao.getInstance().selectAll();

		for (book books : list) {
			System.out.println(books.toString());
		}

		System.out.println("----------");
		book find = new book();
		find.setBookId("2201");
		book book1 = bookDao.getInstance().selectById(find);
		System.out.println(book1);

		System.out.println("----------");
		ArrayList<book> list2 = bookDao.getInstance().selectByCondition("price>200000");

		for (book books : list2) {
			System.out.println(books.toString());

		}
	}
}
