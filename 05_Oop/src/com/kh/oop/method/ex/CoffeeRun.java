package com.kh.oop.method.ex;

public class CoffeeRun {
	public static void main(String[] args) {
	
		CoffeeMaker cm1 = new CoffeeMaker();
		
		cm1.setCoffeeType("아메리카노");
		cm1.setSugar(1);
		cm1.setMilk(false);
		cm1.makeCoffee();
		
		CoffeeMaker cm2 = new CoffeeMaker("바닐라라떼",1,false);
		
		cm2.makeCoffee();
	}
}
