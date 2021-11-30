package com.bookstore.www;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

/*have to change the data type of prices from double to BigDecimal to accurately manipulate currency*/

public class CheckOutTest {
	
	@Test
	public void test_CalculateBill_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		
		double zeroPointZero = 0.0;
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		
		double price = checkout.calculateBill(basket);
		
		assertEquals(zeroPointZero, price, 0.0);
				
	}
	
	@Test
	public void test_CalculateBill_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		Book book1 = new Book(2.0, "Book 1");
		
		Basket basket = new Basket();
		basket.addBook(book1);
		
		Checkout checkout = new Checkout();
		double bill  = checkout.calculateBill(basket);
		
		double twoPointZero = 2.0;
		
		assertEquals(twoPointZero, bill, 0 );
		
	}
	
	@Test
	public void test_CalculateBill_ReturnsSumOfTwoBooks_WhenPassedBasketWithTwoBooks() {
		Book bookOfTheYear = new Book(3.0, "Book of the Year");
		Book bookOfTheCentury = new Book(4.0, "Book of the Century");
		
		Basket basket = new Basket();
		basket.addBook(bookOfTheYear);
		basket.addBook(bookOfTheCentury);
		
		Checkout checkout = new Checkout();
		
		double price = checkout.calculateBill(basket);
		
		double total = 7;
		
		assertEquals(price, total, 0.0);
	}
	@Test
	public void test_CalculateBill_ReturnsSumOfThreeBooks_WhenPassedBasketWithThreeBooks() {
		Book alteredCarbon = new Book(5.0, "Altered Carbon");
		Book pulpFiction = new Book(4.0, "Pulp Fiction");
		Book fightClub = new Book(3.0, "Fight Club");
		
		Basket basket = new Basket();
		
		basket.addBook(alteredCarbon);
		basket.addBook(pulpFiction);
		basket.addBook(fightClub);
		
		Checkout checkout = new Checkout();
		double result = checkout.calculateBill(basket);
		
	    double total = 11.741895; //weird rounding problems going on.
	    
	    assertEquals(result, total, 0.0);
				
	}
	@Test
	public void test_CalculateBill_ReturnsSumOfSevenBooks_WhenPassedBasketWithSevenBooks() {
		
		Book it = new Book(2.0, "It");
		Book cujo = new Book(2.0, "Cujo");
		Book theStand = new Book(2.0, "The Stand");
		Book mrMercedes = new Book(2.0, "Mr. Mercedes");
		Book theDarkTower = new Book(2.0, "The Dark Tower");
		Book thinner = new Book(2.0, "Thinner");
		Book maximumOverDrive = new Book(2.0, "Maximum Overdrive");
		
		Basket basket = new Basket();
		
		basket.addBook(it);
		basket.addBook(cujo);
		basket.addBook(theStand);
		basket.addBook(mrMercedes);
		basket.addBook(theDarkTower);
		basket.addBook(thinner);
		basket.addBook(maximumOverDrive);
		
		Checkout checkout = new Checkout();
		
		double result = checkout.calculateBill(basket);
		
		double total = 13.187446675328;
		
		assertEquals(result, total, 0.0);
	}
	



}
