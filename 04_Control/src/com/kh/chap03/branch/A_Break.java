package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 break : 코드 실행 중 break를 만나면 현재 속해있는 가장 가까운 반목문을 빠져나감
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {	
		for(; ;) {
			int random = (int)(Math.random() *100 +1);
			if(random % 3 == 0) {
				break;
			}
			System.out.println(random);	
		}
	}
	
	public void method2() {
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			
			if(str.equals("exit")) {
				break;
			}
			System.out.println("글자 수 : "+str.length());
			
		}
	}
	
	public void method3() {
		
		
		int sum = 0;
		while(true) {
			System.out.print("입력 : ");
			int i = sc.nextInt();
			
			for(int num = 0; num<=i; num++) {
				sum += num;
			}
			
			if(i>0) {
				System.out.println(sum);
				break;
			} else {
				System.out.println("잘 못 입력");
			}
		}	
	}
	
	public void method4() {
		
		//반복문에 심볼을 정해주고 break로 어떤 반복문을 깰지 정할 수 있게 하는 문장
		
		loop1:
		for (int i = 0; i < 10; i++) {
			loop2:
			for (int j = 0; j < 10; j++) {
				System.out.println(i);
				if(i==5) break loop1;
			}
		}
	}
	
}
