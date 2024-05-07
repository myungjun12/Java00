package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {

	public static void method1() {
		//스캐너로 입력한 값이 true 인지 false 인지 해볼 것 
		Scanner sc = new Scanner(System.in);
		System.out.print("a 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("b 정수 입력 : ");
		int b = sc.nextInt();
		System.out.println("a : "+a +" b : "+ b);
		System.out.println("a 와 b 가 같으면 == true가 나올 것");
		System.out.println("a == b : " + (a == b));
		System.out.println("a == b가 다르면 false가 나올 것");
		System.out.println("a != b : " + (a != b));
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("c의 값을 입력하세요 : ");
		int c = sc.nextInt();
		System.out.print("d의 값을 입력하세요 : ");
		int d = sc.nextInt();
	    
		int e = ++c;
		int f = ++c;
		// c + 1 = c 넣겠다 해줬기 때문에 c = 12 + 1
	    // int f = ++c; 를 한다면 f의 값은 어떻게 나오는지 System.out.println("f : " + f)
System.out.println("c : " + c + ", d : " + d + ", e : " + e + ", f : " + f);
System.out.println("c==d : " + (c == d));
System.out.println("c==e : " + (c == e));
	   
	}
	//method2 를 만들어서 증감 연산자 를 사용한 다음 
	// 비교 연산자를 사용해서 값이 같으지 틀린지 확인해볼 것
	
	//method3 만들어서 사용하기
	public static void method3() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		// 인원수와 사탕 개수를 키보드로 입력받기
		// 1인당 동일하게 나눠가진 사탕의 개수와 
		// 나눠주고 남은 사탕의 개수를 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int people = sc.nextInt();
		System.out.println("사탕 파티에 " + people + " 명이 참석했습니다.");
		System.out.print("현재 보유하고 있는 총 사탕의 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		System.out.println("현재 가지고 있는 사탕은 " + candies + "개 입니다.");
		System.out.println("그렇군요, 그렇다면 동일하게 나눠가질 수 있는 사탕의 개수는 몇 개입니까?");
		int perPerson = candies/people;
		System.out.println(perPerson + "개 입니다.");
		int remain = candies%people;
		System.out.println("나눠갖고 남은 사탕의 개수 : ");
		System.out.println(remain + "개 입니다.");
		// 총 사람 당 동일하게 나눠가질 사탕의 개수 = 사탕의 개수 / 총 인원 수
	}
	
	public static void main(String[] args) {
		// 최종으로 출력할 메서드
//		method1();
//		method2();
		method3();
	}

}
