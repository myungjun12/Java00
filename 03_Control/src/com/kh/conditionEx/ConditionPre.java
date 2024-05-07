package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	/*
	public static void method1(){
		// if문 활용 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		 Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 같다면 같습니다. 출력하고
		 같지 않다면 같지 않습니다. 출력하기 
	 */ 
	public static void method1() {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수1 값 : ");
	int num1 = sc.nextInt();
	System.out.print("정수2 값 : ");
	int num2 = sc.nextInt();
	if(num1==num2) {
		System.out.println("같습니다.");
	}else {
		System.out.println("같지 않습니다.");
	}
}
	
	/*
	public static void method2(){
		// if문 활용 숫자 값 2개를 받아서 문자 두개가 일치하는지 확인
		 Scanner sc = new Scanner(System.in);
		 String str1 = sc.nextLine();
		 String str2 = sc.nextLine();
		 같다면 같습니다. 출력하고
		 같지 않다면 같지 않습니다. 출력하기 
	 */ 
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 1 : ");
		String str1 = sc.nextLine();
		System.out.print("문자열 2 : ");
		String str2 = sc.nextLine();
		if(str1 == str2) {
			System.out.println("같습니다.");
		}else {
			System.out.println("같지 않습니다.");
		}
	}
	

	/*
	 method3 double로 실수 2개 값 받아서 실수 두개가 일치하는지 확인 == 
	  */
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 값1 : ");
		double d1 = sc.nextDouble();
		System.out.print("실수 값2 : ");
		double d2 = sc.nextDouble();
		if(d1 == d2) {
			System.out.println(d1 + "과" + d2 +"는 같습니다.");
		}else {
			System.out.println("같지 않습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		method1();
//		method2();
//		method3();
		
	
	    
		
		
	
	}
}
