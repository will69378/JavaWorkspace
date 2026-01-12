package com.kh.practice.list.music.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.music.model.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public void mainMenu() {
		for (;;) {
			System.out.println("******* 메인 메뉴 *******\n" + "1. 마지막 위치에 곡 추가\n" + "2. 첫 위치에 곡 추가\n" + "3. 전체 곡 목록 출력\n"
					+ "4. 특정 곡 검색\n" + "5. 특정 곡 삭제\n" + "6. 특정 곡 정보 수정\n" + "7. 곡명 오름차순 정렬\n" + "8. 가수명 내림차순 정렬\n"
					+ "9. 종료\n");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			if (num == 9) {
				System.out.println("프로그램 종료합니다");
				break;
			}

			switch (num) {
			case 1:
				addList();
				break;

			case 2:
				addAtZero();
				break;

			case 3:
				printAll();
				break;

			case 4:
				searchMusic();
				break;

			case 5:
				removeMusic();
				break;

			case 6:
				setMusic();
				break;

			case 7:
				ascTitle();
				break;

			case 8:
				descSinger();
				break;

			default:
				System.out.println("잘못 입력했습니다");
				break;
			}

		}
	}

	public void addList() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();

		System.out.print("가수 명 : ");
		String name = sc.nextLine();

		mc.addList(new Music(title, name));
	}

	public void addAtZero() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();

		System.out.print("가수 명 : ");
		String name = sc.nextLine();

		try {
			mc.addAtZero(new Music(title, name));
		} catch (RuntimeException e) {
			System.out.println("추가 실패");
		}
		System.out.println("추가 성공");
	}

	public void printAll() {
		System.out.println(mc.printAll());
	}

	public void searchMusic() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);

		if (m == null) {
			System.out.println("검색한 곡이 없습니다");
		} else {
			System.out.println("검색한 곡은 " + m.toString() + " 입니다");
		}
	}

	public void removeMusic() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);

		if (m == null) {
			System.out.println("삭제할 곡이 없습니다");
		} else {
			System.out.println(m.toString() + "을 삭제했습니다");
		}
	}

	public void setMusic() {
		System.out.print("수정할 곡명 : ");
		String edittitle = sc.nextLine();

		System.out.print("곡명 : ");
		String title = sc.nextLine();

		System.out.print("가수 명 : ");
		String name = sc.nextLine();
		Music m = mc.setMusic(edittitle, new Music(title, name));

		if (m == null) {
			System.out.println("수정할 곡이 없습니다");
		} else {
			System.out.println(m.toString() + "의 값이 변경 되었습니다");
		}
	}

	public void ascTitle() {
		int i = mc.ascTitle();
		if (i == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}

	public void descSinger() {
		int i = mc.descSinger();
		if (i == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}

}
