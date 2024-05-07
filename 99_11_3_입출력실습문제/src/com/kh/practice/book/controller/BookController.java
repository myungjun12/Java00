package com.kh.practice.book.controller;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {

	BookDAO bd = new BookDAO();
	//book.txt가 없을 때 만들어줌
	public void makeFile() {
		
	}
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}

	public Book[] fileRead() {
		
	}
}
