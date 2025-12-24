package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double x = sc.nextDouble();
		
		System.out.print("세로 : ");
		double y = sc.nextDouble();
		
		double z = x*y;
		double q = (x+y)*2;
		
		System.out.println("면적 : " + z);
		System.out.println("둘레 : " + q);
		
	}
}
