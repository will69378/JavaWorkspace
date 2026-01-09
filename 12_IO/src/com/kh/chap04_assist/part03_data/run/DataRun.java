package com.kh.chap04_assist.part03_data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {
	public static void main(String[] args) {
		DataRun dr = new DataRun();
		
		dr.fileSave();
		dr.fileRead();
	}
	
	public void fileSave() {
		
		try (DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream("sample.txt"));){
			
			dos.writeBoolean(true);
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeChar('해');
			dos.writeUTF("용용선생");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void fileRead() {
		
		try (DataInputStream dis = 
				new DataInputStream(new FileInputStream("sample.txt"));) {
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}












