package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	Phone p = new Phone("아이폰", 1300000, "1234");

	public void fileSave() {

		/*
		 * ObjectOutputStream : 객체단위 출력을 지원하는 보조 스트림 .writeObject() : 객체 단위 출력 메서드
		 * 
		 * 직렬화가 되지 않은 일반 클래스는 입출력이 불가능
		 * 
		 * 직렬화(Serialiration) - 객체의 상태를 그대로 저장하거나 복원하는 방식을 직렬화 / 역직렬화라고 함 - 객체 데이터를
		 * byte로 변환하여 입 / 출력 매체에 저장하는 과정을 직렬화 - 저장된 byte를 다시 객체 상태로 복원하는 과정을 역직렬화라고 함
		 * 
		 * - 자바에서 직렬화를 위해서는 Serializable 인터페이스를 구현해야한다
		 * 
		 * 
		 * transient : 객체 입출력시 해당값을 입출력하지 않게 하는 예약어
		 */

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"));

			oos.writeObject(oos);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"));) {

			while (true) {
				Phone p = (Phone) ois.readObject();
				System.out.println(p);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
