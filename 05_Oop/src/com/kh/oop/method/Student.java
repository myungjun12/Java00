package com.kh.oop.method;

public class Student {
	//필드
	//학생 이름 나이 학년
	private String name;
	private int age;
	private int grade;
	
	public Student() {
		
	}
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	//return
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int gerGrade() {
		return grade;
	}
	public void info() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학생의 학년 : " + grade);
		System.out.println("=====================");
	}
	//메인 메서드
	public static void main(String[] args) {
		//student1 "박영수" 15 2 
		Student student1 = new Student("박영수",15,2);
		student1.info();
		//student2 "김영희" 17 1
		Student student2 = new Student("김영희",17,1);
		student2.info();
	}
}
