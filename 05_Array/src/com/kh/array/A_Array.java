package com.kh.array;

import java.util.Arrays;

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
	
	public void method3() {
		
		int[] iArr = new int[5];
		
		//배열 값 초기화
		//변수명.length : 배열의 크기를 저장하는 함수
		for(int i = 0; i<5; i++) {
			iArr[i] = i;
		}
	}
	
	public void method4() {
		
		int result = 0;
		String str = null;
		int[] arr = null;
		
		/*
		  null은 모든 참조자료형의 기본값
		  단, 참조 변수가 null을 저장한 상태에서, 주소값이 있어야 수행할 수 있는 
		  행위를 코드로 작성하면 실행 시 에러 발생
		*/
		
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
		
	}
	
	public void method5() {
		
		/*
		 	1. 배열은 한번 지정한 크기를 변경할 수 없다
		 	(크기를 벗어난 인덱스를 실행할 시 에러 발생)
		 	2. 배열의 범위를 넘어서는 값들을 저장하려면 새로운 배열을 생성해야한다
		 	3. 같은 배열명으로 크기가 다른 배열을 할당하면 기존에 있는 값들은 초기화된다
		 	
		 */
		
		int[] arr = new int[5];
		int b = arr.length;
		
		for(int i = 2; i<=10; i+=2) {
			arr[b] = i;
			b++;
			
		}
		for(int i = 4; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void method6() {
		/*
		 	배열의 선언, 할당, 초기화를 한번 수행하는 방법
		 	
		 	1.	int [] arr1 = new int[] {1,2,3,4};
		 		배열명 : arr1 , 배열 크기 : 4 , 배열 각 자리마다 1,2,3,4 초기화까지 완료
		 	
		 	2.	int [] arr2 = {1,2,3,4};
		 		1번과 똑같지만 생략형 더 좋음
 		 */
		
		int [] arr1 = new int[] {1,2,3,4};
		int [] arr2 = {1,2,3,4};
	}
	
	public void method7() {
		String str = "merry";			
		char[] arr = str.toCharArray(); 
		
		/*
		 	문자열을 배열로
		 	
		 	1.  .toCharArray();
		 	{'m','e','r','r','y'} 이런 형태로 저장
		 	
		 	
		 	2. for으로 문자배열 생성하여 옮겨담기
		 	char [] arr2 = new char[str.length()];
		
			for (int i = 0;  i < arr2.length; i++) {
				arr2[i] = str.charAt(i);
			}
		 */
		
		char [] arr2 = new char[str.length()];
		
		for (int i = 0;  i < arr2.length; i++) {
			arr2[i] = str.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr2);
		
		/*
		 	Arrays.toString(배열명); =>배열내부의 값들을 배열 형태로 변환하여
		 							보여주는 매서드
		 	Arrays.toString(arr) =>	ex) [m, e, r, r, y]
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
