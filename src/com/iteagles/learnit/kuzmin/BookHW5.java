package com.iteagles.learnit.kuzmin;

import java.util.ArrayList;
import java.util.List;

/**
 * Homework5 - Book 
 * 
 * @author Den
 *
 */

public class BookHW5 {

	public static void main(String[] args) {
		   List <Book> books = array();
	        System.out.println("List books by given author: ");
	        booksByGivenAuthor(books , "Joanne Rowling" );
	        System.out.println("List books published: ");
	        booksPublished( books, "Terra Fantastica");
	        System.out.println("List books released after year: ");
	        booksReleasedAfterYear(books, 1953);

	}

	private static List<Book> array() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(0, "Harry Potter and the Philosopher's Stone", "Joanne Rowling", "Bloomsbury Publishing",
				1997, 15, 432, "Hardcover"));
		books.add(new Book(1, "The Fellowship of the Ring", "John Ronald Reuel Tolkien", "George Allen & Unwin", 1954,
				20, 488, "Hardcover"));
		books.add(new Book(2, "Witcher The Last Wish", "Andrzej Sapkowski", "Terra Fantastica", 1986, 15, 318,
				"Hardcover"));
		books.add(new Book(3, "The Two Towers", "John Ronald Reuel Tolkien", "George Allen & Unwin", 1954, 22, 454,
				"Hardcover"));
		books.add(new Book(4, "The War of the World", "Herbert Wells", "Heinemann", 1897, 20, 437, "Hardcover"));
		books.add(new Book(5, "Harry Potter and the Chamber of Secrets", "Joanne Rowling", "Bloomsbury Publishing",
				1998, 18, 480, "Hardcover"));
		books.add(new Book(6, "The Return of the King", "John Ronald Reuel Tolkien", "George Allen & Unwin", 1955, 20,
				448, "Hardcover"));
		return books;
	}

	private static void booksByGivenAuthor(List<Book> books , String author) {
		for (Book theAuthor : books) {
			if (author.equals(theAuthor.getAuthor())) {
				System.out.println(theAuthor);
			}
		}
	}

	private static void booksPublished(List<Book> books, String publisher) {
		for (Book bookPublished : books) {
			if (publisher.equals(bookPublished.getPublisher())) {
				System.out.println(bookPublished);
			}
		}
	}

	private static void booksReleasedAfterYear(List<Book> books, int yearOfPublication) {
		for (Book booksReleased : books) {
			if (yearOfPublication < booksReleased.getYearOfPublication()) {
				System.out.println(booksReleased);
			}
		}
	}
}
