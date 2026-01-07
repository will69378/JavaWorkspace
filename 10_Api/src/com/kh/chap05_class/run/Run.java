package com.kh.chap05_class.run;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.kh.chap05_class.model.vo.Book;

public class Run {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*
		 Class(Class란 이름의 클래스)
		 	- 자바의 모든  클래스와 인터페이스는 컴파일 완료된 후 class 파일로 생성.
		 	- Class 클래스는 이 클래스 자체의 정보를 가져올 때 사용함 ( 클래스 계의 this )
		 
		 Class 클래스 객체 가져오는 방법
		 	1. Object의 getClass()
		 	
		 	Book b = new Book();
		 	Class c1 = b.getClass(); // Book 클래스의 설계 정보 (.class파일 참조)
		 	
		 	
		 	2. .class 사용
		 	
		 	Class c2 = Book.class;
		 	
		 	
		 	3. Class.forName("풀클래스명") 사용
		 	
		 	Class c3 = Class.forName("com.kh.chap05_class.model.vo.Book");
		 	에러 뜨면 add throws 어쩌고는 임시로 오류 해결해주는 임시방편 클릭하면 해결
		 	
		 	
		 	
		 	
		 	new 키워드 없이 객체 생성하기
		 	Book b1 = (Book) c3.newInstance();
		 	에러 뜨면 위에 와 같이 add throws 어쩌고는 임시로 오류 해결해주는 임시방편 클릭
		 	
		 	
		 	
		 	생성자 정보 가져오기
		 	Constructor[] cons = c3.getConstructors();
			for(Constructor c : cons) {
			System.out.println(c); 
			}
			
			
			
			
			필드 정보 가져오기
			Field[] fields = c3.getFields();
			for(Field f : fields) {
			System.out.println(f);
			}
			
		 	
		 	
		 	
		 	Class 클래스를 활용한 대표적 프로그래밍 : reflection 프로그래밍
		 	Class 클래스를 이용하여 클래스의 정보를 가져오고, 생성자나 메서드를 활용하여 객체를 생성하고,
		 	메서드를 호출하는 방식의 프로그래밍
		 	
		 	보통 프로그램이 실행중일때 객체의 타입을 직접 알 수 없는 경우 Class를 통해 객체를 생성, 객체 내부의
		 	메타 데이터를 수집하기 위해 사용.
		 	
		 	이를 통해 프레임워크 에서는 어노테이션을 이용한 자동화 구조를 설계함. 
		 */
		Run r = new Run();
		
		r.test1();
	}
	

	public void test1() throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		Book b = new Book();
		
		Class c1 = b.getClass(); // Book 클래스의 설계 정보 (.class파일 참조)
		
		Class c2 = Book.class;
		
		Class c3 = Class.forName("com.kh.chap05_class.model.vo.Book");
		
		Book b1 = (Book) c3.newInstance();
		
		Constructor[] cons = c3.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		Field[] fields = c3.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		
	}
	
}
