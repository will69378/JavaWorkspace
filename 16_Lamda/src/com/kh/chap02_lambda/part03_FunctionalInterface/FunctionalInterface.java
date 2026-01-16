package com.kh.chap02_lambda.part03_FunctionalInterface;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
	/*

함수형 인터페이스
	- 람다식을 통해 구현되는 추상메서드를 가지고 있는 인터페이스로 내부에 오직 1개의
	추상메서드만 가지고 있다.
	- 람다식을 사용하기 위해서는 함수형 인터페이스가 필요하다
	
자바의 대표 함수형 인터페이스들
	- 인터페이스			|			추상메서드 : 반환형
1.	Runnable			|			run() : void
2.	Supplier<R>			|			get() : R
3.	Consumer<T>			|			accept(T) : void
4.	Function<T, R>		|			apply(T) : R
5.	Predicate<T>		| 			test(T) : boolean
	...
	
	 */
	
	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i = 0; i<10; i++) {
				System.out.println(new Date());
			}
		};
		r.run();
	//2. Supplier<R>
	//공급역할의 함수 , 매개변수 X, 반환값 O
		Supplier<Long> supplier = () -> {
			return new Date().getTime();
		};
		System.out.println(supplier.get());
		
	//3. Consumer<T>
	//매개변수 O, 반환값 X	
		Consumer<String> con = name -> {
			System.out.println("이름 : "+name);
		};
		con.accept("김지원");

	//4. Function<T,R>
	//매개변수 O, 반환값 O
		Function<String, Integer> function = str -> {
			return str.length();
		};
	
	//5. Predicate<T>
	//매개변수 O, 반환값 boolean
		Predicate<Integer> predicate = num -> {
			return num % 2 == 0;
		};
		System.out.println(predicate.test(100));
		
	}
	
	
}
