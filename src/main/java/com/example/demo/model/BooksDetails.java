package com.example.demo.model;

public class BooksDetails {

	private int bookId;
	private int quantity;
	
	private int bookPrice;
	private String bookSubject;
	private String bookPic;
	
	
	
	public BooksDetails() {
		super();
	}
	
	public BooksDetails(int bookId) {
		super();
		this.bookId = bookId;
	}
	public BooksDetails(int bookId, int quantity) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
	}
	
	

	public BooksDetails(int bookId, int quantity, int bookPrice, String bookSubject, String bookPic) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.bookPrice = bookPrice;
		this.bookSubject = bookSubject;
		this.bookPic = bookPic;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String getBookSubject() {
		return bookSubject;
	}


	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}


	public String getBookPic() {
		return bookPic;
	}


	public void setBookPic(String bookPic) {
		this.bookPic = bookPic;
	}

	@Override
	public String toString() {
		return "BooksDetails [bookId=" + bookId + ", quantity=" + quantity + ", bookPrice=" + bookPrice
				+ ", bookSubject=" + bookSubject + ", bookPic=" + bookPic + "]";
	}


	
	
	
	
}
