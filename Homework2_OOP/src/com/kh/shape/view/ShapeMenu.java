package com.kh.shape.view;

import java.util.Scanner;

import com.kh.shape.controller.SquareController;
import com.kh.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in) ;

	private SquareController scr = new SquareController();
	
	private TriangleController tc = new TriangleController();
	
	
	public void inputMenu() {
		
		for(; ;) {
			System.out.println(" ===== 도형 프로그램 =====");
			System.out.println("1. 삼각형");
			System.out.println("2. 사각형");
			System.out.println("9. 프로그램 종료");
		
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
		
		
			if(num == 1) {
				triangleMenu();
				break;
			}
			else if(num == 2) {
				squareMenu();
				break;
			}
			else if (num == 9) {
				System.out.println("프로그램을 종료합니다 . ");
				break;
			}
			else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
		
	}
	
	public void triangleMenu() {
		
		for( ; ;) {
			System.out.println(" ===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
		
		
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			
			inputSize(1, num);
				
			if(num==3) {
				printInformation(num);
			}
			
			if (num == 9) {
				System.out.println("메인으로 돌아갑니다. ");
				inputMenu();
				break;
			}
			else if(num<1 || num>3){
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				
			}
		}
		}
	
	public void squareMenu() {
		for(; ;) {
			System.out.println(" ===== 사각형 =====");
		
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
		
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			inputSize(2, num);
			
			if(num==4) {
				printInformation(num);
			}
			
			if (num == 9) {
				System.out.println("메인으로 돌아갑니다. ");
				inputMenu();
				break;
				
			}
			else if(num<1 || num>4){
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		
		}
	}
	
	public void inputSize(int type, int menuNum) {
		if(type == 1 && menuNum == 1) {
			System.out.print("높이 : ");
			double num1 = sc.nextDouble();
			
			System.out.print("너비 : ");
			double num2 = sc.nextDouble();
			
			System.out.println("삼각형의 면적 "+tc.clacArea(num1, num2));
		}
		else if(type == 1 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			
			System.out.println("색이 수정되었습니다.");
			tc.paintColor(color);
		}
		
		
		
		else if(type == 2 && menuNum == 1) {
			System.out.print("높이 : ");
			double num1 = sc.nextDouble();
			
			System.out.print("너비 : ");
			double num2 = sc.nextDouble();
			
			System.out.println("사각형 둘레 : "+scr.calcPerimeter(num1, num2));
			
		}
		
		else if(type == 2 && menuNum == 2) {
			System.out.print("높이 : ");
			double num1 = sc.nextDouble();
			
			System.out.print("너비 : ");
			double num2 = sc.nextDouble();
			
			System.out.println("사각형 면적 : "+ scr.clacArea(num1, num2));
		}
		
		else if(type == 2 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			
			System.out.println("색이 수정되었습니다.");
			scr.paintColor(color);
		}
		else {}
	}
	
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println("삼각형 "+tc.print());
			
		}
		else if(type == 4) {
			System.out.println("사각형 "+scr.print());
			
		}
	}
}
