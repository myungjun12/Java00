package com.kh.oop.basic;

public class Animal { // 동물
	
	//1. 필드 이름 나이
	String name;
	int age;
	//2. 초기 생성자
	public Animal(){
		
	}
	//3. 필수 생성자 
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	//4. 출력 메서드 
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "레브라도";
		dog.age = 7;
		dog.info();
		System.out.println("=================");
		Animal cat = new Animal("페르시안",5);
		cat.info();
		
	}
	
}
