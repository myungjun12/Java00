package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	// 최종 출력 메인 메서드
	public static void main(String[] args) {
		method1();
	}
	
	// 최종으로 출력하는 메서드는 아님
	// 내가 필요할 때 꺼내서 사용하는 메서드
	// 메서드 : 특정 상태나 기능을 정리 해놓은 집합
	
	// static : 고정된 이라는 뜻을 가지고 있음
	// static 이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	
	public static void method1(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수 값 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		int dif = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		System.out.println("sum : " + sum);
		System.out.println("dif : " + dif);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	
		
		System.out.print("두개의 실수 값 입력 : ");

		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double sum1 = num3 + num4;
		double dif1 = num3 - num4;
		double mul1 = num3 * num4;
		double div1 = num3 / num4;
		System.out.println("sum1 : " + sum1);
		System.out.println("dif1 : " + dif1);
		System.out.println("mul1 : " + mul1);
		System.out.println("div1 : " + div1);
		

		//		System.out.printf("%.1f + %.1f = %.1f",num3,num4,num3+num4);
		//		System.out.printf("%.1f - %.1f = %.1f",num3,num4,num3-num4);
		//		System.out.printf("%.1f * %.1f = %.1f",num3,num4,num3*num4);
		//		System.out.printf("%.1f / %.1f = %.1f",num3,num4,num3/num4);
	
	
	}

}
