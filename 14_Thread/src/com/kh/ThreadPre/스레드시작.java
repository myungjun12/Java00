package com.kh.ThreadPre;

public class 스레드시작 {
	//main메서드 생성
	public static void main(String[] args) {
		//for문으로 스레드 2개 만들기
		for(int i = 0; i < 2; i++) {
			Thread t = new 스레드연습(i);
			t.start();
		}
		System.out.println("메인 종료");
	}
}
