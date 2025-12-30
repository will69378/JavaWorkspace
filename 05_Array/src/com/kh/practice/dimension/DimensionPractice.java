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
		
		
		for(; ;) {
		
		System.out.print("행 크기 : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("열 크기 : ");
		int num2 = sc.nextInt();
		
		if(num1>10 || num1<1 || num2>10 || num2<1) {
			System.out.println("반드시 1~10 사이의 숫자를 입력하세요");
			continue;
		}
		
		char[][] arr = new char[num1][num2];
		

		
		for(int i = 0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				int rd = (int)(Math.random()*26+65);
				arr[i][j] = (char)rd;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}break;
	}
	}
	
	public void practice6(){
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, 
			{"열", "히", "! ", "더", "!! "}};
	
	
		for(int i =0; i<strArr.length; i++) {
			for(int j = 0; j<strArr.length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
	}
	
	public void practice7(){
		int a = 97;
		System.out.print("행 크기 : ");
		int num = sc.nextInt();
		
		char[][] ch = new char[num][];
		
		for(int i = 0; i<num; i++) {
	
			System.out.print(i+"행의 열 크기 : ");
			int size = sc.nextInt();
			
			ch[i] = new char[size];
		}
		
		for(int i = 0; i<ch.length; i++) {
			for(int j = 0; j<ch[i].length; j++) {
				ch[i][j] = (char)a;
				a++;
				System.out.print(ch[i][j]+" ");
			}System.out.println();
		}
		
	}
	
	public void practice8(){
		String [] sArr = {"강건강", "남나나", "도대담", "류라라",
				"문미미", "박보배", "송성실", "윤예의", "진재주", 
				"차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i<arr1.length; i++) {
			
			for(int j = 0; j<arr1[i].length; j++) {
				arr1[i][j] = sArr[num++];
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i<arr2.length; i++) {
			
			for(int j = 0; j<arr2[i].length; j++) {
				arr2[i][j] = sArr[num++];
				System.out.print(arr2[i][j]+" ");
			}System.out.println();
		}
	}
	
	public void practice9(){
		
		String [] sArr = {"강건강", "남나나", "도대담", "류라라",
				"문미미", "박보배", "송성실", "윤예의", "진재주", 
				"차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num = 0;
		String side = null;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i<arr1.length; i++) {
			
			for(int j = 0; j<arr1[i].length; j++) {
				arr1[i][j] = sArr[num++];
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i<arr2.length; i++) {
			
			for(int j = 0; j<arr2[i].length; j++) {
				arr2[i][j] = sArr[num++];
				System.out.print(arr2[i][j]+" ");
			}System.out.println();
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				
				if(arr1[i][j].equals(name)) {
					if(j==0) {
						side = "왼";
					}
					else {
						side = "오른";
					}
					System.out.println("검색하신 "+name+" 학생은 1분단 "
							+ (j+1) +"번째 줄 "+side+"쪽에 있습니다.");
				}
			}
		}
			for(int i = 0; i<arr2.length; i++) {
				for(int j = 0; j<arr2[i].length; j++) {
					
					if(arr2[i][j].equals(name)) {
						if(j==1) {
							side = "오른";
						}
						else {
							side = "왼";
						}
						System.out.println("검색하신 "+name+" 학생은 2분단 "
								+ (j+1) +"번째 줄 "+side+"쪽에 있습니다.");
					}
			
				}
			}
		
	}
	
	
	
	
	
	
	
	
}