package com.kh.ThreadEx;

//Thread 클래스 가져오는 작업 진행
public class ThreadEx2 extends Thread {
//필드
	int 초;
//메서드
	//필수 생성자
	public ThreadEx2(int 초) {
		this.초 = 초;
	}
	
	//void run
	public void run() {
		System.out.println(this.초 + " 스레드 실행 중");
		
		try {
			//대기중 문제 발생할 수 있기에 
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드 종료 중");
	}
}
