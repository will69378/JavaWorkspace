package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	int memberNum = mc.existMemberNum();

	public MemberMenu() {

	}

	public void mainMenu() {
		for (;;) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록 가능한 회원 수는 " + memberNum + "명입니다.");

			if (memberNum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 종료하기");

				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();

				if (num == 1) {
					if (memberNum != MemberController.SIZE) {
						insertMember();
					} else {
						System.out.println("잘못 입력하셨습니다" + "다시 입력해주세요");
					}
				} else if (num == 2) {
					searchMember();
				} else if (num == 3) {
					updateMember();
				} else if (num == 4) {
					deleteMember();
				} else if (num == 5) {
					printAll();
				} else if (num == 9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다" + "다시 입력해주세요");
				}
			} else {
				System.out.println("회원 수 꽉참" + "다시 입력해주세요");
			}
		}
	}

	public void insertMember() {

		System.out.print("아이디 : ");
		String id = sc.next();

		boolean isD = mc.checkId(id);
		if (isD == true) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			insertMember();
			return;
		}

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("비밀번호 : ");
		String pw = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		char gender;

		for (;;) {
			System.out.println("성별 : ");
			gender = sc.next().toUpperCase().charAt(0);
			if ((gender == 'M' || gender == 'F')) {
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, pw, email, gender, age);
	}

	public void searchMember() {
		for (;;) {

			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			if (num == 1) {
				searchId();
			} else if (num == 2) {
				searchName();
			} else if (num == 3) {
				searchEmail();
			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다" + "다시 입력해주세요");
			}

		}

	}

	public void searchId() {
		System.out.println("검색할 아이디 : ");
		String searchId = sc.next();

		String result = mc.searchId(searchId);
		if (result != null) {
			System.out.println("찾으신 회원 조회 결과입니다");
			System.out.println(result);
		} else {
			System.out.println("검색 결과 없음");
		}
	}

	public void searchName() {
		System.out.println("검색할 이름 : ");
		String searchName = sc.next();

		Member[] result = mc.searchName(searchName);
		if (result != null) {
			for(Member m : result) {
				System.out.println("찾으신 회원 조회 결과입니다");
				System.out.println(m);
			}
			
		} else {
			System.out.println("검색 결과 없음");
		}
	}

	public void searchEmail() {
		System.out.println("검색할 이메일 : ");
		String searchEmail = sc.next();

		Member[] result = mc.searchName(searchEmail);
		if (result != null) {
			for(Member m : result) {
				System.out.println("찾으신 이메일 조회 결과입니다");
				System.out.println(m);
			}
			
		} else {
			System.out.println("검색 결과 없음");
		}
	}
	public void updateMember() {
		for (;;) {

			System.out.println("1. 비번 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 이메일 바꾸기");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			if (num == 1) {
				updatePassword();
			} else if (num == 2) {
				updateName();
			} else if (num == 3) {
				updateEmail();
			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다" + "다시 입력해주세요");
			}

		}
	}

	public void updatePassword() {
		System.out.print("수정할 회원 id : ");
		String id = sc.next();
		
		System.out.print("수정할 회원 비밀번호 : ");
		String password = sc.next();
		
		boolean result = mc.updateEmail(id, password);
		if(result) {
			System.out.println("비밀번호 변경 성공");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다");
		}
	}

	public void updateName() {
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.next();
		
		System.out.print("수정할 회원 비번 : ");
		String password = sc.next();
		
		boolean result = mc.updateName(id, password);
		if(result) {
			System.out.println("이름 변경 성공");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다");
		}
	}

	public void updateEmail() {
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.next();
		
		System.out.print("수정할 회원 비번 : ");
		String password = sc.next();
		
		boolean result = mc.updateEmail(id, password);
		if(result) {
			System.out.println("이메일 변경 성공");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다");
		}
	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제");
		System.out.println("2. 전체 회원 삭제");
		System.out.println("9. 끝내기");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			return;
		default :
			System.out.println("다시 입력해주세요");
			return;
		}
	}

	public void deleteOne() {
		
		System.out.print("삭제할 회원 아이디 : ");
		String id = sc.next();
		
		
		System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다");
			return;
		}
		
		boolean result = mc.delete(id);
		if(result ) {
			System.out.println("성공적으로 삭제");
		}
		else {
			System.out.println("존재하지않는 아이디");
		}
	}

	public void deleteAll() {

		System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다");
			return;
		}
		
		mc.delete();
			System.out.println("성공적으로 삭제");

	}

	public void printAll() {
		Member[] m = mc.printAll();
		
		int memberNum = mc.existMemberNum();
		
		if(memberNum == 0) {
			System.out.println("저장된 회원 없음");
			return;
		}
		for (Member num : m) {
			if(num != null) {
				System.out.println(num);
			}
		}
	}

}
