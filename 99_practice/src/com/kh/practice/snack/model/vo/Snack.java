package com.kh.practice.snack.model.vo;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class Snack {
//필드
	private String kind; // 종류
	private String name; // 이름
	private String flavor; // 맛
	private int numof; // 개수
	private int price; // 가격
//메서드
	//기본 생성자
	public Snack() {
		
	}
	//필수 생성자
	public Snack(String kind, String name, String flavor, int numof, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numof = numof;
		this.price = price;
	}
	
	//메서드
//	public void information() {
//		return = "";
//	}
	//void : 반환x 출력o
/*	public void information() {
		System.out.println("종류 : " + kind);
		System.out.println("이름 : " + name);
		System.out.println(" 맛 : " + flavor);
		System.out.println("개수 : " + numof);
		System.out.println("가격 : " + price);
	} */
	// return : String
	public String information() { // 문자열 값 나열 = to String 
		return "종류 : " + kind + ", 이름 : " + name + ", 맛 : " + flavor + ", 개수 : " + numof + ", 가격 : " + price;
	}
//	public String toString() {
//		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numof=" + numof + ", price=" + price
//				+ "]";
	
	//Setter
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlaver(String flaver) {
		this.flavor = flaver;
	}
	public void setNumof(int numof) {
		this.numof = numof;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//Getter
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlaver() {
		return flavor;
	}
	public int getNumof() {
		return numof;
	}
	public int getPrice() {
		return price;
	}
	
}


