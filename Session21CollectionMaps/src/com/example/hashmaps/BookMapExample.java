package com.example.hashmaps;

import java.util.HashMap;

public class BookMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Book> bookMap=new HashMap<>();
		// How will you add elements to this one ! 
		Book b = new Book("A", "B",34,12344);
		bookMap.put(1,b);
		Book b2 = new Book("A2", "B2",134,1234);
		bookMap.put(2,b2);
		Book b3 = new Book("A3", "B3",154,4234);
		bookMap.put(2,b3);

		// Get the values
		Book fetch= bookMap.get(2);
		System.out.println("The Book Details are ::"+
				" Book Name :"+fetch.bookName+
				" Author Name :"+fetch.authorName+
				" Price :"+fetch.price+
				" ISBN or Book ID :"+fetch.bookId
				);


	}

}
