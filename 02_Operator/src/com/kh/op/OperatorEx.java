package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
	// 메인 메서드 호출
	public static void main(String[] args) {
//		int a = 1;
//		int b = 3;
		Scanner sc = new Scanner(System.in);
		System.out.print("a 입력 값 : ");
		int a = sc.nextInt();
		System.out.println("b 입력 값 : ");
		int b = sc.nextInt();
		
		// 덧셈
		int sum = a+b;
		System.out.println("덧셈 결과 sum : " + sum);
		// 뺼셈
		int dif = a-b;
		System.out.println("뺼셈 결과 dif : " + dif);
		// 곱셈
		int multiply = a * b;
		System.out.println("곱셈 결과 multiply : " + multiply);
		// 나눗셈
		int div = a/b;
		System.out.println("나눗셈 결과 div : " + div);
		
		
		
		/*
		 입력 받은 정수가 3의 배수인지 확인
		  */
		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num%3==0) {
//			System.out.println(num + "은 3의 배수가 맞습니다.");
//		}else {
//			System.out.println(num + "은 3의 배수가 아닙니다.");
//		}
//		
//		
//		
		sc.close();
	}
}
