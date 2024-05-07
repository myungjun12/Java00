package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {

	public static void KH카페() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("KH카페에 오신걸 환영합니다. ^^*\n"
				+ " 원하는 메뉴를 입력해주세요!\n"
				+ "1. 아메리카노 2. 카페라떼 3. 녹차 4. 흑당버블티 5. 주문취소");
			String menu = sc.next();
			switch(menu) {
			case "1":case "아메리카노":
				System.out.println("아메리카노 주문 완료 되었습니다.");
				break;
			case "2":case "카페라떼":
				System.out.println("카페라떼 주문 완료 되었습니다.");
				break;
			case "3":case "녹차":
				System.out.println("녹차 주문 완료 되었습니다.");
				break;
			case "4":case "흑당버블티": 
				System.out.println("흑당 버블티 주문 완료 되었습니다.");
				break;
			case "5":case "주문취소":
					System.out.println("주문이 취소되었습니다. 다음에 또 방문해주세요 ^^ ");
					return;
					default:
						System.out.println("잘못된 번호를 입력하셨습니다.");
			}
			System.out.print("추가로 선택하시겠습니까? Yes / No");
			String use = sc.next();
			switch(use) {
			case "Yes": case "yes":
				System.out.println("주문목록으로 돌아갑니다.");
				break;
			case "No": case "no":
				System.out.println("감사합니다. 또 방문해주세요~");
				return;
			}
		}//while 중괄호
		
	}
	
	public static void getMoney() {
		// 커피값 10잔 가진돈 300원 
		int coffee = 10;
		int money = 300;
		
		// 만약에 돈이 0보다 많다면 커피를 구매하고
		// 커피가 다 소진되면 판매를 중지한다.
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			// 커피가 10잔인데 1잔 제공했다면 -1 
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "잔입니다.");
			// 커피가 모두 소진됐다면 판매를 중지하자
			if(coffee==0) {
				System.out.println("금일 커피는 모두 소진되었습니다.\n 판매를 종료합니다");
				return;
			}
		}
	}
	
	public static void tree() {
		// 나무를 찍기 전이기 때문에 hit 0
		int hit = 0;
		while(hit < 10) {
			// 나무를 몇번 찍었는지 확인
			hit++; 
			System.out.println("나무를 " + hit + "번 찍었습니다.");
			// 만약에 나무를 공격한 수가 10번이 되면 나무 넘어갑니다 표현
			if(hit == 10) {
				System.out.println("나무가 쓰러졌다!!");
			}
		}
	}
	
	public static void allNumber() {
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++; 
		}
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 설정 값 : ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			}else {
				System.out.println("1부터 " + num + "까지의 숫자들");
			int abc = 1;
			while(abc <= num) {
			System.out.println(abc);
			abc++;
		}
	}
}
	
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("카페에 오신걸 환영합니다.");
		System.out.println("현재 가진 돈을 입력해주세요.");
		// 커피 가격 coffeePrice
		int coffeePrice = 100;
		// 현재 가지고 있는 금액 입력
		
		System.out.print("보유 금액 : ");
		int money = sc.nextInt();
		// 만약에
		while(money < coffeePrice) {
			System.out.println("잔액이 부족합니다.\n"
					+ "커피를 구매하기 위해 더 많은 돈을 넣어주세요.");
			System.out.print("현재 가진 돈을 넣어주세요 : ");
			money = sc.nextInt();
			/*
			 돈이 부족합니다. 커피를 구매하기 위해 더 많은 돈을 넣어주세요.
			 현재 가진 돈을 입력해주세요.
			 현재 가진 돈 입력 
			 nextInt();
			*/
		}
		System.out.println("커피를 구매했습니다. 거스름 돈은 : " + (money-coffeePrice));
		// 커피를 구매했다면 구매했습니다. 거스름돈 입력하기 ㄷ
	}
	
	public static void iLovePoke() {
		//1. 스캐너를 이용해서 현재 보유하고 있는 금액 입력하기
		int tangsuyuk = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요. 탕수육점입니다!");
		System.out.print("현재 보유 금액 : ");
		int myMoney = sc.nextInt();
		while(myMoney < tangsuyuk) {
			System.out.println("잔액이 모자릅니다.\n"
					+ "금액 충전 바랍니다.");
			System.out.print("10000원 이상의 금액을 충전 : ");
			 myMoney = sc.nextInt();
			 System.out.println("충전이 완료되었습니다. 현재금액 : " + myMoney + "원");
		}
		System.out.println("구매 완료 되었습니다. 거스름돈은 : " + (myMoney-tangsuyuk)+ "원입니다.");
		// 보유하고 있는 금액이 tangsuyuk 보다 적으면 잔액이 부족합니다.
		// 다시 입금해주세요.
		// nextInt(); 다시 입금할 금액을 입력
		// 돈이 10000원 이상이면 주문이 완료 되었습니다.
		// 현재 잔액은 00입니다.
	}
	
	public static void main(String[] args) {
		
			iLovePoke();
	//		getCoffee();
	//		method2();
	//		tree();
	//		allNumber();
	//		KH카페();
	//		getMoney();
	
	 		
		 	
		 
		 
	}
}
