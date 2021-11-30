package com.bookstore.www;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class BasketTest {
@Test 
public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
	
	int emptyBasket = 0;
    
	Basket basket = new Basket();
	assertEquals(emptyBasket, basket.getBooksInBasket().size());
	
}

@Test
public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
	
	int oneBook = 1;
	Book awesomeBook = new Book(2.0, "Awesome Book");
	Basket basket = new Basket();
	basket.addBook(awesomeBook);
		
	assertEquals(oneBook, basket.getBooksInBasket().size());
}

@Test
public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithTwoBooks() {
	int twoBooks = 2;
	
	Book book1 = new Book(3.0, "Book 1");
	Book book2 = new Book(3.0, "Book 2");
		
	Basket basket = new Basket();
	
	basket.addBook(book1);
	basket.addBook(book2);
	
		
	assertEquals(twoBooks, basket.getBooksInBasket().size());
}





}
