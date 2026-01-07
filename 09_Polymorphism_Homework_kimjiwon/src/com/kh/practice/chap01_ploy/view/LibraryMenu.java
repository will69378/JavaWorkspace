package com.kh.practice.chap01_ploy.view;

import java.util.Scanner;

import com.kh.practice.chap01_ploy.controller.LibraryController;
import com.kh.practice.chap01_ploy.model.vo.Book;
import com.kh.practice.chap01_ploy.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member m = new Member(name, age, gender, 0);
		
		lc.insertMember(m);
		int menuN;
		for (;;) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");

			System.out.print("메뉴 번호 : ");
			menuN = sc.nextInt();

			if (menuN == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

			switch (menuN) {
			case 1:
				System.out.println(lc.myInfo());
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
				break;
			}
		}
	}

	public void selectAll() {
		for (int i = 0; i < lc.selectAll().length; i++) {
			System.out.println(i+"번 도서 : "+lc.selectAll()[i]);
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		
		for(Book b : lc.searchBook(keyword)) {
			if(b!=null) {
				System.out.println(b);
			}
		}
	}

	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int rent = sc.nextInt();
		
		
		switch (lc.rentBook(rent)) {
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
