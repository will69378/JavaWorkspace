package com.kh.practice.numrange.controller;

import java.util.Scanner;

import com.kh.practice.numrange.exception.NumRangeException;
import com.kh.practice.numrange.view.NumberMenu;

public class NumberController {
	
	NumberMenu nm = new NumberMenu();
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1+"은(는) "+num2+"의 배수인가 ? "+nm.checkDouble(num1, num2));
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
	
}
