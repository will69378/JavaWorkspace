package com.kh.practice.array;

import java.util.Arrays;

public class C_DimensionalArray {
	
	public void method1() {
		/*
		 	2차원 배열 선언
		 	
		행 : 2차원 배열의 크기
		열 : 1차원 배열의 크기
		
		 	
		 	[표현법]
		 	
		 1. 자료형 배열명[행][열];
		 
		 2. 자료형[행] 배열명[열];
		 
		 3. 자료형[행][열] 배열명;
		 	
			
			2차원 배열 할당(크기 지정)
			
		 배열명 = new 자료형[행][열];
		
		
		 	2차원 배열 선언과 동시에 할당
		 	
		 int[][] arr = { {1,2,3,4,5},
		  				 {6,7,8,9,10},
		  				 {11,12,13,14,15} }
		 	
		 int[][] arr = new int[3][5];
                     ||
                     \/	 
		 		[0,0,0,0,0]
		 		[0,0,0,0,0]
		 		[0,0,0,0,0]
		 
		 */
		
		int arr[][] = new int[2][3];
		
		System.out.println(arr);  //2차원 배열의 주소값 
		System.out.println(arr[0]); // 1행의 주소값
		System.out.println(arr[0][0]); // 1행 1열의 값 : 0
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void method2() {
		
		int arr[][] = new int[3][5];
		int num = 1;
		
		for(int a = 0; a<arr.length; a++) {
			
			for(int b = 0; b<arr[a].length; b++) {
				arr[a][b] = num;
				num++;
				
			}
			System.out.println(Arrays.toString(arr[a]));
			
		}
		
	}
	
	public void method3() {
		
		/*
		 	가변 배열
		 	
		 	- 열의 크기가 다른 2차원 배열을 만들 수 있음
		 	
		 	- 행의 크기는 정해져 있으나, 행별 열의 갯수가 정해지지 않은 배열을 의미함
		 	
		 	- 이차원 배열은 1차원 배열을 여러개 묶음으로 관리하는 형태이긴 하지만, 일차원 배열의
		 	크기가 꼭 같을 필요는 없음
		 
		 	
		 */
		
		int[][] arr2 = new int[3][];
		
		System.out.println(arr2); //2차원 배열의 주소값
		System.out.println(arr2[0]); //null
		
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[1];
		
		int value = 1;
		
		for(int a = 0; a<arr2.length; a++) {
			
			for(int b = 0; b<arr2[a].length; b++) {
				arr2[a][b] = value++;
				System.out.print(arr2[a][b]+" ");
				
			}
			System.out.println();
		}
	}
	
	public void method4() {
		
		char[][] ch = new char[3][];
		
		ch[0] = new char[3];
		ch[1] = new char[2];
		ch[2] = new char[4];
		
		int ans = 97;
		
		for(int i = 0; i<ch.length; i++) {
			for(int j = 0; j<ch[i].length; j++) {
				ch[i][j] = (char)ans++;
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
