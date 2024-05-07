package com.kh.example.practice2.model.vo;

public class Product {
	//필드
	private String pName;
	private int price;
	private String brand;
	
	//Setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//Getter
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	// 기본생성자
	public Product() {
		
	}
	// 메서드 : void
	public void information() {
		// 이름 가격 브랜드
		System.out.println("이 름 : " + pName);
		System.out.println("가 격 : " + price);
		System.out.println("브랜드 : " + brand);
		
	}
}
