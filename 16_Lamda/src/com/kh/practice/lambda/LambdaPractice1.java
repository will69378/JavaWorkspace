package com.kh.practice.lambda;

public class LambdaPractice1 {
	public static void main(String[] args) {
		String[] arr = {"java", "lambda", "hi", "functional", "wow"};
		printStrings(arr, str -> str.contains("a") && str.length() % 2 == 0);
		//길이가 3 이하일때만 출력 : str -> str.length()<=3
		//a 포함일때만 출력 : str -> str.contains("a")
		//w 시작일때만 출력 : str -> str.startsWith("w")
		//길이가 짝수면서 a가 포함 : str -> str.contains("a") && str.length() % 2 == 0
	}
	
	public static void printStrings(String[] arr, StringChecker checker) {
		for(String str : arr) {
			if(checker.check(str)) {
				System.out.println(str);
			}
		}
	}
	
	@FunctionalInterface
	interface StringChecker {
		boolean check(String str) ;
	}
}
