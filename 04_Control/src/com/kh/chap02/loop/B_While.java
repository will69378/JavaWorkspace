package com.kh.chap02.loop;

public class B_While {
	
	/*
	 	while문
	 	
	 	[표현법]
	 	
		[초기식] //필수아님
		while(조건식) {
			반복 코드
			[증감식] //필수아님
		}
	 */

	public void method1() {
		int i = 0;
		
		while(i < 5) {
			System.out.println("안녕");
			i++;
		
		}
		
	}
	
	public void method2() {
		int i = 0;
		
		while (i<5) {
			System.out.print(i+1+" ");
			i++;
		}
	}
	
	public void method3() {
		
		int r = (int)(Math.random() * 10 + 1);
		int sum = 0;
		int i = 0;
		
		
		while (i<=r) {
			
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
	public void method4() {
		/*
		 do - while문
		 
		 [표현법]
		 do { 
		 	반복 코드(단, 최초 1회는 무조건 실행)
		 
		 } while(조건식);
		 do-while문은 별도의 조건검사 없이 최초 1회는 무조건 실행됨
		 */
		
		do {
			System.out.println("1회");
		} while(false);
		
	}
	
	public void method5() {
		int i =0;
		
		do {
			System.out.print(i+1+" ");
			i++;
		} while(i<5);
	}
	
}
