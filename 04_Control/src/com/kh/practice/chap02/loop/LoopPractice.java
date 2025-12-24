package com.kh.practice.chap02.loop;

import java.util.Iterator;
import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.println("1이상의 숫자를 입력 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = 1; i <= num; i++) {
				
				System.out.println(i);
			}
		}
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = 0; i<num; i++) {
				System.out.println(num-i);
				if(num-i==0) {
					continue;
				}
			}
		}
	}
	
	public void practice3() {
		int sum = 0;
		
		System.out.print("정수 하나를 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<num; i++) {
			sum += i;
			System.out.print(i+" + ");
			if (i+1 == num) {
				sum += num;
				System.out.print(i + 1);
				System.out.println(" = "+sum);
			}
		}
	}

	public void practice4(){
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		}
		if(num1 >= num2) {
			for(int i = num2; i<num1; i++) {
				System.out.print(i+" ");
			}
			System.out.println(num1);
		} else if(num2 >= num1) {
			for(int i = num1; i<num2; i++) {
				System.out.print(i+" ");
			}
			System.out.print(num2);
		}
	}
	
	public void practice5(){
		
		System.out.print("숫자 : ");
		int num1 = sc.nextInt();
		
		if(num1>9) {
			System.out.println("9 이하의 숫자를 입력해주세요");
		}
		for(int i = num1; i<10; i++) {
			System.out.print("==== "+i+" ====");
			System.out.println();
			for(int i2 = 1; i2 < 10; i2++) {
				System.out.println(i + " X " + i2 +" = " + i*i2);
			}
		}
	}
	
	public void practice6(){
		
		System.out.print("시작 숫자 : ");
		int snum = sc.nextInt();
		
		System.out.print("공차 : ");
		int spnum = sc.nextInt();
		
		int sum = snum;
		
		for(int i =0; i<10; i++) {
				System.out.print(sum+" ");
				sum += spnum;
			}
		
	}

	public void practice7() {
		
		
		
		
		while(true) {
			System.out.print("연산자 : ");
			String str = sc.next();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("숫자 : ");
			int num2 = sc.nextInt();
			
			
			if(str.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				break;
			}
			switch(str) {
			case "+":
				System.out.println(num1+num2);
				break;
			case "-":
				System.out.println(num1-num2);
				break;
			case "*":
				System.out.println(num1*num2);
				break;
			case "/":
				System.out.println(num1/num2);
				break;
			case "%":
				System.out.println(num1%num2);
				break;
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void practice8(){
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int i2 = 0; i2<i;) {
				System.out.print("*");
				i2++;
			}
			System.out.println();
		}
	}
	
	public void practice9(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int i2 = num; i2>=i;) {
				System.out.print("*");
				i2--;
			}
			System.out.println();
		}
	}
	
	public void practice10(){
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int count = 0;
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		for(int i = 2; i<num; i++) {
						
			if(num % i == 0) {
				count += 1;
			}
			
		}
		if(count == 0) {
			System.out.println("소수 입니다");

		}
		else if(count < 0) {
			System.out.println("소수가 아닙니다");

		}
	}
	
	public void practice11(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int total = 0; // 소수총개수
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		for(int j = 2; j<=num;j++) {
			int count = 0; //약수 갯수
			for(int i = 2; i<j; i++) { 
				if(j % i == 0) {
					count++ ;
					break;
				}
			}
			if(count == 0) {
				total++;
				System.out.print(j+" ");
			}
		}
		System.out.println();
		System.out.println("2부터 "+num+"까지 소수의 개수는 "+total+"개입니다.");
	
	}
	
	public void practice12(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i<=num; i+=1) {
			
			if(i%6==0) {
				System.out.print(i+" ");
				count++;
			}
			else if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
			
			
		}	
		System.out.println();
		System.out.println("count : "+count);
		
	}
}
