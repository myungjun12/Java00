package com.kh.oop.method.ex;

public class IceCream {
	//필드 
	private String name;
	private int sugar;
	private boolean milk;
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	//기본 생성자
	public IceCream() {
		
	}
	//필수 생성자
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	public void makeIceCream() {//아이스크림 만들고 우유 유무 출력
		System.out.println("이름 : " + name);
		System.out.println("설탕 : " + sugar + "g");
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");
		}
		System.out.println("====================");
	}
}
