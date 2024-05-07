package com.kh.ThreadPre;

public class 우선순위스레드 {
	
	public static void main(String[] args) {
		//for문으로 1부터 3까지 반복
		//1 ~ 3까지 차례대로 실행 설정
		for(int i = 1; i <= 3; i++) {
			스레드연습 n = new 스레드연습(i);
			if(i == 1) {
				n.setPriority(Thread.MAX_PRIORITY);
			}else if(i == 2) {
				n.setPriority(Thread.NORM_PRIORITY);
			}else {
				n.setPriority(Thread.MIN_PRIORITY);
			}
			n.start();
		}
	}
}
