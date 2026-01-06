package com.kh.practice.chap01_ploy.view;

import java.util.Scanner;

import com.kh.practice.chap01_ploy.controller.LibraryController;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		for (;;) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");

			System.out.print("메뉴 번호 : ");
			int menuN = sc.nextInt();

			if (menuN == 9) {
				break;
			}

			switch (menuN) {
			case 1:
				lc.myInfo();
				break;

			case 2:
				selectAll();
				break;

			case 3:
				searchBook();
				break;

			case 4:
				rentBook();
				break;

			default:
				System.out.println("다시 입력하세요");
				return;
			}
		}
	}

	public void selectAll() {
		for (int i = 0; i < lc.selectAll().length; i++) {
			System.out.print(i+"번 도서 : "+lc.selectAll()[i]);
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		System.out.println(lc.searchBook(keyword));;
		
	}

	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택");
		int index = sc.nextInt();
		
		
		switch (lc.rentBook(index)) {
		case 0:
			System.out.println("대여 성공");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가");
			break;
		case 2: 
			System.out.println("대여 성공."
					+ " 요리 쿠폰은 마이페이지 확인 가능");
			break;
		default:
			System.out.println("다시 입력하세요");
			break;
		}
	}

}
