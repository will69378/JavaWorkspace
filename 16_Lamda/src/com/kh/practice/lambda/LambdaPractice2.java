package com.kh.practice.lambda;

public class LambdaPractice2 {
	public static void main(String[] args) {
		Calculator<Integer> adder = (v1 , v2) -> v1 * v2;
			System.out.println(adder.operate(10, 20));
			
			
		Calculator<Integer> findMax = Math::max; 
		//(v1 , v2) -> Math.max(v1, v2) 참조형 메서드로 인해  Math::max으로 줄이기 가능
			System.out.println(findMax.operate(10,20));
		
		
		
		Calculator<String> combiner = (v1, v2) -> v1+"-"+v2;
			System.out.println(combiner);

	}
	
	@FunctionalInterface
	interface Calculator<V> {
		V operate(V v1, V v2);
	}
}
