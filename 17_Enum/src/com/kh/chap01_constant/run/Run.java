package com.kh.chap01_constant.run;

import java.util.Calendar;

import com.kh.chap01_constant.model.vo.Car;
import com.kh.chap01_constant.model.vo.Color;

public class Run {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setCarColor(0);
		car1.setCarColor(Car.BLACK);
		car1.setCarColor(Calendar.YEAR);
		
		
		Car car2 = new Car();
		
		//car2.setColor(Calendar.YEAR); 검증 기능
		car2.setColor(Color.BLACK);
	}
}
