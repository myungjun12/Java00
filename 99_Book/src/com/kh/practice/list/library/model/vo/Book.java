package com.kh.practice.list.library.model.vo;

public class Book {
//필드
	private String title;
	private String author;
	private String category;  
	private    int price;
//메서드
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//Getter
	 public String getTitle() {
		return title; // 제목
	}
	public String getAuthor() {
		return author; // 저자
	}
	public String getCategory() {
		return category; // 범주
	}
	public int getPrice() {
		return price; // 가격
	}
	//생성자
	public Book() {}
	//필수생성자
	public Book(String title, String author, String category, int price){
		 this.title = title;
		 this.author = author;
		 this.category = category;
		 this.price = price;
	 }
	@Override
	public String toString() {
		return "[제목 : " + title + ", 저자 : " + author
				+ ", 범주 : " + category + ", 가격 : " + price + "]";
	}
//	public int hashCode() {
//		return 0;
//	}
//	public boolean equals() {
//		
//	}
//	public int compareTo() {
//		
//	}
}
