package com.kh.Inheritance.OverLoadingEX;

public class Run {
	//main 메서드 : main은 오버로딩 x 오버라이딩 x 
	public static void main(String[] args) {
		//사람1 : 홍길동
		Person person1 = new Person();
		person1.setName("홍길동");
		//사람2 : 박영희
		Person person2 = new Person("박영희");
		
		//사람3 : 김철수
		Person person3 = new Person("김철수",17);
		
		person1.displayInfo();
		person2.displayInfo();
		person3.displayInfo();
		
	}
}
