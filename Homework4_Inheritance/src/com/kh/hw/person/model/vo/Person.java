package com.kh.hw.person.model.vo;

public class Person {
//필드
	private String name;
	private int age;
	private double height;
	private double weight;
	
//메서드 
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	//기본 생성자
	public Person() {}
	//필수 생성자
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "사람[" + "이름 : " + name + ", 나이 : " + age + ", 신장 : " + height + ", 몸무게 : " + weight + "]";
	}
}
