package bookstore.util;

import java.util.HashMap;
import java.util.Map;

import bookstore.domain.Book;

public class Util {

	public static int ERROR_CODE = 1000;
	public static String GET_BOOK_DETAILS_ERROR_MESSAGE = "book reference does not exist";
	
	public static Map<String,Book> books = new HashMap<String, Book>();
	
	static {
		
		
		books.put("12345", new Book("12345", "The big life", "John Doe", "No cover", "the life of some random John Doe"));
		books.put("123456", new Book("123456", "Simply way to heaven", "Suzane Doe", "No cover", "Find your way to heaven"));
		books.put("123457", new Book("123457", "Mokonge 1990", "Mabiala Antonio", "No cover", "An act of survival"));

	}
	
	public static  boolean  validate(String reference) {
		
		return books.containsKey(reference)? true : false;
	}
	
	
	
}
