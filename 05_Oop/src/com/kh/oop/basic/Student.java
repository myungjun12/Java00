package com.kh.oop.basic;

public class Student {
	//학생의 이름과 나이와 학년
	public String name;
	public int age;
	public int grade;
	public String phone;
	public String address;
	public int height;
	public int weight;
	public char gender;
	public Student(String name, int age, int grade, String phone) { //필수로 작성해야하는 생성자 메서드 만들기)
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.phone = phone;
	}
	public void info() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키,몸무게 : " + height + "(cm)," + weight+"(kg)");
		System.out.println("학생의 학년 : " + grade + "학년");
		System.out.println("휴대전화번호 : " + phone);
		System.out.println("주소 : " + address);
	}
	public static void main(String[] args) {
		
		Student student1 = new Student("김철수",23,4,"010-1111-2222");
		student1.address = "서울특별시 학동";
		student1.height = 183;
		student1.weight = 78;
		student1.gender = '남';
		student1.info();
		System.out.println("=======================");
		Student student2 = new Student("박영희",20,1,"010-3333-4444");
		student2.address = "인천광역시 노루";
		student2.height = 175;
		student2.weight = 73;
		student2.gender = '여';
		student2.info();
	}
}
	

