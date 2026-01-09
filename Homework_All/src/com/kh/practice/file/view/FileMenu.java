package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {
		System.out.println("***** My Note *****\n" 
				+ "1. 노트 새로 만들기\n" 
				+ "2. 노트 열기\n"
				+ "3. 노트 열어서 수정하기\n" 
				+ "9. 끝내기\n");

		for (;;) {
			System.out.print("메뉴 번호 : ");

			int menuN = sc.nextInt();
			

			if (menuN == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

			else if (menuN == 1) {
				fileSave();
				break;
				
			}
			else if (menuN == 2) {
				fileOpen();
				break;
			}
			
			else if (menuN == 3) {
				fileEdit();
				break;
			}
			
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		}

	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();

		for (;;) {
			System.out.println("ex끝it을 입력할때까지 진행됩니다");
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.print("내용 : ");
			sc.nextLine();
			String fs = sc.nextLine();
			
			if (fs.equals("ex끝it")) {
				System.out.print("저장할 파일 명을 입력해주세요 : ");
				
				String fn = sc.nextLine();

				for (;;) {
					if (fc.checkName(fn) == true) {
						System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
						char ch = sc.next().charAt(0);

						if (String.valueOf(ch).toUpperCase().equals("Y")) {
							fc.fileSave(fn, sb);
							break;
						}
					} else {
						fc.fileSave(fn, sb);
						System.out.println("저장완료");
					}
				}
				
				break;
			}

			sb.append(fs);
			
		}
		System.out.println("저장완료");
		mainMenu();
	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		sc.nextLine();
		String opf = sc.nextLine();

		if (fc.checkName(opf) == true) {
			fc.fileOpen(opf);
		} else {
			System.out.println("없는 파일입니다");
			mainMenu();
		}
	}

	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		sc.nextLine();
		String edf = sc.nextLine();

		if (fc.checkName(edf) == true) {
			for (;;) {
				System.out.println("ex끝it을 입력할때까지 진행됩니다");
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.print("내용 : ");
				sc.nextLine();
				String fs = sc.nextLine();

				if (fs.equals("ex끝it")) {
					break;
				} else {
					System.out.println("없는 파일입니다");
					mainMenu();
				}
			}
		}
	}
}
