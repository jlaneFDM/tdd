package com.bookstore.www;

public class Book {

	private double price;
	private String title;

	public Book(double d, String title) {
		this.price = d;
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
