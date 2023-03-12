package model;

import java.sql.Date;

public class customer {

	private int customerId;
	private String firstName;
	private String lastName;
//	private Date dateOfBirth;
	private int dateOfBirth;
	private String address;
	
	public customer() {
		super();
	}

//	public customer(int customerId, String firstName, String lastName, Date dateOfBirth, String address) {
//		super();
//		this.customerId = customerId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.dateOfBirth = dateOfBirth;
//		this.address = address;
//	}
	
	public customer(int customerId, String firstName, String lastName, int dateOfBirth, String address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
