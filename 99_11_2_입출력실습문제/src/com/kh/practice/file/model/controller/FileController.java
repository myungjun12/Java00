package com.kh.practice.file.model.controller;

import java.nio.file.Files;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {

	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}


//	DAO에 매개변수를 전달하고, DAO로부터
//	전달받은 값을 다시 반환

//	전달받은 매개변수를 변경하고 DAO에 전달
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
	}


	//파일 열기
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	
	}

//	DAO에 매개변수를 전달하고, DAO로부터
//	전달받은 값을 다시 반환

	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
}
