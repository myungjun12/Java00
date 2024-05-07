package com.kh.oop.method;

public class Animal {
	//필드
	public String name;
	public int age;
	//기본생성자
	public Animal() {
	}
	//필수생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//return
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	// void로 프린트 출력하기
	public void info() {
		System.out.println("동물 이름 : " + name);
		System.out.println("동물 나이 : " + age);
		System.out.println("======================");
	}
	
	//메인 메서드
	public static void main(String[] args) {
		Animal dog = new Animal("리트리버",2);
//		System.out.println("강아지 이름 : " + dog.getName());
//		System.out.println("강아지 나이 : " + dog.getAge());
		dog.info();
		Animal cat = new Animal("페르시안",1);
//		System.out.println("고양이 이름 : " + cat.getName());
//		System.out.println("고양이 나이 : " + cat.getAge());
		cat.info();
	}
}
