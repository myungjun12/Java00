package com.kh.oop.method.ex;

public class CoffeeMaker {
	//필드 
	private String coffeeType;// 커피 종류
	private    int sugar; // 설탕량
	private boolean milk; // 우유 유무
	//Setter
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//Getter - boolean 같은 경우 get이 아니라 is로 표기
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	//기본 생성자
	public CoffeeMaker() {
		
	}
	//필수 생성자
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : " + coffeeType);
		System.out.println("설탕 : " + sugar + "g");
		//만약에 우유가 추가 됐다면
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
		System.out.println("======================");
	}
/*	public static void main(String[] args) {
		//기본 생성자로 객체 사용
		CoffeeMaker cm1 = new CoffeeMaker();
		
		cm1.setCoffeeType("아메리카노");
		cm1.setSugar(1);
		cm1.setMilk(false);
		
		cm1.makeCoffee();
		//필수 생성자 사용해서 커피 객체 생성
		CoffeeMaker cm2 = new CoffeeMaker("디카페인아메리카노",2,true);
		cm2.makeCoffee();
	}*/
}
