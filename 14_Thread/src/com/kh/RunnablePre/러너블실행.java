package com.kh.RunnablePre;

public class 러너블실행 {

	public static void main(String[] args) {
		
		
		
		for(int i = 0; i < 5; i++) {
			러너블연습 run = new 러너블연습(i);
			Thread t = new Thread(run);
			t.start();
		}
		System.out.println("메인 메서드 종료");
	}
}
