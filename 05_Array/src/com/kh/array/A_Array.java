package com.kh.array;

public class A_Array {
	/*
	 	변수가 하나의 공간에 하나의 값만 저장할 수 있었다면
	 	배열은 하나의 공간에 여러개의 값을 담을 수 있다 대신, 같은 자료형만
	 	
	 		ex) int[] a = new int[3];
	 		
	 	int(4byte) 자료형 값을 담을 수 있는 저장공간 3칸
	 	[0,     0,      0]
	 	arr[0] ,arr[1], arr[2]
	 	
	 	배열에서 저장된 데이터를 꺼낼 때는 "인덱스"를 활용하며 인덱스 값은 0부터 시작하며
	 	배열의 크기가 n이라면, 해당 배열의 마지막 인덱스는 항상 n-1이다.
	 	
	 */
	
	public void method1() {
		/*
		 	배열 선언 
		 	
		 	자료형[] 배열명;
		 	자료형 배열명[];
		 	
		 	이런 형태들로 만들 수 있음
		 */
		
		int a;
		int[] arr;
		int arr2[];
		
		/*
		 	배열 할당 
		 		이 배열에 몇 개의 값들을 보관할건지 그 배열의 크기를 지정해주는 과정
		 		크기를 지정해주면, 지정한 갯수만큼의 저장공간을 가진다.
		 		
		 	[표현법]
		 	
		 	배열명 = new 자료형[배열크기];
		 	
		 */
		
		arr = new int[5]; 
		int[] arr3 = new int[5];
		System.out.println(arr3[0]);
		
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		
		System.out.println(arr3[3]);
		System.out.println(arr3[2]);
		
	}
	
	public void method2() {
		int num = 10;
		int [] iArr = new int[5];
		
		System.out.println("iArr : "+iArr);
		System.out.println("iArr의 HashCode : "+iArr.hashCode()); 
		//중요! 주소값을 10진수로 변경해주는 코드
		
		int [] iArr2 = new int[5];
		System.out.println("iArr2의 HashCode : "+iArr2.hashCode());
		
		int[] iArr3 = iArr2; 
		//iArr3와 iArr2와 같은 저장공간을 공유한다
		//새로운 저장공간은 new를 통해 만들어야지만 생성된다.
	}
	
}
