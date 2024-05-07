package com.kh.variable.Pre;

public class EnumPre {

	public enum 무지개 {
		빨강, 주황, 노랑, 초록, 파랑, 남, 보라
	}

	// enum으로 소비자 {학생,직장인,연장자}
	// enum으로 판매자 {소매업,도매업,중매업}
	public enum 소비자 {
		학생, 직장인, 연장자
	}

	public enum 판매자 {
		소매업, 도매업, 중매업
	}

// 기본 생성자
	public EnumPre() {
	}

// 메서드
	// void
	public void method1() {
		// enum 밑에 있는 메서드
		무지개[] 배열 = 무지개.values();// enum으로 작성한 값을 가지고옴
		// for-each
		for (무지개 무 : 배열) {
			System.out.println(무);
		}
	}

	public void method2() {
		//enum으로 소비자 {학생,직장인,연장자}
		//enum으로 판매자 {소매업,도매업,중매업}
		//소비자와 판매자를 for each 사용해서 각각 출력
		System.out.println("=== 소비자 ===");
		소비자[] 소비자들 = 소비자.values();
		for(소비자 소 : 소비자들) {
			System.out.println(소);
		}
		System.out.println("=== 판매자 ===");
		판매자[] 판매자들 = 판매자.values();
		for(판매자 판 : 판매자들) {
			System.out.println(판);
		}
		소비자 c = 소비자.학생;
		System.out.println("학생의 등급 : " + c.ordinal());
		판매자 s = 판매자.소매업;
		System.out.println("소매업의 등급 : " + s.ordinal());
		if(c.ordinal() > s.ordinal()) {
			System.out.println("소비자의 등급이 더 높습니다.");
		}else if(c.ordinal() == s.ordinal()) {
			System.out.println("소비자와 판매자 등급이 같습니다.");
		}else {
			System.out.println("판매자의 등급이 더 높습니다.");
		}
		
			
			
	}

	// 메인메서드
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
//		ep.method1();
		ep.method2();
	}
}
