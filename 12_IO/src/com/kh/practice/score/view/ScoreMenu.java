package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	Scanner sc = new Scanner(System.in);

	ScoreController scr = new ScoreController();

	public void mainMenu() {
		
		for (;;) {
			System.out.println("1. 성적 저장\n" + "2. 성적 출력\n" + "9. 끝내기\n");

			System.out.print("메뉴 번호 : ");
			int menuN = sc.nextInt();

			if (menuN == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (menuN == 1) {
				saveScore();
			} else if (menuN == 2) {
				readScore();
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

	public void saveScore() {
		int num = 1;

		for (;;) {
			System.out.println(num+"번째 학생 정보 기록");

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("국어 점수 : ");
			int kc = sc.nextInt();

			System.out.print("영어 점수 : ");
			int ec = sc.nextInt();

			System.out.print("수학 점수 : ");
			int mc = sc.nextInt();

			int sum = kc + ec + mc;

			double avg = sum / 3.0;
			
			scr.saveScore(name, kc, ec, mc, sum, avg);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char nch = sc.next().charAt(0);
			
			if(String.valueOf(nch).toUpperCase().equals("N")) {
				System.out.println("입력 완료");
				break;
			}
			num++;

		}

	}

	public void readScore() {
		int count = 1;
		
		int sumAll = 0;
		
		double avgAll = 0.0;
		
		try(DataInputStream dis = 
				new DataInputStream(new FileInputStream("score.txt"));) {
			
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			for(;;) {
				int sum =0;
				double avg = 0.0;
				System.out.print(dis.readUTF()+"\t");
				for(int i = 0; i<4; i++) {
					if(i==3) {
						sum = dis.readInt();
						sumAll += sum;
						break;
					}
					System.out.print(dis.readInt()+"\t");
					
				}
				avg = dis.readDouble();
				System.out.print(sum+"\t");
				System.out.print(avg+"\t");
				System.out.println();
				count++;
				avgAll += avg;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {			
			System.out.println("읽은 횟수 전체 합계 전체 평균");
			System.out.println(count+"\t"+sumAll+"\t"+ (avgAll / count));
			dis.
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
