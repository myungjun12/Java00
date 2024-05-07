package com.kh.op;

import java.util.Scanner;

public class Practice {

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
		sc.close();
	}
	
	public static void main(String[] args) {
//		practice1();
		practice2();
//		practice3();
//		practice4();
//		practice5();
		
	}

}
