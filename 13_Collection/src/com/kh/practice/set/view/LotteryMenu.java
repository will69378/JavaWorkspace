package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("***** 메인 메뉴 *****\n"
				+ "1. 추첨 대상 추가\n"
				+ "2. 추첨 대상 삭제\n"
				+ "3. 당첨 대상 확인\n"
				+ "4. 정렬된 당첨 대상 확인\n"
				+ "5. 당첨 대상 검색\n"
				+ "9. 종료\n");
		System.out.print("메뉴 번호 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch (menu) {
		case 9:
			System.out.println("프로그램 종료.");
			return;
			
		case 1:
			insertObject();
			break;
		
		case 2:
			deleteObject();
			break;
			
		case 3:
			winObject();
			break;
			
		case 4:
			sortedWinObject();
			break;
			
		case 5:
			searchWinner();
			break;

		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			return;
		}
	}
	
	public void insertObject() {
		
		System.out.print("추첨 대상 수 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<size; i++) {
			System.out.print("추첨자 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("추첨자 핸드폰 번호 : ");
			String phone = sc.nextLine();
			
			Lottery chest = new Lottery(name, phone);
			
			if(lc.insertObject(chest)) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
			else {
				System.out.println("추가 완료되었습니다");
			}
		}
		mainMenu();
	}
	
	public void deleteObject() {
		System.out.print("삭제할 추첨자 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("삭제할 추첨자 핸드폰 번호 : ");
		String phone = sc.nextLine();
		
		Lottery chest = new Lottery(name, phone);
		
		if(lc.deleteObject(chest)) {
			System.out.println("삭제 완료.");
		}
		else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void winObject() {
		Set<Lottery> s = lc.winObject();
		System.out.println(s.toString());
	}
	
	public void sortedWinObject() {
		TreeSet<Lottery> set = lc.sortedWinObject();
		
		Iterator<Lottery> l = set.iterator();
		
		while (l.hasNext()) {
			System.out.println(l.next());
			
		}
	}
	
	public void searchWinner() {
		System.out.print("삭제할 추첨자 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("삭제할 추첨자 핸드폰 번호 : ");
		String phone = sc.nextLine();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);
		
		if(result) {
			System.out.println("축하");
		}
		else {
			System.out.println("없음");
		}
	}
	
}
