package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
//		Employee emp2 = new Employee(14,"차명준","영업부","신입",31,'남',2500000,0.05,"010-1234-5678","서울시 강남구");
		
		emp1.empNo = 1;
		emp1.empName = "차명준";
		emp1.gender = '남';
		System.out.println("=== 직원1 ===");
		System.out.println("사원번호 : " + emp1.empNo);
		System.out.println("사원이름 : " + emp1.empName);
		System.out.println("사원성별 : " + emp1.gender);
		
		// 직원 2 생성자를 통해 번호와 이름을 넣어보자
		Employee emp2 = new Employee(2,"이동연");
		System.out.println("=== 직원2 ===");
		System.out.println("사원번호 : " + emp2.empNo);
		System.out.println("사원이름 : " + emp2.empName);
		
		// 직원 3 생성자를 통해 모든 iv 객체 값 정의
		Employee emp3 = new Employee(3,"정민규","마케팅","신입",28,'남',2500000,500000,"010-1234-1234","경기도 성남시");
		System.out.println("=== 직원3 ===");
		System.out.println("사원번호 : " + emp3.empNo);
		System.out.println("사원이름 : " + emp3.empName);
		System.out.println("사원부서 : " + emp3.dept);
		System.out.println("사원직급 : " + emp3.job);
		System.out.println("사원나이 : " + emp3.age);
		System.out.println("사원성별 : " + emp3.gender);
		System.out.println("사원연봉 : " + emp3.salary);
		System.out.println("사원특봉 : " + emp3.bonusPoint);
		System.out.println("사원번호 : " + emp3.phone);
		System.out.println("사원주소 : " + emp3.address);
	}
}
