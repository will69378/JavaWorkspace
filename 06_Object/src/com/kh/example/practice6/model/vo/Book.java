package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title, publisher, author;
	private int price;
	private double discountrate;
	
	public Book() {
		 	
	}
	
	public Book(String title,String publisher, String author) {
		this.author = author;
		this.publisher = publisher;
		this.title = title;
	}
	
	public Book(String title,String publisher, 
			String author, int price, double discountrate) {
		this(title, publisher, author);
		this.price = price;
		this.discountrate = discountrate;
	}
	
	public void inform() {
		System.out.println("제목 : "+title);
		System.out.println("출판사 : "+publisher);
		System.out.println("작가 : "+author);
		System.out.println("가격 : "+price);
		System.out.println("할인율 : "+discountrate);
	}
	
}
