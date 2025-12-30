package com.kh.shape.controller;

import com.kh.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	
	public double clacArea(double height, double width) {
		s.setType(1);
		s.setHeight(height);
		s.setWidth(width);
		
		return (height*width) / 2;
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
	}
	
	public String print() {
		
		return s.information();
	}
}
