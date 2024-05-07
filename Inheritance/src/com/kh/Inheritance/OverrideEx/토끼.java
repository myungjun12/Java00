package com.kh.Inheritance.OverrideEx;

public class 토끼 extends 동물{

	public 토끼(String 이름) {
		super(이름);
	}
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 꿹 뷁 웱 웱 소리를 냅니다.");
	}
}
