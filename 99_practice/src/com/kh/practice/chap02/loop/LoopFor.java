package com.kh.practice.chap02.loop;
			
public class LoopFor {
	/*
	 for 문: 끝이 정해진 반복을 진행할 때 사용하는 제어문
	 특정 조건을 만족하는 동안 { } 코드 블록을 반복해서 실행
	 반복 횟수가 일정하게 정해진 경우 많이 사용
	 
	 사용 예제
	 for (초기식 ; 조건식 ; 증감식) {
	 	//조건이 맞을 경우 반복해서 실행될 코드 블록
	 }
	 
	 //for문에서 조건이 맞지 않으면 for문을 탈출
	 */
	public static void main(String[] args) {
		/* int i = 1;
		 for ( 초기 식의 값이기 때문에 i라고 작성을 해줄 수 없음)
		 무조건
		 for ( 지정값 변수명 = 변수의 초기화값 ; 조건식 ; 증감식 )
		 작성 올바른 예(↑)
		 for ( i ; i <= 2 ; i++ ){
		 		System.out.println( "i의 값 : " + i);
		 }             || 조건불만족시 포문을 벗어난다.
		 */ //   (→)   || (↓)    (←)
		for( int i = 1; i <= 2 ; i++ ){
//			           || (↓)(↗)
			System.out.println(i + " ");
		}
		System.out.println("===== for문 2번 =====");
		for( int a = 1; a <= 3 ; a++ ){
			System.out.println("a의 값 : " + a);
		}
		System.out.println("===== for문 3번 =====");
		// int 값을 num = 1로 준 후
		// num의 값이 1부터 5까지 나오도록 출력
		for( int num = 1; num <= 5 ; num++ ){
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("===== for문 4번 =====");
		// 1부터 10까지 짝수만 출력해보기
		// int 값을 num = 2로 준 후
		// 증감식에서 num += 2; 준다음 출력해보기
		for( int num = 2; num <= 10 ; num += 2 ){
			System.out.print(num + " ");
		}
		System.out.println();
		//for문 구구단 5단 출력하기
		// 단의 값이 5임을 표시하기
		System.out.println("====================");
		int dan = 5;
		System.out.println(dan + "단!!");
		for( int i = 1; i <= 9 ; i++ ){
			System.out.println(dan + " X " + i + " = " + dan * i);
		}
		// 실습문제 6번
		System.out.println("===== for 6번 =====");
		// 구구단에서 3단을 9번까지 출력하기
		// 처음 3 * 1 = 3			마지막은 3 * 9 = 27;
		// int dandan = 3;
		// num = 1;
		int dandan =3;
		System.out.println(dandan + "단!");
		for( int num = 1; num <= 9 ; num++ ){
			System.out.println(dandan + " * " + num + " = " + dandan * num);
		}
	}		
}			
