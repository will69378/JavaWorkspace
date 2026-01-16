package com.kh.chap02_lambda.model.functional;

/*

함수형 인터페이스로 사용될 인터페이스는  ( @FunctionalInterface을 적은 )
내부적으로 반드시 1개의 추상메서드만 존재해야함
람다식은 메서드를 간소화하기에 2개 이상의 추상메서드가 있으면 어떤걸 간소화할지 모르기에

 */






@FunctionalInterface
public interface LambdaTest1 {
	
	int add(int x, int y);
	
}
