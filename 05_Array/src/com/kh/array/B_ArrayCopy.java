package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 	배열 복사
	 	
	 	- 얕은 복사 : 배열의 주소 값만을 복사 그래서 복사한 배열의 값을 변경하면
	 	서로 값에 영향을 줌
	 	
	 	- 깊은 복사 : 동일한 새로운 배열을 하나 생성하고 내부의 값들까지 복사함
	 	
	 */
	
	public void method1() {
		
		int[] origin = {1,2,3,4,5};
		
		System.out.println("원본 배열 출력");
		
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		
		int[] copy = origin; //얕은 복사
		
		System.out.println();
		System.out.println("복사 배열 출력");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		//copy배열 수정
		copy[2] = 99;
		
		System.out.println();
		System.out.println("복사 배열 수정본 출력");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("원본 배열 출력");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
	}

	public void method2() {
		
		/*깊은 복사를 수행하는 4가지 방법
		
		1. for문을 활용한 복사
			- 새로운 배열을 생성한 후 각 인덱스 별로 내부 값을 하나씩 대입
			
				int[] origin = {1,2,3,4,5};
		
				int[] copy = new int[origin.length];
		
				for(int i = 0; i<copy.length; i++) {
					copy[i] = origin[i];
				}
			
		2. 새로운 배열 생성 후 System 클래스의 arraycopy를 이용한 복사 ( 가장 효율이 좋음 ) 
			
			
			System.arraycopy(origin, 0, copy, 0, 0);
			System.arraycopy(원본 배열명, 원본 배열의 복사를 시작할 인덱스, 복사본 배열,
							 복사본 배열의 복사를 시작할 인덱스, 복사할 갯수) 

		3. Arrays 클래스의 copyOf 메소드 사용
			
			Arrays.copyOf(원본 배열명, 복사할 갯수);
			복사할 갯수 == 복사본 배열의 크기
			
		4. .clone()을 활용한 복사
			
			배열명.clone(); 인덱스 지정, 복사할 갯수 지정 X
		*/
		
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[origin.length];
		
		for(int i = 0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
	}
	
	public void method3() {
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int [10];
		
		//System.arraycopy(origin, 0, copy, 2, 5);
		//System.arraycopy(origin, 0, copy, 1, 3);
		//System.arraycopy(origin, 2, copy, 1, 3);
		
		System.out.println(Arrays.toString(copy));
						
	}
	
	public void method4() {
		
		int[] origin = {1,2,3,4,5};
		
		int[] copy = Arrays.copyOf(origin, 5);
		
		System.out.println(Arrays.toString(copy));
		
	}
	
	public void method5() {
		int[] origin = {1,2,3,4,5};
		
		int[] copy = origin.clone(); //인덱스 지정, 복사할 갯수 지정 X
		
	}
	
	
	
}
