package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("인원 수 : ");
		int num = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		int p = candy / num;
		int np = candy % num;

		System.out.println("1인당 사탕 개수 : " + p);
		System.out.println("남는 사탕 개수 : " + np);
	}

	public void practice2() {

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("학년 : ");
		int grade = sc.nextInt();

		System.out.print("반 : ");
		int cnum = sc.nextInt();

		System.out.print("번호 : ");
		int num = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String result = (gender == 'M') ? "남학생" : "여학생";

		System.out.print("성적 : ");
		double test = sc.nextDouble();

		System.out.println(grade + "학년 " + cnum + "반 " + num + "번 " + name + " "
		+ result + "의 " + "성적은 " + test + "입니다");
	}

	public void practice3() {

		System.out.print("나이 : ");
		int age = sc.nextInt();
		String result = (age <= 13) ? "어린이" : 
			(age > 13 && age <= 19) ? "청소년" : "성인";
		System.out.println(result);

	}

	public void practice4() {

		int c = 0;

		System.out.print("국어 : ");
		int kr = sc.nextInt();
		c += 1;

		System.out.print("영어 : ");
		int eg = sc.nextInt();
		c += 1;

		System.out.print("수학 : ");
		int ma = sc.nextInt();
		c += 1;

		double sum = kr + eg + ma;
		double avg = sum / c;

		String result = ((kr >= 40) && (eg >= 40) && (ma >= 40)) && (avg >= 60) ? "합격" : "불합격";

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);

	}

	public void practice5() {

		System.out.print("주민번호를 입력하세요 (-포함)");
		String num = sc.next();

		String result = (num.charAt(7) == '2') || (num.charAt(7) == '4') ? "여자" : "남자";
		System.out.println(result);

	}

	public void practice6() {

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int num3 = sc.nextInt();

		boolean result = ((num1 < num2) && ((num3 <= num1) || (num3 > num2))) ? true : false;
		System.out.println(result);
	}
	
	public void practice7(){
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int num3 = sc.nextInt();
		
		boolean result = ((num1 == num2) && (num2 == num3) && (num3 == num1)) ? true : false;
		System.out.println(result);
	}
	
	public void practice8(){
		
		System.out.print("A사원의 연봉 : ");
		int ym1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int ym2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int ym3 = sc.nextInt();
		
		double all1 = ym1 + (ym1 * 40) / 100;
		double all2 = ym2;
		double all3 = ym3 + (ym3 * 15) / 100;
		
		String result1 = all1>=3000 ? "3000 이상" : "3000 미만";
		String result2 = all2>=3000 ? "3000 이상" : "3000 미만";
		String result3 = all3>=3000 ? "3000 이상" : "3000 미만";
		
		System.out.println("A사원의 연봉/연봉+a : " + ym1+"/"+all1);
		System.out.println(result1);
		
		System.out.println("B사원의 연봉/연봉+a : " + ym2+"/"+all2);
		System.out.println(result2);
		
		System.out.println("C사원의 연봉/연봉+a : " + ym3+"/"+all3);
		System.out.println(result3);
	}
}
