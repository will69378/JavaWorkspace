package com.kh.chap03_wrapper;

public class Run {
	/*
	 Wrapper 클래스
	 
	 => 기본 자료형을 객체로 포장(Wrapping)해주는 클래스
	 	양뱡향으로 형변환이 자동으로 이루어진다.
	 	기본자료형이 Wrapper가 될때 박싱(boxing)
	 	반대는 언박싱(unboxing)
	 	
	 
	 	기본자료형  <----->  Wrapper 클래스
	 	boolean 		 Boolean
	 	char			 Character
	 	byte			 Byte
	 	short			 Short
	 	int				 Integer
	 	Long			 Long
	 	float			 Float
	 	double			 Double
	 	
	 	
	 	a.compareTo(b)
		a가 b보다 작으면 -1, 같으면 0, 크면 1
		
		
	 	String을 기본자료형으로 바꾸는 법 ( 파싱이라고 함)
	 	Wrapper클래스.parse자료형(변환할 문자열)
	 	
	 	String str1 = "10";
		String str2 = "10.5";
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		
	 */

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.compareTo(i2));
		
		int num3 = i1;
		int num4 = i2;
		
		String str1 = "10";
		String str2 = "10.5";
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
		String strI = String.valueOf(i);
		String strI2 = i+"";
		
		System.out.println(strI);
		System.out.println(strI2);
	}
		

}













