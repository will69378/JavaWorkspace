package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ArrayForeach {
	
	public static void main(String[] args) {
		int [] arr = {10, 20, 30};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println( arr[i]);
		}
		/*
		 
		 for each문
		 
		 초기식, 조건식, 증감식이 없음
		 반복 횟수는 배열의 크기
		 
		 	- 배열 또는 컬렉션과 함께 사용되는 반복문으로, 배열 또는 컬렉션의
		 	  0번 인덱스부터, 마지막 인덱스까지 순차적으로 접근할 때 사용
		 	  
		 [표현법]
		 for(순차적으로 접근할 값을 담을 변수 : 배열명 ) {
		 
		 
		 }
		 
		 */
		
		int[] arr2 = {10,20,30};
		
		for(int i : arr2) {
			System.out.println(i);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("갤럭시", "삼성", "노트25", 10000);
		phones[1] = new Phone("아이폰", "애플", "11프로", 30000);
		phones[2] = new Phone("아이폰", "애플", "10프로", 20000);
		
		int sum = 0;
		for(Phone i : phones) {
			
			sum += i.getPrice();
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
