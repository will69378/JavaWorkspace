package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	
	FarmController fc = new FarmController();
	
	public void mainMenu() {
		for(;;) {
			System.out.println("====== KH ======\n"
					+ "1. 직원 메뉴\n"
					+ "2. 손님 메뉴\n"
					+ "9. 종료\n");
			System.out.print("메뉴 번혼 선택 : ");
			int mN = sc.nextInt();
			
			if(mN == 9) {
				break;
			}
			
			switch (mN) {
			case 1 :
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;		
				
			default :
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
		
		
	}
	
	public void adminMenu() {
		for(;;) {
			System.out.println("====== 직원 메뉴 ======\n"
					+ "1. 새 농산물 추가\n"
					+ "2. 종류 삭제\n"
					+ "3. 수량 수정\n"
					+ "4. 농산물 목록\n"
					+ "9. 메인으로 돌아가기\n");
			System.out.print("메뉴 번혼 선택 : ");
			int mN = sc.nextInt();
			
			if(mN == 9) {
				mainMenu();
				break;
			}
			
			switch (mN) {
			case 1:
				addNewKind();
				break;
			
			case 2:
				removeKind();
				break;
				
			case 3:
				changeAmount();
				break;
				
			case 4:
				printFarm();
				break;

			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void customerMenu() {
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();
		
		for(;;) {
			System.out.println("====== 직원 메뉴 ======\n"
					+ "1. 농산물 사기\n"
					+ "2. 농산물 빼기\n"
					+ "3. 구입한 농산물 보기\n"
					+ "9. 메인으로 돌아가기\n");
			System.out.print("메뉴 번혼 선택 : ");
			int mN = sc.nextInt();
			
			if(mN == 9) {
				mainMenu();
				break;
			}
			
			switch (mN) {
			case 1:
				buyFarm();
				break;
			
			case 2:
				removeFarm();
				break;
				
			case 3:
				printBuyFarm();
				break;

			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void addNewKind() {
		System.out.println("추가 농산물 선택\n"
				+ "1. 과일\n"
				+ "2. 채소\n"
				+ "3. 견과\n");
		System.out.print("번호 선택 : ");
		int kind = sc.nextInt();
		
		String k = null;
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("수량 : ");
		int hm = sc.nextInt();
		
		switch (kind) {
		case 1:
			k = "과일";
			Farm ank = new Farm(k, name);
			fc.addNewKind(ank, hm);
			break;

		default:
			break;
		}
	}
	
	public void removeKind() {
		
	}
	
	public void changeAmount() {
		
	}
	
	public void printFarm() {
		
	}
	
	public void buyFarm() {
		
	}
	
	public void removeFarm() {
		
	}
	
	public void printBuyFarm() {
		
	}
}
