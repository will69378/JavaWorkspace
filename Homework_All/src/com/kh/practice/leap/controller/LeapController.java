package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		boolean ly = false;
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			
			ly = true;
		}
		else {
			ly = false;
		}
		return ly;
	}
	
	public long leapDate(Calendar c) {
		Calendar last = c;
		Calendar start = new GregorianCalendar(1, 0, 1);
		
		long l1 = last.getTimeInMillis();
		long l2 = start.getTimeInMillis();
		
		long result = (l1-l2) / 1000 / 60 / 60 / 24  ;
		
		for (int i = 1; i < last.YEAR; i++) {
			if(isLeapYear(i)== true) {

				result++;
			}
		}
		return result;
	}
}
