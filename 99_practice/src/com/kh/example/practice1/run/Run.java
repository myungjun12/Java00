package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	//메인 메서드 최종으로 실행하거나 출력하는 메서드
	public static void main(String[] args) {
		// 멤버 객체 생성 (공간생성)
		Member member = new Member();
		// 이름 변경
		member.changeName("동그라미");
		
		member.memberId = "nenn200";
		member.memberPwd = "1234";
		member.age = 30;
		member.gender = '남';
		member.phone = "010-0000-0000";
		member.email = "naver.com";
		
		member.printName();
		// 안에 어떠한 값도 들어있지 않을 때 null
	}
}
