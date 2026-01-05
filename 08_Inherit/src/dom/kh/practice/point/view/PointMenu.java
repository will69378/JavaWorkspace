package dom.kh.practice.point.view;

import java.util.Scanner;

import dom.kh.practice.point.controller.CircleController;
import dom.kh.practice.point.controller.RectangleController;
import dom.kh.practice.point.model.vo.Rectangle;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);

	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			circleMenu();
			break;
		case 2:
			Rectangl
		case 9:
			System.out.println("종료되었습니다");
			break;

		default:
			System.out.println("잘 못 입력 하셨습니다");
			return;
		}
	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			calcCircum();
			break;
			
		case 2:
			calcCircleArea();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다");
			mainMenu();
			break;
		default:
			System.out.println("잘 못 입력 하셨습니다");
			return;
		}
	}
	
	public void RectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			calcPerimeter();
			break;
			
		case 2:
			calcRectArea();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다");
			mainMenu();
			break;
		default:
			System.out.println("잘 못 입력 하셨습니다");
			return;
		}
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int valX = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int valY = sc.nextInt();
		
		System.out.print("반지름 : ");
		int valR = sc.nextInt();
		
		System.out.println(cc.calcCircum(valX, valY, valR));
	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int valX = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int valY = sc.nextInt();
		
		System.out.print("반지름 : ");
		int valR = sc.nextInt();
		
		System.out.println(cc.calcArea(valX, valY, valR));
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int valX = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int valY = sc.nextInt();
		
		System.out.print("높이 : ");
		int valH = sc.nextInt();
		
		System.out.print("넓이 : ");
		int valW = sc.nextInt();
		
		System.out.println(rc.calcPerimeter
				(valX, valY, valH, valW));
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int valX = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int valY = sc.nextInt();
		
		System.out.print("높이 : ");
		int valH = sc.nextInt();
		
		System.out.print("넓이 : ");
		int valW = sc.nextInt();
		
		System.out.println(rc.calcArea
				(valX, valY, valH, valW));
	}
}
