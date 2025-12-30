package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		
		Book bk1 = new Book();
		bk1.inform();
		
		System.out.println();
		Book bk2 = new Book("김지원1", "김지원2", "김지원3");
		bk2.inform();
		
		System.out.println();
		Book bk3 = new Book("김지원1", "김지원2", "김지원3", 30000, 20.0);
		bk3.inform();
		
	}
}	
