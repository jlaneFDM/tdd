package com.bookstore.www;

import java.util.ArrayList;


public class Basket {
	public  ArrayList<Book> books;

	public Basket() {
		books = new ArrayList<Book>();
	}
	public void addBook(Book book) {
	 
	  books.add(book);
	  
	}
	
	public ArrayList<Book> getBooksInBasket(){
		return books;
		
	}
}
