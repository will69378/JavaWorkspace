package com.kh.practice.lambda;

public class Practice3 {
	public static void main(String[] args) {
		
		MyFunction<String, String> first = String::toUpperCase;
		//메서드 참조로 인한 str -> str.toUpperCase() == String::toUpperCase
		
		MyFunction<String, Boolean> second = str -> str.length()>=5;
			
		MyFunction<String, String> third = str -> {
			String[] arr = str.split(""); 
			// spilt("")은 이어져 있어도 한글자씩으로 분류시킴
			
			StringBuilder sb = new StringBuilder();
			for(String s : arr) {
				sb.append(s).append("-");
			}
			sb.deleteCharAt(sb.length()-1);
			return sb.toString();
		};
		
		System.out.println(third.apply("lambda"));
		
	}
	
	@FunctionalInterface
	interface MyFunction<V, B> {
		B apply(V v);
	}
}
