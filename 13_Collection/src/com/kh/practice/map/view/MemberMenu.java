package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public void mainMenu() {
		for (;;) {
			System.out
					.println("======== KH 사이트 ========\n" + "1. 회원가입\n" + "2. 로그인\n" + "3. 같은 이름 회원 찾기\n" + "9. 종료\n");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			switch (menu) {
			case 1:
				joinMembership();
				break;

			case 2:
				login();
				break;

			case 3:
				sameName();
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}
	}

	public void memberMenu() {
		for (;;) {
			System.out
					.println("======== 회원 메뉴 ========\n" + "1. 비밀번호 바꾸기\n"
			+ "2. 이름 바꾸기\n" + "3. 로그아웃\n");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			switch (menu) {
			case 1:
				changePassword();
				break;
				
			case 2:
				changeName();
				break;
				
			default :
				System.out.println("잘 못 입력. 다시 입력.");
				break;
			}
		}
	}

	public void joinMembership() {
		for (;;) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.nextLine();

			Member jm = new Member(pw, name);
			
			boolean result = mc.joinMembership(id, jm);

			if (result) {
				System.out.println("성공적으로 회원가입");
				mainMenu();
				break;
			} else {
				System.out.println("중복된 아이디입니다.");

			}
		}

	}

	public void login() {
		for(;;) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			
			String pf = mc.logIn(id, pw);
			
			if(pf != null) {
				System.out.println(pf+"님, 환영합니다");
				memberMenu();
				break;
			}
			else {
				System.out.println("틀린 아이디 또는 비밀번호 입니다.");
			}
		}
	}

	public void changePassword() {
		for(;;) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String oldpw = sc.nextLine();
			
			System.out.print("변경할 비밀번호 : ");
			String newpw = sc.nextLine();
			
			boolean pf = mc.changePassword(id, oldpw, newpw);
			
			if(pf) {
				System.out.println("비밀번호 변경에 성공했습니다");
				memberMenu();
				break;
			}
			else {
				System.out.println("비밀번호 변경에 실패. 다시 입력.");
			}
		}
		
	}

	public void changeName() {
		for(;;) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();

			
			String pf = mc.logIn(id, pw);
			if(pf==null) {
				System.out.println("이름 변경에 실패. 다시 입력");
				continue;
			}
			System.out.println(pf);
			
			System.out.print("변경할 이름 : ");
			String newn = sc.nextLine();
			
			mc.changeName(id, newn);
			System.out.println("이름 변경에 성공했습니다");
			memberMenu();
			break;
		}
		
	}

	public void sameName() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		TreeMap<String, String>map = mc.sameName(name);
		Set<Entry<String, String>> entrys = map.entrySet();
		
		for(Entry<String, String> entry : entrys) {
			System.out.println(entry.getValue()+"-"+entry.getKey());
		}
	}
	
}
