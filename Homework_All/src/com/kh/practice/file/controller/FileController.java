package com.kh.practice.file.controller;

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
		
		sb = fd.fileOpen(file);
		return sb;
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		
	}
}
