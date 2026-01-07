package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {

		for(;;) {
			
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int menuN = sc.nextInt();
			
			if(menuN == 3) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			switch (menuN) {
			case 1:
				tokenMenu();
				break;
				
			case 2:
				inputMenu();
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		
		System.out.println("토큰 처리 전 : "+str);
		System.out.println("토큰 처리 전 : "+str.length());
		
		String result = tc.afterToken(str);
		System.out.println("토큰 처리 후 : "+result);
		System.out.println("토큰 처리 후 : "+result.length());
		System.out.println("대문자 : "+result.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		System.out.println("첫 글자 대문자 : "+tc.firstCap(str));
		
		System.out.print("찾을 문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch+" 문자가 들어간 개수 : "+tc.findChar(str, ch));
	}
	
	
}
