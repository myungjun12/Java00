package com.kh.RunnablePre;

public class 러너블연습 implements Runnable {
//필드 
	int 초;
//메서드
	//필수 생성자
	public 러너블연습(int 초) {
		this.초 = 초;
	}
	
	@Override // Runnable인터페이스 메서드 run() // 
	public void run() { // sleep 1초 try catch this.초 + " 스레드 시작 , 종료"
		System.out.println(this.초 + "스레드 시작");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드 종료");
	}




	
}
