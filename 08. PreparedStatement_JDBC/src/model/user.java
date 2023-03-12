package model;

public class user {

	private String userName;
	private String fullName;
	private String password;
	
	public user() {
		super();
	}


	public user(String userName, String fullName, String password) {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getpassword() {
		return password;
	}


	public void setpassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "username [userName=" + userName + ", fullName=" + fullName + ", password=" + password + "]";
	}
	
	
	
}
