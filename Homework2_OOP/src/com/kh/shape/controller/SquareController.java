package com.kh.shape.controller;

import com.kh.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	
	public double calcPerimeter(double height, double width) {
		s.setType(2);
		s.setHeight(height);
		s.setWidth(width);
		
		return (2*height)+(2*width);
	}
	
	public double clacArea(double height, double width) {
		s.setType(2);
		s.setHeight(height);
		s.setWidth(width);
		
		return height*width;
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
	}
	
	public String print() {
		
		return s.information();
	}
	
}
