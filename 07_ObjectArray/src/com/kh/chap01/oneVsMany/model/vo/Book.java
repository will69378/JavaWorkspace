package com.kh.chap01.oneVsMany.model.vo;

public class Book {
	private String title, author, publisher;
	private int price;

	
	public Book() {
		
	}
	
	public Book(String title,String author,
			String publisher, int price) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String information() {
		
		return title+", "+author+", "+publisher+", "+price;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
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

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
