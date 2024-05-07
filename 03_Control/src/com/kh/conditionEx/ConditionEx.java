package com.kh.conditionEx;

import java.util.Scanner;

// package : 작성한 파일의 폴더 위치
 
// 조건문 기능용 클래스
public class ConditionEx {
	/*
	 if 주어진 조건이 참일 때 실행되는 코드 블록
	 else 조건이 거짓일 때 실행되는 코드 블록 필수가 아님
	 
	 사용방법
	 if(조건문){
	 조건이 참일 경우 실행할 코드 작성
	 만약에 조건문의 조건이 참이 아닐 경우
	 자동으로 실행 종료
	 }else{
	 
	 }
	 */
	// 메서드 1 : 19세 이상은 성입니다. 출력하기
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 만약에 고객의 나이가 19세 이상이라면
		// 성인입니다.를 출력할 것
		if(age >= 19) {
			System.out.println("성인입니다.");
		}else if(age > 16) {
			System.out.println("고등학생입니다.");
		}else if(age > 13) {
			System.out.println("중학생입니다.");
		}else if(age > 7) {
			System.out.println("초등학생입니다.");
		}else {
			System.out.println("아동입니다.");
		}
	}
	
	public static void method2() {
		int num = 5;
		// 만약에 num 이 짝수일 경우 짝수입니다. 출력하기
		// 짝수 2 % 0 
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	// 최종 메서드
	public static void method3() {
		// 0~13 어린이
		// 14~ 부터는 어린이가 아닙니다.
		// 14부터는 어린이가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age > 0 && age < 14) {
			System.out.println("어린이입니다.");
		}else{
			System.out.println("어린이가 아닙니다.");
		}
	}
	// 나이가 10세 이상 20세 미만일 때는 10대
	// 이 외는 10대가 아님 출력
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age >= 10 && age < 20) {
			System.out.println("10대 입니다.");
		}else {
			System.out.println("10대가 아닙니다.");
		}
	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age >= 80) {
			System.out.println("80세 이상입니다.");
		}
	}
	
	public static void grade() {
		Scanner sc = new Scanner(System.in);
		String grade = "";
		System.out.println("당신의 성적을 입력하세요 : ");
		int score = sc.nextInt();
		if(score > 90) {
			grade = "A";
		}else if(score > 80) {
			grade = "B";
		}else if(score > 70) {
			grade = "C";
		}else if(score > 60) {
			grade = "D";
		}else {
			System.out.println("불합격입니다.");
		}
		System.out.println("당신의 점수 : " + grade);
	}
	public static void method4() {
		
	// 만약에 돈이 2000원 이상 있을 경우 택시를 탄다.
	// 만약에 돈이 1500~1900 이하 있을 경우 대중교통을 이용한다.
	// 만약에 돈이 없을경우 걸어간다.
	Scanner sc = new Scanner(System.in);
	System.out.print("현재 보유 현금 : ");
	int money = sc.nextInt();
//	int money = 1800;
	if(money >= 2000) {
		System.out.println("택시를 탄다.");
	}else if(money >= 1500 && money <= 1900) {
		System.out.println("대중교통을 이용한다.");
	}else {
		System.out.println("걸어간다.");
	}
	
	}
	/*
	 나이를 입력 받아 
	 13세 이하면 "어린이"
	 13세 초과 18세 이하 "청소년"
	 18세 초과 "성인" 
	 */
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요. 티켓나라입니다.");
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("성인");
		}else if(age > 13 && age <= 18) {
			System.out.println("청소년");
		}else if(age <= 13) {
			System.out.println("어린이");
		}
	}
	
	/*
	  달을 입력받아 해당하는 계절 출력하기
	   봄 : 3,4,5
	   여름: 6,7,8
	   가을: 9,10,11
	   겨울: 12,1,2
	  */
	public static void practice_01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		String result;
		switch(month){
		case 3:case 4 :case 5:
			result = "봄입니다.";
			break;
		case 6:case 7:case 8:
			result = "여름입니다.";
			break;
		case 9:case 10:case 11:
			result = "가을입니다.";
			break;
			default : 
				result = "겨울입니다.";
			break;
		}
	}
	
	public static void practice_02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 작성하세요 : ");
		int month = sc.nextInt();
		String result;
		if(month == 1||month == 2||month == 12) {
			result = "겨울";
		}else if(month >= 3&& month <= 5) {
			result = "봄";
		}else if(month >= 6 && month <= 8) {
			result = "여름";
		}else if(month >= 9 && month <= 11 ) {
			result = "가을";
		}else {
			result = "해당하는 계절이 없습니다.";
		}
	}
	
	public static void method4_() {
		// 13세 이하 어린이 14 ~ 18 청소년 19세 성인
		
		int age = 10;
		// 변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력
		String result;
		if(age <= 13) {
			result = "어린이";
		}else if(age >= 14 && age <= 18) {
			result = "청소년";
		}else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	}
	
	
	public static void main(String[] args) {

//		method1();
//		method2();
//		method3();
//		practice1();
//		practice2();
//		grade();
//		practice_01();
//		practice_02();
		method4_();
		
		
		
		
		
		
		
		
		
		//		char[] ch = new char[26];
//		for(int i = 0;i < ch.length ;i++){
//		ch[i] = (char)((int)'a'+i);
//			if(i%5==2) {
//				System.out.printf("%3c",ch[i]);
//			}
//		}
//		System.out.println();
//		for (char c : ch) {
//			System.out.printf("%-3c",c);
//		}
	}

}
