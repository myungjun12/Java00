package com.kh.oop.method.ex;

public class Person {
	//필드 이름 나이
	private String name;
	private    int age;
	//Person 생성자
	public Person() {
		
	}
	//필드 대신 값을 저장하고 내보내는 Setter Getter 생성
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	public static void main(String[] args) {
		Person person1 = new Person();
		
		//Setter를 활용해서 속성 값 설정
		person1.setAge(31);
		person1.setName("차명준");
//		System.out.println(person1.getAge());
//		System.out.println(person1.getName());
		person1.info();
	}
	
}
