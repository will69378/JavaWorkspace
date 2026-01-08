package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	public void fileSave() {

		FileWriter fw = null;

		try {
			fw = new FileWriter("b_char.txt", true); // 파일이 없다면 생성, 이어쓰기.

			fw.write("재밌는 io");
			fw.write("잘 즐긴다요");
			fw.write(' ');

			char[] arr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileRead() {
		FileReader fr = null;

		try {
			fr = new FileReader("b_char.txt");

			int value = 0;

			while ((value = fr.read()) != -1) {
				System.out.println((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
