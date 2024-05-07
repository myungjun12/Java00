package com.kh.oop.method.ex;

public class PizzaStore {
	//필드
	private String pizzaName; // 피자 명
	private    int pizzaPrice;// 피자 가격
	//메서드
	//Setter 
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	//Getter
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	
	//메서드 : 기본 생성자
	public PizzaStore() {
		
	}
	//메서드 : 필수 생성자
	public PizzaStore(String name, int price) {
		this.pizzaName = name;
		this.pizzaPrice = price;
	}
	//void 메서드
	public void inforPizza() {
		System.out.println("피자이름 : " + pizzaName);
		System.out.println("피자가격 : " + pizzaPrice);
		System.out.println("=======================");
	}
	//메인 메서드
	public static void main(String[] args) {
		//피자 객체 생성
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("페페로니 피자");
		pizza1.setPizzaPrice(11000);
		
		pizza1.inforPizza();
		
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("포테이토 피자");
		//가격 적는 것을 잊음
		pizza2.setPizzaPrice(0);
		pizza2.inforPizza();
		//필수 생성자 사용
		PizzaStore pizza3 = new PizzaStore("치즈 피자",13000);
		pizza3.inforPizza();
		//필수 생성자로 피자 생성
	}
}
