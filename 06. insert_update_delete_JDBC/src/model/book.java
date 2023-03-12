package model;

public class book {
	private String bookId;
	private String nameOfBook;
	private double price;
	private int publishedYear;
	
	public book() {
		super();
	}

	public book(String bookId, String nameOfBook, double price, int publishedYear) {
		super();
		this.bookId = bookId;
		this.nameOfBook = nameOfBook;
		this.price = price;
		this.publishedYear = publishedYear;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	
}
