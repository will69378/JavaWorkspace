package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.*;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Mother("김지원", 50.0, 70, "출산");
		Person p2 = new Baby("김지원", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat();
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("다음날");
		System.out.println(p1);
		System.out.println(p2);
		
		Basic b1 = new Mother("김지원", 50.0, 70, "출산");
		Basic b2 = new Baby("김지원", 3.5, 70);
		
		b1.eat();
		b2.eat();
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
