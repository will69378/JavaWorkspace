package com.kh.chap02_lambda.part04_methodRef;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

/*

람다식의 메서드 참조 ( Method Reference )
	- 메서드 참조는 람다식이 수행하는 일이 어떤 메서드를 그대로 호출하는 것일 때 
	그 메서드의 이름만으로 람다식을 대체하는 문법
	- 기존 람다식 구문을 더욱 간결하게 표현하기 위해 사용하낟
	ex)	  str -> (return str.length(); {
		String::length();
	};
	
	- 람다식을 통해 구현한 기능이 이미 정의되어있는 다른 메서드의 기능을 호출하고
	반환시키거나 출력하거나 단순한 역할을 수행할 때 그 다른 메서드의 이름만 추가시키는 형태로 작성하는 구문
	

메서드 참조의 종류
	1. static 메서드 참조
	2. 일반 메서드 참조
	3. 객체 메서드 참조
	4. 생성자 참조

 */
	public static void main(String[] args) {
		Consumer<String> print;
		print = str -> System.out.println(str);
		print.accept("란녕하세요");
		
		print =	System.out::println;
		print.accept("아자스");
		
		Function<String, Integer> strLength;
		strLength = str -> str.length();
		strLength = String::length;
		
		System.out.println(strLength.apply("무지컬"));
		
		BiFunction<String, String, Boolean> strEquals;
		strEquals = (a, b) -> a.equals(b);
		strEquals = String::equals;
		
		System.out.println(strEquals.apply("샤갈", "샤갈"));
		
		String title = "소나기";
		Predicate<String> equalsToTitle;
		equalsToTitle = (str) -> title.equals(str);
		equalsToTitle = title::equals;
		
		System.out.println(equalsToTitle.test("소나기"));
		
		class Person {
			private String name;
			private int age;
			
			public Person() {
				
			}
			
			public Person(String name) {
				
			}
			
			public Person(String name, int age) {
				
			}
		}
		
		Supplier<Person> personSupplier;
		personSupplier = () -> new Person();
		personSupplier = Person::new;
		BiFunction<String, Integer, Person> personFunction;
		personFunction = (name, age) -> new Person(name, age);
		personFunction = Person::new;
		
	}
}
