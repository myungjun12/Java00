package com.kh.operatorPre;

import java.util.Scanner;

public class PracticeExample {

	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		int unicode = ch;
		System.out.println(ch + "는 " + unicode + "입니다.");
		
		
//		switch(ch) {
//			case 'A': 
//				System.out.println(ch + " unicode : " + (int)ch);
//				break;
//			case 'a':
//				System.out.println(ch + " unicode : " + (int)ch);
//				break;
//		}
		
	}
	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		int total = korean + math + english;
		double average = total / 3.0;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
	}
	
	public static void practice3() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println(iNum2/2); // 2
		System.out.println((int)dNum); // 2
		System.out.println((float)(iNum2 * 2 +(int)dNum)); // 10.0
		System.out.println(fNum*2 + iNum2); // 10.0
		System.out.println(dNum); // 2.5
		System.out.println((float)iNum1/4 ); // 2.5
		System.out.println((int)fNum); // 3
		System.out.println(iNum1/3); // 3
		System.out.println((float)iNum1/3 );// 3.3333333
		System.out.println((double)iNum1/3); // 3.3333333333333335
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println((int)ch + iNum1); // 75
		System.out.println((char)((int)ch + iNum1)); // 'K'
	}
	
	public static void main(String[] args) {
	
//		practice1();
//		practice2();
		practice3();
	}
}