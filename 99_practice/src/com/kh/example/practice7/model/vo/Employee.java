package com.kh.example.practice7.model.vo;

public class Employee {
	//필드
	
	public String phone, address, job, dept, empName;
	public int age, salary, empNo;
	public char gender;
	public double bonusPoint;
	
	// 생성자
	 public Employee(){ 
		
	}
	 // 객체를 생성할 때 번호와 이름을 필수로 넣어준상태.
	 public Employee(int empNo, String empName){ 
			this.empNo = empNo;
			this.empName = empName;
	}
	//
	 public Employee(int empNo, String empName, String dept, String job, int age, char gender
			 		, int salary, double bonusPoint, String phone, String address){ 
		 	this.empNo = empNo;
			this.empName = empName;
			this.dept = dept;
			this.job = job;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
			this.bonusPoint = bonusPoint;
			this.phone = phone;
			this.address = address;
	}
	public void info(){
		System.out.println("근무번호 : " + empNo);
		System.out.println("이름 : " + empName);
		System.out.println("부서 : " + dept);
		System.out.println("직급 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("연봉 : " + salary);
		System.out.println("보너스 : " + bonusPoint);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
	}
}
