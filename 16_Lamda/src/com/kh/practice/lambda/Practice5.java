package com.kh.practice.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

import javax.management.RuntimeErrorException;

public class Practice5 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> op = getOperator("+");
		System.out.println(op.apply(10, 5));
	}

	
	public static BiFunction<Integer, Integer, Integer> getOperator(String type) {
		
		BiFunction<Integer, Integer, Integer> bi = null;
		
		switch (type) {
		//switch문을 람다식으로 작성
		case "+" -> bi = (a, b) -> a + b;
			
		case "-" -> bi = (a, b) -> a - b;	
		
		case "*" -> bi = (a, b) -> a * b;	
		
		case "/" -> bi = (a, b) -> a / b;	
		
		case "%" -> bi = (a, b) -> a % b;	
			
		default ->
			throw new RuntimeErrorException(null,"존재하지 않는 연산자 입니다");
		}
		return bi;
	}
}
