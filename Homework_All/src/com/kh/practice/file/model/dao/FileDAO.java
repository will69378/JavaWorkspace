package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File check = new File(file);
		
		boolean ck = check.exists();
		
		return ck;
	}
	
	public void fileSave(String file, String s) {
		File f = new File(file);
		FileInputStream fl = new FileInputStream(file);
		
		String str = s;
		try {
			f.createNewFile();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		
	}
	
	public void fileEdit(String file, String s) {
		
	}
}
