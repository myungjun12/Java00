package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int day = sc.nextInt();// 키보드로 받은 숫자 입력
		
		switch(day) {
		case 1: 
			System.out.println("월요일입니다.");
		case 2:
			System.out.println("화요일입니다.");
		default :
			System.out.println("아무요일도 아닙니다.");
		}
	}
	
	/* public static void method2
	 Scanner sc = new Scanner(System.in);
	 int.menuNumber = sc.nextInt();
	 switch 
	 	case 1 = 아메리카노 나왔습니다.
	 	case 2 = 카페라떼 나왔습니다.
	 	case 3 = 흑당버블티 나왔습니다.
	 	default = 잘못 입력했습니다. 다시 이용해주세요.
	*/ 
	public static void method2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int menuNumber = sc.nextInt();
		switch(menuNumber) {
		case 1: 
			System.out.println("아메리카노 나왔습니다.");
		case 2: 
			System.out.println("카페라떼 나왔습니다.");
		case 3:
			System.out.println("흑당버블티 나왔습니다.");
			default : 
				System.out.println("잘못 입력했습니다. 다시 이용해주세요.");
		}
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		String city = sc.nextLine();
		switch(city) {
		case "서울":
			System.out.println("대한민국의 수도입니다.");
		case "광주":
			System.out.println("제가 살고 있는 지역입니다.");
		case "부산":
			System.out.println("해 운 대");
		case "대전":
			System.out.println("빵 집");
			default:
				System.out.println("설정하지 않은 지역입니다.");
		}
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색(정수1~12월) : ");
		int month = sc.nextInt();
		String result;
		switch(month) {
		
		case 3:case 4:
			result = "봄";
			break;
		case 5:case 6:case 7:case 8:case 9:
			result = "여름";
			break;
		case 10:
			result = "가을";
			break;
		case 11:case 12:case 1:case 2:
			result = "겨울";
			break;
		
		default : 
				result = "해당하는 값을 찾지 못했습니다.";
		}
		System.out.println("선택한 " + month + "월의 계절은 : " + result + "입니다.");
	}
	
	// 등급에 따라서 학점을 출력하는 코드
	public static void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A,B,C,D 중 하나의 등급을 입력하세요.");
		// charAt 을 호출해서 작성한 문자열 중에 0번째 문자를 출력하겠다는 의미
		char grade = sc.next().charAt(0);
		switch(grade) {
		case 'A':case 'a':
			System.out.println("4.0");
			break;
		case 'B':case 'b':
			System.out.println("3.0");
			break;
		case 'C':case 'c':
			System.out.println("2.0");
			break;
		case 'D':case 'd':
			System.out.println("1.0");
			break;
		default :
			System.out.println("입력한 정보가 없습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		method5();
	}
}
