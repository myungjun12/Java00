package com.kh.example.practice4.model.vo;

public class Student {
	// 필드
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	
	//초기화 블럭
//	{
//		grade = 0;
//		classroom = 0;
//		name = "";
//		height = 0.0;
//	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	
	// 생성자
	public Student() {
		
	}
	// 필수 생성자
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	// 메서드 : void
	public void information() {
		System.out.println("학년 : " + grade);
		System.out.println("몇반 : " + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키(m) : " + height);
		System.out.println("성별 : " + gender);
	}
}
