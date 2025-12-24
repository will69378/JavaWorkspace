package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i2 = arr.length-1; i2>=0;) {
			System.out.print(arr[i2]+" ");
			i2--;
		}
	}
	
	public void practice2(){
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice3(){
		
		int[] arr = new int[10];
		int r;
		
		for(int i = 0; i<arr.length; i++) {
			r = (int)(Math.random()*10+1);
			arr[i] = r;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String str[] = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"}; 
		
		if(num<0 || num>6) {
			System.out.println("잘못 입력하셨습니다");
		}else {
		System.out.println(str[num]);
		}
	}
	
	public void practice5(){
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		
		int[] arr = new int[num1];
		
		for(int i = 0; i<num1; i++) {
			
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();
			arr[i] = num2;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice6(){
		
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		System.out.print("문자열에 있는 문자 : ");
		int count=0;
		
		for(int i = 0; i<arr.length; i++) {
			char ch = arr[i];
			
			boolean isD = false;
			 //중복이면 true 아니면 false
			for(int j = 0; j<i; j++) {
				if(ch == arr[j]) { //중복인지 확인
					isD = true;
					break;
				}
			
			}
			if(!isD) {
				System.out.print(ch+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
		
	}

	public void practice7(){
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		int[] num = new int[ch.length];
		int count = 0;
		
		System.out.print("문자열 : ");
		char chh = sc.next().charAt(0);
		
		boolean ft = false;
		System.out.print(str+"에 "+chh+"가 존재하는"
				+ " 위치(인덱스) : ");
		for(int i = 0; i<ch.length; i++) {
			num[i] = i;
			if(ch[i] == chh) {
				ft = true;
				count++;
			}
			if(ft == true) {
				System.out.print(num[i] + " ");
				ft=false;
			}
		}
		System.out.println();
		System.out.println(chh+" 개수 : "+count);
		
	}
	
	public void practice8(){
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		
		for(int i = 0; i<arr.length; i++) {
			
			if(i>7) {
				System.out.print("*");
			}
			else {
				System.out.print(arr[i]);
			}
		}
	}
	
	public void practice9() {
		int[] num = new int[10];
		
		int max = 0;
		int min = 10;
		for(int i = 0; i<num.length; i++) {
			int rd = (int)(Math.random()*10+1);
			num[i] = rd;
			
			System.out.print(num[i]+" ");
			
		}
		boolean ft =false;
		for(int i2 = 0; i2<num.length; i2++) {
			
			if(num[i2]>=max) {
				max = num[i2];
			}
			if(num[i2]<=min) {
				min = num[i2];
			}
			
		}
		System.out.println();
		System.out.println("최대 값 : "+max);
		System.out.println("최소 값 : "+min);
	}
	
	public void practice10(){
	
		int[] num = new int[10];
		
		for(int i = 0; i<num.length; i++) {
			int rd = (int)(Math.random()*10+1);
			num[i] = rd;
			for(int j = 0; j<num.length; j++) {
				if(j==i) {
					System.out.print(num[i]+" ");
				}
				else if(num[i]==num[j]) {
					
					i--;
					break;
				}
			} 
		}
	}
	
	public void practice11(){
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		
		
		for(int i = 1; i<arr.length; i++) {
			
			if(num<3 || num%2==0) {
				System.out.println("다시 입력하세요.");
				break;
			}
			
			if((arr.length)/2<i) {
				arr[i-1] = arr[i]-1;
			}
			else {
				arr[i-1] = i;
			}
			System.out.print(arr[i] + " ");
		}
		
	}
	
}
