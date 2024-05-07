package com.kh.Inheritance.OverrideEx;
/*
 동물
 ㅂ + 한자 ┖
 동물
   ┖강아지
   ┖고양이
 */
public class 실행 {
	//최종으로 실행하기 위해서 main 메서드
	public static void main(String[] args) {
		강아지 강아지1 = new 강아지("멍멍이");
		강아지1.소리();
		고양이 고양이1 = new 고양이("고영희");
		고양이1.소리();
		소 소1 = new 소("흑우");
		소1.소리();
		토끼 토끼1 = new 토끼("토깽");
		토끼1.소리();
	}
}
