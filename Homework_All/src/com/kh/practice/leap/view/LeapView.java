package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	Scanner sc = new Scanner(System.in);
	LeapController lc = new LeapController();
	
	public LeapView() {
		
		System.out.print("궁금한 년도 : ");
		int year = sc.nextInt();
		
		Calendar c = new GregorianCalendar(year, 0, 1);
		boolean check = lc.isLeapYear(year);
		
		if(check==true) {
			System.out.println(year+"년은 윤년입니다.");
			System.out.println("총 날짜 수 : "+lc.leapDate(c));
		}
		else {
			System.out.println(year+"년은 평년입니다.");
			System.out.println("총 날짜 수 : "+lc.leapDate(c));
		}
		
	}
}
