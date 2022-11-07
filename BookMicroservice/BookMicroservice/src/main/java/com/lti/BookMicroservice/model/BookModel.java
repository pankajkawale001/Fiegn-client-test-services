package com.lti.BookMicroservice.model;

public class BookModel {

	private int book_UUID;
	private int bookID;
	private String name;
	private double price;
	
	public BookModel(int book_UUID, int bookID, String name, double price) {
		this.book_UUID = book_UUID;
		this.bookID = bookID;
		this.name = name;
		this.price = price;
	}
	
	public int getBook_UUID() {
		return book_UUID;
	}
	public void setBook_UUID(int book_UUID) {
		this.book_UUID = book_UUID;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
