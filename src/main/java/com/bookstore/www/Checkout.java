package com.bookstore.www;

import java.util.ArrayList;

public class Checkout {

	public Checkout() {

	}

	public double calculateBill(Basket basket) {

		double price = 0.0;
		double discount = 0.0;
		double discountedBooksPrice = 0.0;
		double regularPriceBooksPrice = 0.0; //not a good variable name

		if (basket.books.size() < 3) {
			for (Book b : basket.books) {
				price += b.getPrice();
			}

		} else if (basket.books.size() == 3) {
			for (Book b : basket.books) {
				price += b.getPrice();
				discount = 0.01;
				double priceCut = price * discount;
				price -= priceCut;

			}
		} else if (basket.books.size() > 3 && basket.books.size() < 10) { // 4, 5, 6, 7, 8, 9
			ArrayList<Book> discountedBooks = new ArrayList<Book>();
			ArrayList<Book> regularPriceBooks = new ArrayList<Book>();

			int counter = 0;

			for (Book book : basket.books) {
				counter++;
				if (counter <= 6) {
					discountedBooks.add(book);

				} else {
					regularPriceBooks.add(book);
				}

			}

			// calculate price of discounted books

			for (Book b : discountedBooks) {
				discountedBooksPrice += b.getPrice(); // 12
				discount = 0.02;
				double priceCut = discountedBooksPrice * discount;
				System.out.println("Price cut: " + priceCut);
				discountedBooksPrice -= priceCut;
				System.out.println(discountedBooksPrice);

			}

			// calculate regular priced books

			for (Book b : regularPriceBooks) {
				regularPriceBooksPrice += b.getPrice();
			}

			price = discountedBooksPrice + regularPriceBooksPrice;
			System.out.println(price);

		}

		return price;
	}

}
