package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
		/*
		 비교 연산자 
		  
		  
		 논리 연산자
		 && : 왼쪽 오른쪽 두 개의 조건이 모두 참일 때만 전체 표현이 참
		  	예를 들어
		  	(5 == 5) && (5 == 5) true
		  	(5 != 3) && (3 == 3) true
		  	(5 == 5) && (5 == 3) false
		  	(3 == 5) && (5 == 5) false
		  	
		  	|| : 왼쪽 오른쪽 둘 중 하나라도 참이면 참
		  		예를 들어
		  		(5 == 5) || (5 == 5) true
		  		(5 == 5) || (5 == 3) true
		  		(5 == 3) || (3 == 3) true
		  		(5 == 3) || (3 == 5) false
		  		
		  		비교 연산자 > < >= <=
		  */
		int num1 = 10;
		int num2 = 20;
		
		boolean result1 = num1 == num2 ? true : false;
		boolean result2 = num1 != num2 ? true : false;
		boolean result3 = num1 < num2 ? true : false;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
