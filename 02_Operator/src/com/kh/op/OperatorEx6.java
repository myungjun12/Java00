package com.kh.op;

public class OperatorEx6 {

	/*
	 * 증감 연산자
	 * +=
	 * 덧셈 연산을 수행하고 결과에 변수에 값을 넣어주는 역학을 함
	 * 
	 * -=
	 * 뺼셈 연산을 수행하고 결과를 변수의 값으로 넣어주는 역할을 함
	 * 이외에도 *= /= %= **== //==
	 * */
	
	public static void main(String[] args) {
		
	     int num1 = 10;
	     int num2 = 5;
	     
	     // += 연산자를 활용한 예제
	     System.out.println("=====[+=]=====");
	     System.out.println("num1 : " + num1 + "num2 : " + num2);
	     num1 += 3;
	     System.out.println("num1 += 3을 해준 num1의 값 : " + num1);
		
	     num2 += num1;
	     System.out.println("num1 : " + num1 + "과 num2의 값 : " + num2);
		
	     int num4 = 10;
	     int num5 = 5;
	     
	     num4 -= 2;
	     num5 -= num4;
		 System.out.println("num 4의 값 : " + num4);
		 System.out.println("num 5의 값 : " + num5);
	}
}
