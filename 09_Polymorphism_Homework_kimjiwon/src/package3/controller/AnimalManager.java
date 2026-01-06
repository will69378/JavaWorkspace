package package3.controller;

import package3.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Cat("고양1", "러블", "집", "파랑");
		aArr[1] = new Cat("고양2", "블블", "집", "초록");
		aArr[2] = new Dog("강아1", "허스키", 10);
		aArr[3] = new Dog("강아2", "푸들", 5);
		aArr[4] = new Cat("고양3", "사막", "집", "모래색");
		
		for (int i = 0; i < aArr.length; i++) {
			aArr[i].speak();
			}		
	}
}
