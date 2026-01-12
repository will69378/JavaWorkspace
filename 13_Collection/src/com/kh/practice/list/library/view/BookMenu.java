package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	
	BookController bc = new BookController();
	
	public void mainMenu() {
		for(;;) {
			System.out.println("== Welcome KH Library");
			
			System.out.println("\n"
					+ "******* 메인 메뉴 *******"
					+ "1. 새 도서 추가"
					+ "2. 도서 전체 조회"
					+ "3. 도서 검색 조회"
					+ "4. 도서 삭제"
					+ "5. 도서 명 오름차순 정렬"
					+ "9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			switch (num) {
			case 1:
				insertBook();
				break;
			
			case 2:
				selectList();
				break;
			
			case 3:
				searchBook();
				break;
				
			case 4:
				deleteBook();
				break;
				
			case 5:
				ascBook();
				break;
				
			default:
				System.out.println("잘 못 입력하였습니다");
				break;
			}
		}
		
	}
	
	public void insertBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		String category = null;
		for(;;) {
			System.out.print("장르 입력받기 : ");
			int cnum = sc.nextInt();
			sc.nextLine();
			
			switch (cnum) {
			case 1:
				category = "인문";
				break;
				
			case 2:
				category = "자연과학";
				break;
			
			case 3:
				category = "의료";
				break;
				
			case 4:
				category = "기타";
				break;
				
			default:
				System.out.println("1~4 사이로 입력하세요");
				return;
			}
			break;
		}
	
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book b = new Book(title, author, category, price);
		bc.insertBook(b);
		System.out.println("생성 성공");
	}
	
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList == null) {
			System.out.println("존재하는 도서가 없습니다");
		}
		else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 도서명 : ");
		String sBook = sc.nextLine();
	}
	
	public void deleteBook() {
		
	}
	
	public void ascBook() {
		
	}
}
