package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		DrinkMaker dm = new DrinkMaker("오렌지",100,1);
		dm.makeDrink();
		System.out.println("=====================");
		DrinkStore ds = new DrinkStore(dm,"서울","주다방",true);
		ds.orderDrink();
		
		DrinkMaker tea = new DrinkMaker("허브티",1,10);
		// 음료 가게 객체 생성
		DrinkStore store = new DrinkStore(tea,"경기","메가커피",false);
		store.orderDrink();
	
	}
}
