package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else if(num < 0) {
			System.out.println("양수가 아닙니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
	}
	
	public void practice2() {
		int korean, math, english;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		 korean = sc.nextInt();
		System.out.print("수학 점수 : ");
		 math = sc.nextInt();
		System.out.print("영어 점수 : ");
		english = sc.nextInt();
		int total = korean + math + english;
		double average = total/3;
		if(korean <= 40||math <= 40||english <= 40) {
			System.out.println("불합격입니다.");
		}else {
			System.out.printf("국어 : %2d%n 수학 : %2d%n 영어 : %2d%n 합계 : %2d%n 평균 : %.1f%n",korean,math,english,total,average);
			System.out.println("축하합니다. 합격입니다.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12의 정수 입력 : ");
		int month = sc.nextInt();
		switch(month) {
		case 1:case 3:case 5:case 7:case 9:case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		case 2:case 4:case 6:case 8:case 10:case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			default : 
				System.out.println(month + "월은 잘못된 입력된 달입니다.");
		}
		
	}
	
	public void practice4() {
	    Scanner sc = new Scanner(System.in);
		String result;
	    System.out.print("키(m)를 입력하세요 : ");
	    double height = sc.nextDouble();
	    System.out.print("몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();
		double BMI = weight/(height*height);
		System.out.printf("BMI 지수 : %.1f%n",BMI);
		if(BMI >= 30) {
			result = "고도비만입니다.";
		}else if(BMI >= 25 && BMI < 30) {
			result = "비만입니다.";
		}else if(BMI >= 23 && BMI < 25) {
			result = "과체중입니다.";
		}else if(BMI >= 18.5 && BMI < 23) {
			result = "정상체중입니다.";
		}else if(BMI < 18.5) {
			result = "저체중입니다.";
		}
	}
	
	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 성적 : ");
		int price1 = sc.nextInt();
		System.out.print("기말고사 성적 : ");
		int price2 = sc.nextInt();
		System.out.print("과제점수 : ");
		int price3 = sc.nextInt();
		System.out.print("출석횟수(?/20) : ");
		int price4 = sc.nextInt();
		double average1 = price1*0.2; // 중간 20프로
		double average2 = price2*0.3; // 기말 30프로
		double average3 = price3*0.3; // 과제 30프로 
		double average4 = (price4*5)*0.2; // 출석 20프로
		double total = average1 + average2 + average3 + average4;
		System.out.println("중간고사 점수(20%반영) : " + average1);
		System.out.println("기말고사 점수(30%반영) : " + average2);
		System.out.println("과제 점수 (30%반영) : " + average3);
		System.out.println("출석 횟수 " + price4 +"/20 (20%반영) : " + average4);
		System.out.println("총점 : " + total);
		if(total >= 70) {
			System.out.println("Pass");
		}else if(total < 70 || price4 < 14) {
			System.out.println("Fail[점수 미달]");
		}
	}
	
		
}
