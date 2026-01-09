package com.kh.practice.file.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		boolean result = false;
		
		result = fd.checkName(file);
		return result;
	}
	
	public void fileSave(String file, StringBuilder sb) {
		
		String str = sb.toString();
		
		fd.fileSave(file, str);
		
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			int value = 0; 
			while((value = fr.read()) != -1) {
				sb.append((char)value);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return sb;
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
}
