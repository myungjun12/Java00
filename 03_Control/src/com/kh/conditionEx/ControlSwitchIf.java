package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {

	public static void takeAtaxi() {
		// 입력받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		// if문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드를 작성해줄 것
		if(money >= 3000) {
			System.out.print("택시를 탈까요?(예/아니오)");
			// answer로 받은 대답에 따라 응답을 처리하기
			String answer = sc.next();
			switch (answer) {
			case "예":
				System.out.println("택시를 타겠습니다.");
				break;
			case "아니오":
				System.out.println("택시를 타지 않습니다.");
				break;
				default:
					System.out.println("잘못된 입력이 아닙니다.");
			}
		}else {
			System.out.println("3000원 미만이므로 잔액이 부족합니다.");
		}
	}
	
	/*
	 * 사용자로부터 점수를 입력받아 성적 등급을 판별하는 프로그램 작성
	 * 90 이상일 경우 A 학점
	 * 80 이상일 경우 B 학점
	 * 70 이상일 경우 C 학점
	 * 60 이상일 경우 D 학점
	 * 60 미만일 경우 F 학점
	 * -> F 학점일 때 재수강 하시겠습니까? (Yes / No)
	 * 만약에 Yes No 이외의 값이 나올 수 있기 때문에
	 * case Yes : case yes:
	 * */
	public static void whyScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A 학점");
		}else if(score >= 80) {
			System.out.println("B 학점");
		}else if(score >= 70) {
			System.out.println("C 학점");
		}else if(score >= 60) {
			System.out.println("D 학점");
		}else {
			System.out.println("F 학점");
			System.out.println("재수강 하시겠습니까? (Yes / No)");
			String reScore = sc.next();
			
			switch(reScore) {
				case "Yes":case "yes":
					System.out.println("재수강 하겠습니다.");
					break;
				case "No":case "no":
					System.out.println("재수강 하지 않겠습니다.");
					break;
				default:
					System.out.println("올바른 입력이 아닙니다.");
			}
		}
	}
	
	/*
	 * public static void whatDay
	 * 월 수 금 : 헬스
	 * 화 목 : 공부
	 * 토 일 : 주말인데 집에서 쉴 예정입니까? (예 / 아니오)
	 *  만약에 집에서 쉴 예정이면 네 집에서 쉴 예정입니다.
	 *  	아니오 선택하면 어떤 활동을 할 예정인지 선택해주세요.
	 *  		활동 1. 등산 2. 독서 3. 수영 선택할 수 있게 만들어줌 
	 * */
	public static void whatDay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요 : ");
		System.out.println("월 / 화 / 수 / 목 / 금 / 토 / 일");
		System.out.print("입력(요일) : ");
		String day = sc.next();
		
		switch(day) {
		case"월":case"수":case"금":
			System.out.println("헬스를 할 예정입니다."); 
			break;
		case"화":case"목":
			System.out.println("공부를 할 예정입니다.");
			break;
		case"토":case"일":
			System.out.print("주말인데 집에서 쉴 예정입니까? (예 / 아니오)");
			String choice = sc.next();
			if(choice.equals("예")) {
				System.out.println("집에서 쉴 예정입니다.");
			}else { // 집에서 쉴 예정이 아닌 경우
				System.out.println("어떤 활동을 할 계획인가요?(번호입력)");
				System.out.print("1.등산 / 2.독서 / 3.수영 ) :");
				int activity = sc.nextInt();
				String result = "";
				switch(activity) {
				case 1:
					result = "등산";
					break;
				case 2:
					result = "독서";
					break;
				case 3:
					result = "수영";
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					return;
				}
				System.out.println("예정 : " + result);
			}
			
		}
//			switch(choice) {
//			case "예":
//				System.out.println("집에서 쉴 예정입니다.");
//				break;
//			case "아니오":
//				System.out.println("1. 등산");
//				System.out.println("2. 독서");
//				System.out.println("3. 수영");
//				System.out.print("선택 : ");
//				String answer = sc.next();
//				System.out.println("선택한 취미 : " + answer);
//				break;
//			default : 
//				System.out.println("잘못된 접근입니다.");
//			}
//		}
			
		
		
	
	}
	
	public static void main(String[] args) {
		
//		takeAtaxi();
//		grade();
		whatDay();
	}
}
