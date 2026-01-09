package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng,
			int math, int sum, double avg) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt",true));) {
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void readScore() throws FileNotFoundException{
		try(DataInputStream dis = 
				new DataInputStream(new FileInputStream("score.txt"));) {
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
