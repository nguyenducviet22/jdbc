package test;

import dao.customerDao;
import model.customer;

public class testCustomerDao {

	public static void main(String[] args) {
		
		//test insert
			customer cus1 = new customer(2201, "Nguyen", "Van A", 2000-01-01, "number 1");
			customerDao.getInstance().insert(cus1);
	}
}
