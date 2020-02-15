package com.iteagles.learnit.kuzmin;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private int yearOfPublication;
	private int numberOfPages;
	private int price;
	private String typeOfBinding;

	public Book(int id, String title, String author, String publisher, int yearOfPublication, int numberOfPages,
			int price, String typeOfBinding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typeOfBinding = typeOfBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
	   public String toString() {
	    	final StringBuilder sb = new StringBuilder("Book");
	    	sb.append(" id = ").append(id);
	        sb.append(", title = ").append(title);
	        sb.append(", author =").append(author);
	        sb.append(", publisher =").append(publisher);
	        sb.append(", yearOfPublication =").append(yearOfPublication);
	        sb.append(", numberOfPages =").append(numberOfPages);
	        sb.append(", price =").append(price);
	        sb.append(", typeOfBinding =").append(typeOfBinding);
	        return sb.toString();
	    }
}
