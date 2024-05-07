package com.kh.oop.basic;

public class Main {
	
	// 생성자(필수로 값을 넣어야 하거나 또는 초기에 담을 공간을 생성하는 메서드)
	public Main() {
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.practice1();
		// public static void practice2(){}
		// 무조건 메모리공간에 고정으로 있어야하지만
		//현재 static이 아니라 담을 공간
	}	

	public void practice1() {
		Nation nt = new Nation();
		nt.name = "차명준";
	    nt.age = 31;
		nt.gender = '남';
		nt.ssNumber = "940108-*******";
		nt.address = "경기도 광주 너무 멀어";
		nt.phone = "010-3207-9327";
		System.out.println("이름 : " + nt.name);
		System.out.println("나이 : ㅠㅠ" + nt.age);
		System.out.println("성별 : " + nt.gender);
		System.out.println("주민번호 : " + nt.ssNumber);
		System.out.println("주소 : " + nt.address);
		System.out.println("핸드폰번호 : " + nt.phone);
		nt.speakKorean();
		nt.welfare();
		
		Nation nt2 = new Nation();
		nt2.name = "신짱구";
		nt2.age = 5;
		nt2.gender = '여';
		System.out.println("이름 : " + nt2.name);
		System.out.println("나이 : " + nt2.age);
		
		//홍길동 신짱구 납세의 의무
		nt.납세의의무();
		nt2.납세의의무();
	}


}
