package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	
	private BookController bc = new BookController();
	
	private Book[] bArr =null;
		
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu() {
		System.out.println("1. 도서 추가 저장\n"
						+ "2. 저장 도서 출력\n"
						+ "9. 프로그램 끝내기");
	
		for(;;) {
			System.out.print("메뉴 번호 : ");
			int num = sc. nextInt();
			
			if(num == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else if(num == 1) {
				fileSave();
				break;
			}
			else if(num == 2) {
				fileRead();
				break;
			}
			else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		System.out.print("도서 명 : ");
		String title = sc.next();
		
		System.out.print("저자 명 : ");
		String author = sc.next();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.next();
		String[] d = date.split("-");
		
		int year, month, day;
		
		year = Integer.parseInt(d[0]);
		month = Integer.parseInt(d[1])-1;
		day = Integer.parseInt(d[2]);
		
		Calendar c = new GregorianCalendar(year, month, day);
		
		System.out.print("할인율 : ");
		double p = sc.nextDouble();
		
		Book b = new Book(title, author, price, c, p);
		
		for (int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = b;
				
				break;
			}
		}
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		Book[] bArr = bc.fileRead();
		
		for(Book b : bArr) {
			if(b!=null) {
				System.out.println(b);
			}
		}
	}
	
}
