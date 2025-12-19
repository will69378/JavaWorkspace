package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	
	
	public void practice2() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double kr = sc.nextDouble();
		count = count + 1;
		
		System.out.print("¿µ¾î : ");
		double eg = sc.nextDouble();
		count = count + 1;
		
		System.out.print("¼öÇÐ : ");
		double ma = sc.nextDouble();
		count = count + 1;
		
		int sum = (int)(kr + eg + ma);
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + sum/count);
	}
	
}	
