package com.kh.operatorPre;

import java.util.Scanner;

public class _01OperatorPractice {

	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 인원 : ");
		int people = sc.nextInt();
		System.out.println("사탕을 받기 위해 모인 사람들은 " + people + "명 입니다.");
		System.out.print("사탕 개수 : ");
		int candies = sc.nextInt();
		System.out.println("준비한 사탕은 총 " + candies +"개 입니다.");
		System.out.println("동일한 수량 만큼 받을 수 있는 캔디의 개수 : " + candies/people);
		System.out.println("사람들에게 동일하게 사탕을 주고 남은 개수 : " + candies%people);
		sc.close();
	}
	
	public static void practice2() {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("이름이 어떻게 되시나요?");
		String name = sc.nextLine();
		System.out.println("이름 : " + name);
		System.out.print("학년을 입력하세요");
		int grade = sc.nextInt();
		System.out.println("학년 : " + grade);
		System.out.print("학교에서 몇반이십니까?");
		int whatClass = sc.nextInt();
		System.out.println("반 : " + whatClass);
		System.out.print("학교에서 몇번이신가요?");
		int number = sc.nextInt();
		System.out.println(number + "번 입니다.");
		System.out.print("성별이 어떻게 되시나요? M(남성) / P(여성)");
		sc.nextLine();
		String gender = sc.nextLine(); // male / pemale 
		if(gender.equals("M")) {
			System.out.println("남학생");
		}else {
			System.out.println("여학생");
		}
		System.out.print("성적을 입력하세요 : ");
		double achievement = sc.nextDouble();
		System.out.println("성적 : " + achievement);
//		System.out.printf("성적 : %f",achievement);
		System.out.println(grade + "학년 " + whatClass + "반 " + number +
				 "번 " + name + " " + gender + "의 성적은 " + achievement + "입니다.");
		
		sc.close();
	}
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		int kor , math , eng;
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		int total = kor + math + eng;
		double average = (kor + math + eng)/3;
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
		sc.close();
		
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 값 2 : ");
		int num2 = sc.nextInt();
		if(num1 == num2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		sc.close();
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수 입력 3 : ");
		int num3 = sc.nextInt();
		if(num1==num2&&num2==num3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static void practice6() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
//		성인(19세 초과)인지 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result = "";
		if(age > 19) {
			result = "성인";
		}else if(age > 13 && age <= 19) {
			result = "청소년";
		}else if(age <= 13) {
			result = "어린이";
		}else {
			result = "잘못된 입력입니다.";
		}
		System.out.println(age + "살은 " + result + "입니다.");
	}
	
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		int korean , english , math;
		System.out.print("국어점수 입력 : ");
		korean = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		english = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		math = sc.nextInt();
		int total = korean + english + math;
		double average = total / 3.0;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		if(korean >= 40 && english >= 40 && math >= 40 && average >= 60) {
			System.out.println("합격입니다.");
		}else {
			if(average < 60) {
				System.out.println("평균 60 미만 ");
			}if(korean < 40) {
				System.out.print("국어점수 ");
			}if(english < 40) {
				System.out.print("영어점수 ");
			}if(math < 40) {
				System.out.print("수학점수 ");
			}
			System.out.println("미달로 불합격입니다.");
		}
	}
	
	public static void practice8() {
//		주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//		주민번호를 입력하세요(- 포함) : 132456-2123456
//		여자
		Scanner sc = new Scanner(System.in);
		System.out.println("(-) 포함 주민번호");
		System.out.print("주민번호 입력 : ");
		String number = sc.nextLine();
		
//		940108-1249317
		System.out.println(number.charAt(7));
		if(number.charAt(7)=='1') { // 문자 위치 01234567.
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 num1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 num2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수 num3 : ");
		int num3 = sc.nextInt();
		
		if(num1 < num2) {
			if(num1 >= num3 || num2 < num3) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
	}
	
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = sc.nextInt();
		if(num1 == num2 && num2 == num3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	public static void practice11() {
//		A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
//		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
//		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원 연봉 : ");
		double num1 = sc.nextInt();
		System.out.print("B사원 연봉 : ");
		double num2 = sc.nextInt();
		System.out.print("C사원 연봉 : ");
		double num3 = sc.nextInt();
		double num1Salary = num1 + (num1*0.4); 
		double num2Salary = num2;  
		double num3Salary = num3 + (num3*0.15); 
		
		if(num1Salary >= 3000) {
			System.out.println("A사원 연봉 : " + num1 + "/" + num1Salary);
			System.out.println("3000 이상");
		}else {
			System.out.println("A사원 연봉 : " + num1 + "/" + num1Salary);
			System.out.println("3000 미만");
		}if(num2Salary >= 3000) {
			System.out.println("B사원 연봉 : " + num2 + "/" + num2Salary);
			System.out.println("3000이상");
		}else {
			System.out.println("B사원 연봉 : " + num2 + "/" + num2Salary);
			System.out.println("3000 미만");
		}if(num3Salary >= 3000) {
			System.out.println("C사원 연봉 : " + num3 + "/" + num3Salary);
			System.out.println("3000 이상");
		}else {
			System.out.println("C사원 연봉 : " + num3 + "/" + num3Salary);
			System.out.println("3000 미만");
		}
	}
	
	public static void main(String[] args) {

		practice11();
		
	}

}
