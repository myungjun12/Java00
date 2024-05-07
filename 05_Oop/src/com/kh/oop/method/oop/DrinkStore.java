package com.kh.oop.method.oop;

public class DrinkStore {
//필드
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeOut; 
//메서드
	//Setter
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeOut(boolean takeOut) {
		this.takeOut = takeOut;
	}
	//Getter
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeOut() {
		return takeOut;
	}
	//기본 생성자
	public DrinkStore() {
		
	}
	//필수 생성자       //참조타입 변수 maker공간생성
	public DrinkStore(DrinkMaker maker, String location, String name, boolean takeOut) {
//		    maker. xx < 주소값대입
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeOut = takeOut;
	}
	public void orderDrink() {
		System.out.println(location + " " + name + " 에 주문한 정보");
		maker.makeDrink();
		if(takeOut) {
			System.out.println("포장해서 가겠습니다.");
		}else {
			System.out.println("매장에서 먹겠습니다.");
		}
	}
}
