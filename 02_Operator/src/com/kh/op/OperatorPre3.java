package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {

	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		boolean result1 = num1 > num2;
		boolean result2 = num1 >=num2;
		boolean result3 = num1 < num2;
		boolean result4 = num1 <=num2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	
		public static void method2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("세번째 정수 입력 : ");
			int num3 = sc.nextInt();
			boolean result1 = (num1 > num2)||(num2 < num3);
			boolean result2 = (num1 == num2)&&(num2 > num3);
			boolean result3 = (num1 != num2)&&(num2!=num3);
			boolean result4 = (num1 != num2)||(num2==num3);
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
		}
	
	public static void main(String[] args) {
		
//		method1();
		method2();
	}
}
