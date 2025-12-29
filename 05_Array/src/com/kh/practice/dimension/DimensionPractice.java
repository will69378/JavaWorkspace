package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		String[][] arr = new String[3][3];
		int back1 = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = "("+i+", "+j+")";
				
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
	
	public void practice2(){
		int[][] num = new int[4][4];
		int innum = 1;
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				num[i][j] = innum++;
				System.out.print(num[i][j]+" ");
			}System.out.println();
		}
	}
	
	public void practice3(){
		int[][] num = new int[4][4];
		int innum = 16;
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				num[i][j] = innum--;
				System.out.print(num[i][j]+" ");
			}System.out.println();
		}
	}
	
	public void practice4(){
		
		int[][] num = new int[4][4];
		int sum = 0;
		int ssum = 0;
		
		for(int i = 0; i<num.length; i++) {
			
			sum = 0;
			
			for(int j = 0; j<num[i].length; j++) {
				if(i==3 && j == 3) {
					System.out.println(ssum);
					break;
				}
				if(i==3) {
					num[3][j] = num[j][3];
					ssum += num[i][j];
					System.out.print(num[i][j]+" ");
					continue;
				}
				if(j==3) {
					num[i][j] = sum;
					ssum += num[i][j];
					System.out.print(num[i][j]+" ");
					break;
				}
				
				int random = (int)(Math.random()*10+1);
				num[i][j] = random;
				sum += num[i][j];
				System.out.print(num[i][j]+" ");
			}System.out.println();
		}
	}
	public void practice5(){
		
		
		System.out.print("행 크기 : ");
		int num1 = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int num2 = sc.nextInt();
		
		if(num1>10 || num1<1 || num2>10 || num2<1) {
			System.out.println("반드시 1~10 사이의 숫자를 입력하세요");
		}
		
		char[][] arr = new char[num1][num2];
		

		
		for(int i = 0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				int rd = (int)(Math.random()*26+65);
				arr[i][j] = (char)rd;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
