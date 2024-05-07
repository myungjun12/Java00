package com.kh.oop.method.ex;

public class HamburgerStore {
//필드 햄버거 이름 가격
	private String name;
	private    int price;
//메서드	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	//기본 생성자
	public HamburgerStore(){
		
	}
	//필수 생성자
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//void info() 햄버거 정보 출력 
	public void info() {
		System.out.println("햄버거 이름 : " + name);
		System.out.println("햄버거 가격 : " + price);
		System.out.println("====================");
	}
	//메인
	public static void main(String[] args) {
		//기본 생성자 사용
		HamburgerStore hs1 = new HamburgerStore();
		hs1.setName("불고기버거");
		hs1.setPrice(2000);
		hs1.info();
		//필수 생성자 사용
		HamburgerStore hs2 = new HamburgerStore("사이버거",5000);
		hs2.info();
		
	}
}
