package com.kh.chap01.abstraction;

import com.kh.chap01.abstraction.model.vo.Student;

public class Run {
	/*
	 
	 1. 객체 지향 언어 : 객체를 중심으로 객체 간의 상호작용을 통해 동작하는 프로그래밍 방식
	 
	 2. 객체 (Object) : new 연산자와 클래스를 통해 메모리 (heap)에 할당된 데이터
	 
	 3. 객체 지향 프로그래밍 : 현실에서 독립적인 객체 간의 상호작용을 프로그래밍을 통해
	 코드로 구현하는 과정
	 
	 4. 구현하고자 하는 프로그램 상의 필요한 객체를 만들기 위해선 "클래스" 라는 틀을 먼저
	 만들어야 한다.
	 
	 
	 */
	
	public static void main(String[] args) {
		
		Student kim = new Student();
		
		kim.name = "김지원";
		kim.age = 22;
		kim.height = 173.0;
		
		
		
	}
}
