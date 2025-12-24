package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	
	
	public void practice2() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kr = sc.nextDouble();
		count = count + 1;
		
		System.out.print("영어 : ");
		double eg = sc.nextDouble();
		count = count + 1;
		
		System.out.print("수학 : ");
		double ma = sc.nextDouble();
		count = count + 1;
		
		int sum = (int)(kr + eg + ma);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/count);
	}
	
}	
