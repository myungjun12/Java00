package com.kh.ingeritance.ex;

// extends 스마트폰 상속받기
public class 갤럭시 extends 스마트폰{

//필드
	private int 안드로이드;
//메서드
	//Setter
	public void set안드로이드(int 안드로이드) {
		안드로이드 = 안드로이드;
	}
	//Getter
	public int get안드로이드() {
		return 안드로이드;
	}
	//기본 생성자
	public 갤럭시() {}
	//필수 생성자
	public 갤럭시(int 안드로이드) {
		안드로이드 = 안드로이드;
	}
	//@Override toString alt shift s s 
	@Override
	public String toString() {
		return "갤럭시 버전 : " +안드로이드 + " / " +  super.toString() + "]";
	}

}
