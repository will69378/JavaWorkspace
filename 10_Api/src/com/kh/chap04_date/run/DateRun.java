package com.kh.chap04_date.run;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRun {
	public static void main(String[] args) {
		
		/*
		 Calendar
		 
		 	- 날짜와 시간에 대한 데이터를 처리하는 "추상 클래스"
		
		선언 방법 
		Calendar call = new GregorianCalendar();
		Calendar call2 = Calendar.getInstance();
		
		java.util.Date 클래스
			
			- 날짜와 시간에 대한 정보를 담을 수 있는 클래스
			- 자바 개발 초기에 만들어진 완성도가 낮은 클래스
			하지만 많이 사용됨
		
		Date today = new Date();
		내가 입력한 년도에 +1900이 되기에 1900을 빼거나 그거 맞춰서 쓴다.
		Date date1 = new Date(2025-1900, 6-1, 19, 19, 0, 0);
		
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		String formatDate = sdf.format(new Date());
		
		컴퓨터에 있는 시간을 그대로 초기화해주는 메서드
		
		
		숫자값 형식 지정
		
		DecimalFormat
		
		# : 해당 자리에 데이터가 없는 경우 생략
		0 : 해당 자리에 데이터가 없는 경우 0으로 표시
		
				double num = 1234567890.123;
			DecimalFormat df = new DecimalFormat("#,###"); 출력 결과 : 1, 234, 567, 890
			df.applyPattern("#.00000"); 출력 결과 :1234567890.12300
			  
		 */
	
		test5();
	}	
		
		
	public static void test1() {
		
		Calendar call = new GregorianCalendar();
		Calendar call2 = Calendar.getInstance();
		
		System.out.println(call);
	
		
		System.out.println(call.get(Calendar.YEAR));
		System.out.println(call.get(Calendar.MONTH)+1);
		
		System.out.println(call.get(Calendar.DATE));
		
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
		
		printCalendar(call);
	}
	
	public static void test2() {
		Calendar cal1 = Calendar.getInstance();
		
		cal1.set(2027, 0, 1, 0, 0, 0);
		
		printCalendar(cal1);
		
		Calendar cal2 = new GregorianCalendar(2027, 0, 1, 0, 0, 0);
		printCalendar(cal2);
		
		Calendar now = Calendar.getInstance();
		Calendar dDay = new GregorianCalendar(2026, 0, 27);
		
		long num1 = now.getTimeInMillis();
		long num2 = dDay.getTimeInMillis();
		long result = (num2 - num1) / 1000 / 60 / 60 / 24;
		System.out.println(result);
	}
	
	public static void test3() {
		Date today = new Date();
		
		System.out.println("기본생성자 : "+today);
		Date date1 = new Date(2025-1900, 6-1, 19, 19, 0, 0);
		System.out.println("매개 변수 생성자 : "+date1);
		
		Calendar cal2 = new GregorianCalendar(2025, 5, 19);
		long millis = cal2.getTimeInMillis();
		Date date2 = new Date(millis);
		System.out.println("밀리세컨즈 생성자 : "+date2);
	}
	
	public static void test4() {	
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		String formatDate = sdf.format(new Date());
		
		System.out.println(sdf);
		System.out.println(formatDate);
		
	}
	
	public static void test5() {
		
		double num = 1234567890.123;
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println(df.format(num));
		df.applyPattern("#.00000");
		System.out.println();
	}
	
	public static void printCalendar(Calendar c) {
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",
                          c.get(Calendar.YEAR),
                          c.get(Calendar.MONTH) + 1,
                          c.get(Calendar.DATE),
                          c.get(Calendar.HOUR_OF_DAY),
                          c.get(Calendar.MINUTE),
                          c.get(Calendar.SECOND)
                );
    }
		
		
		
		
		
			
		
		
		
		
		
	
}



















