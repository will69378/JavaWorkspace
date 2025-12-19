package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		int sum = first + second;
		int min = first - second;
		int xnum = first*second;
		int mnum = first/second;
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + min);
		System.out.println("곱하기 결과 : " + xnum);
		System.out.println("나누기 결과 : " + mnum);
	}
	
}
