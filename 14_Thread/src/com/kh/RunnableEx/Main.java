package com.kh.RunnableEx;

public class Main {

	public static void main(String[] args) {
		// 여러개를 붙일 수 있는 implements를 사용했을 경우
		// Runnable 불러준 후 스레드 객체에 넣어줌
		RunnableEx runnable = new RunnableEx();
		
		// 스레드 생성
		Thread 스레드 = new Thread(runnable);
		스레드.start();
	}
}
