package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		//기본생성자 객체 생성
		IceCream ice = new IceCream();
		ice.setName("월드콘");
		ice.setSugar(2);
		ice.setMilk(false);
		ice.makeIceCream();
		
		IceCream ice1 = new IceCream("바닐라",1,true);
		ice1.makeIceCream();
	}
}
