package com.kh.practice.lambda;

public class Practice4 {
	public static void main(String[] args) {
		
		MyFunction2<String, Integer> printer = (str, num) -> {
			
			String score;
			if(num>=90) {
				score = "A";
			}
			else if(num>=80) {
				score = "B";
			}
			else if (num>=70) {
				score = "C";
			}
			else {
				score = "D";
			}
			System.out.printf("%s님의 점수는 %s학점(%d)입니다\n", str, score, num);
		};
		
		printer.accept("김지원", 96);
		printer.accept("아무개", 77);
	}
	
	@FunctionalInterface
	interface MyFunction2 <K, A> {
		void accept(K k, A a);
	}
}
