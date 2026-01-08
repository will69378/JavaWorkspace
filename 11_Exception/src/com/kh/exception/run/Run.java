package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class Run {
	public static void main(String[] args) throws C_CustomException {
		/*
		 
		 에러(오류) 종류
		 
		  	- 시스템 
		  		- 컴퓨터 상의 오작동으로 발생
		  		- 소스코드로 수정 불가
		  	
		  	- 컴파일
		  		- 소스코드 상의 문법적인 문제로 발생
		  		- 컴파일러가 빨간줄로 알려줌
		  		- 소스코드 수정으로 문제를 해결 할 수 있음.
		  				
		  				
		  	- 런타임
		  		- 소스코드 상 에러가 없지만 실행중일 때 발생하는 에러
		  		- 사용자가 잘못된 방식으로 사용 또는, 충분히 예측을 못한 경우 발생
		  		- 소스코드 수정으로 에러 해결 가능
		  		
		  	
		  	- 논리
		  		- 코드 상의 문제 없고 실행했을 때도 없지만 개발자의 의도와
		  		다른 결과를 반환하는 에러
		  		
		  	
		  예외 처리
		  
		  	- 위와 같은 예외들이 발생했을 경우를 대비해 처리하는 방법을 사전에 정의해두는 것을
		  	"예외 처리" 라고 함
		  	- 예외 처리를 하지 않으면 프로그램 실행 중 오류가 발생하는 경우 프로그램이 작동 중지함
		 
		 */
		
		A_UncheckedException aue  = new A_UncheckedException();
		B_CheckedException bce = new B_CheckedException();
		//aue.method3();
		//bce.method1();
		
		
		//에러 강제 발생
		//throw new 에러클래스 생성자(에러 메세지)
		throw new C_CustomException("에러 발생");
		
		
		
	}
}
















