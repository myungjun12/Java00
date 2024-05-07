package com.kh.example.practice1.model.vo;

public class Member {
	//필드
	public String memberId; //아이디
	public String memberPwd;//비밀번호
	public String memberName;//이름
	public int age;//나이
	public char gender;//성별
	public String phone;//전화번호
	public String email;//e메일
	//생성자
	public Member(){
		
	}
	//출력 메서드
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("변경된 이름 : " + name);
	}
	
	public void printName() {
		System.out.println("Id : " + memberId);
		System.out.println("Pwd : " + memberPwd);
		System.out.println("이름 : " + memberName);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("email : " + email);
	}
}
