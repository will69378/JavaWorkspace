package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
		for(;;) {
			System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE
				+"명입니다.");
			System.out.println("현재 등록 가능한 회원 수는"+
				mc.existMemberNum()+"명입니다.");
		
			if(mc.existMemberNum()<10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 종료하기");
			
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				
				if(num == 1) {
					insertMember();
				}
				else if(num==2) {
					searchMember();
				}
				else if(num==3) {
					updateMember();
				}
				else if(num==4) {
					deleteMember();
				}
				else if(num==5) {
					printAll();
				}
				else if(num==9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else { 
					System.out.println("잘못 입력하셨습니다"
							+ "다시 입력해주세요");
				}
			}else { 
				System.out.println("잘못 입력하셨습니다"
						+ "다시 입력해주세요");
			}
		}
	}
	
	public void insertMember() {
	
			System.out.print("아이디 : ");
			String id = sc.next();
			
			for(;;) {
				
				
				if(mc.checkId(id)==true) {
					System.out.println("중복입니다"
						+ "다시 입력해주세요");
					System.out.print("아이디 : ");
					id = sc.next();
					continue;
				}
				else {
					
					break;
				}
				
			}
		
			System.out.print("이름 : ");
			String name = sc.next();
		
			System.out.print("비밀번호 : ");
			String pw = sc.next();
		
			System.out.print("이메일 : ");
			String email = sc.next();
		
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			for(;;) {
				if(!(gender == 'm' || gender == 'M'
						|| gender == 'f' || gender == 'F')) {
						System.out.println("다시 입력하세요");
						System.out.print("성별 : ");
						gender = sc.next().charAt(0);
						continue;
				}
				else {
					break;
				}
			}
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			mc.insertMember(id, name, pw,
				email, gender, age);
	}
		
	
	public void searchMember() {
		for(;;) {
			System.out.println("최대 등록 가능한 회원 수는 "+mc.SIZE
				+"명입니다.");
			System.out.println("현재 등록 가능한 회원 수는"+
				mc.existMemberNum()+"명입니다.");
		
			if(mc.existMemberNum()<10) {
				System.out.println("1. 아이디로 검색하기");
				System.out.println("2. 이름으로 검색하기");
				System.out.println("3. 이메일로 검색하기");
				System.out.println("9. 끝내기");
			
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				
				if(num == 1) {
					searchId();
				}
				else if(num==2) {
					searchName();
				}
				else if(num==3) {
					searchEmail();
				}
				else if(num==9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else { 
					System.out.println("잘못 입력하셨습니다"
							+ "다시 입력해주세요");
				}
				
			}else { 
				System.out.println("잘못 입력하셨습니다"
						+ "다시 입력해주세요");
			}
		}
				
	}
	
	public void searchId() {
		
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void updatePassword() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
	
}
