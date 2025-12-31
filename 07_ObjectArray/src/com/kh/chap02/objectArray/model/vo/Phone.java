package com.kh.chap02.objectArray.model.vo;

public class Phone {
	private String name, series, brand;
	private int price;
	
	public Phone() {
		
	}
	
	public Phone(String name, String series, String brand, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.series = series;
	}
	
	public String information() {
		return name+", "+series+", "+brand+", "+price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
