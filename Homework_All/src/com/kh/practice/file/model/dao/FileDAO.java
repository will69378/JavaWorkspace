package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class FileDAO {
	public boolean checkName(String file) {
		File check = new File(file);
		
		boolean ck = check.exists();
		
		return ck;
	}
	
	public void fileSave(String file, String s) {
		File f = new File(file);

		
		String str = f.getName();
		try {
			f.createNewFile();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, String s) {
	
	}
}
