package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
			
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
			
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
			
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
			
		case 7:
			System.out.println("조회 메뉴입니다");
			break;

		default:
			break;
		}
	}
	public void practice2(){
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.println("짝수다");
		}
		else if (num % 2 == 1 && num > 0) {
			System.out.println("홀수다");
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3(){
		System.out.print("국어 점수 : ");
		int score1 = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int score2 = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int score3 = sc.nextInt();
		
		int sum = score1+ score2+ score3;
		
		double avg = sum/3;
		
		if((score1>=40 && score2>=40 && score3>=40) && avg>=60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
	}
	public void practice4(){
		System.out.print("1~12 사이의 정수 : ");
		int month = sc.nextInt();
		
		String com;
		switch (month) {
		case 12: //case 1, 2, 12도 사용 가능
		case 1 :
		case 2 :
			com = "겨울";
			System.out.println(month + "월은 "+com+"입니다");
			break;
		
		case 3:
		case 4 :
		case 5 :
			com = "봄";
			System.out.println(month + "월은 "+com+"입니다");
			break;	
			
		case 6:
		case 7 :
		case 8 :
			com = "여름";
			System.out.println(month + "월은 "+com+"입니다");
			break;
			
		case 9:
		case 10 :
		case 11 :
			com = "가을";
			System.out.println(month + "월은 "+com+"입니다");
			break;
			
		default: System.out.println(month + "월은 잘 못 입력된 달입니다");
			break;
		}
	}
	public void practice5(){
		System.out.print("아이디 : ");
		String ID = sc.next();
		
		System.out.print("비밀번호 : ");
		String PW = sc.next();
		
		String myid = "kim";
		String mypw = "qwer";
		
		if(ID.equals(myid)&& PW.equals(mypw)) {
			System.out.println("로그인 성공");
		}
		else if(ID.equals(myid)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if(PW.equals(mypw)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		else {
			System.out.println("모두 틀렸습니다.");
		}
	}
	
	public void practice6(){
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String member = sc.next();
		
		switch (member) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
			
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		
		case "비회원":
			System.out.println("게시글 조회");
			break;
			
		default:
			System.out.println("역할을 정해주세요.");
			break;
		}
		
	}
	
	public void practice7(){
		System.out.println("키 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight/(height * height);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}
		else if (BMI < 23) {
			System.out.println("정상체중");
		}
		
		else if (BMI < 25) {
			System.out.println("과체중");
		}
		else if (BMI < 30) {
			System.out.println("비만");
		}
		else if (BMI >= 30) {
			System.out.println("고도 비만");
		}
		else {
			System.out.println("측정불가");
		}
	}
	
	public void practice8() {
		System.out.print("피연산자 1 : ");
		int first = sc.nextInt();
		
		System.out.print("피연산자 2 : ");
		int second = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%) :");
		String str = sc.next();
		
		double result = 0;

		if(first > 0 && second > 0) {
			if(str.equals("+")) {
				result = first + second ;
			}
			else if(str.equals("-")) {
				result = first - second;
			}
			else if(str.equals("*")) {
				result = first * second;
			}
			else if(str.equals("/")) {
				result = first / second;
			}
			else if(str.equals("%")) {
				result = first % second;
			}
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		System.out.println(first + str + second+ " = " + result);
	}
	
	public void practice9(){
		
		System.out.print("중간 고사 점수 : ");
		int testm = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int testl = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int workscore = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int count = sc.nextInt();
		
		double mid = (testm*20)/100;
		double last = (testl*30)/100;
		double ws = (workscore*30)/100;
		
		double all = mid + last + ws + count;
		
		if(all>=70 && count > 6) {
			System.out.println("pass");
		}
		else if(all<70 && count > 6) {
			System.out.println("fail");
		}
		else if(count <=6) {
			System.out.println("fail [출석 횟수 부족 ("+count+"/20)]");
		}
	}
	public void practice10(){
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice1();
			break;

		default:System.out.println("다시 입력");
			break;
		}
	}
	public void practice11(){
		System.out.print("비밀번호 입력(1000~9999) : ");
		int num = sc.nextInt();
		
		int first = num /1000 + 1;
		int second = (num - (1000*first)) / 100 +1;
		int third = (num - (1000*first) - (100*second)) / 10 + 1;
		int four = (num - (1000*first) - (100*second) - (10*third) )+1;
		
		if((num>1000 && num<=9999) && 
				(first-1 < 10 && first-1 > 0) && (first != second) && (second != third)
				&& (third != four) && (four != first)) {
			System.out.println("생성 성공");
		}
		else if ((first == second) || (second == third)
		|| (third == four) || (four == first)){
			System.out.println("중복값 있음");
		}
		else if(num>9999 || num <1000) {
			System.out.println("자리 수 안 맞음");
		}
	}
}
