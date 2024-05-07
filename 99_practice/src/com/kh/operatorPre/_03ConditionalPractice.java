package com.kh.operatorPre;


import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class _03ConditionalPractice {
	// 입력 수정 조회 삭제 종료
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력메뉴 2.수정메뉴 3.조회메뉴 4.삭제메뉴 7.종료");
		System.out.print("번호 입력 : ");
		int menu = sc.nextInt();
		switch(menu) {
			case 1:
				System.out.println("입력메뉴 입니다.");
				break;
			case 2:
				System.out.println("수정메뉴 입니다.");
				break;
			case 3:
				System.out.println("조회메뉴 입니다.");
				break;
			case 4:
				System.out.println("삭제메뉴 입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				break;
				default:
					System.out.println("잘못된 접근입니다.");
		}
	}
	
	public static void practice2() {
		System.out.println("한개의 정수 홀수/짝수 여부 확인");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int english = sc.nextInt();
		int total = korean + math + english;
		double average = total / 3.0;
		System.out.println("총합계 : " + total);
		System.out.printf("평 균 : %.1f%n",average);
		if(korean >= 40 && math >= 40 && english >= 40 && average >= 60) {
			System.out.println("축하드립니다. 합격입니다!");
		}else {
			if(korean < 40) {
				System.out.println("국어점수 미달");
			}if(math < 40) {
				System.out.println("수학점수 미달");
			}if(english < 40) {
				System.out.println("영어점수 미달");
			}if(average < 60) {
				System.out.println("평균 미달");
			}
			System.out.println("불합격입니다.");
		}
		
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 월(1~12) : ");
		int month = sc.nextInt();
		String result = "";
		switch(month) {
		case 11:case 12:case 1:case 2:
			result = month +"월은 겨울입니다.";
			break;
		case 3:case 4:
			result = month +"월은 봄입니다.";
			break;
		case 5:case 6:case 7:case 8:case 9:
			result = month +"월은 여름입니다.";
			break;
		case 10:
			result = month +"월은 가을입니다.";
			break;
			default:
				result = month + "월은 존재하지 않습니다.";
		}
		System.out.println(result);
	}
	
	public static void practice5() {
//		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//		로그인 성공 시 “로그인 성공”,
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("설정된 ID : asd123");
		System.out.println("설정된 PW : 456789");
		
		System.out.print("아이디 입력 : ");
		String inputID = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String inputPW = sc.nextLine();
	
		String userID = "asd123";
		String userPW = "456789";
		
		if(inputID.equals(userID) && inputPW.equals(userPW)) {
			System.out.println("로그인 되었습니다.");
			
		
		}else if(!inputID.equals(userID)){
			System.out.println("아이디가 틀렸습니다.");
			
		}else if(!inputPW.equals(userPW)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else {
				System.out.println("잘못 입력된 값 입니다.");
			}
		
		}
	
	public static void practice6() {

		
//		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		비회원은 게시글 조회만 가능합니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 목록 : 관리자/회원/비회원");
		System.out.print("검색 : ");
		String userRole = sc.next();
		System.out.println("등급에 따른 권한");
		switch(userRole) {
			case "관리자":
				System.out.println("-회원관리 \n"
						+ " -게시글 관리\n"
						+ " -게시글 작성\n"
						+ " -댓글 작성\n"
						+ " -게시글 조회");
				break;
			case "회원":
				System.out.println("-게시글 작성\n"
						+ " -게시글 조회\n"
						+ " -댓글 작성");
				break;
			case "비회원":
				System.out.println("-게시글 조회");
				break;
			default:
				System.out.println("잘못된 접근입니다.");
		}
	}
	
	public static void practice7() {
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력하세요 : ");
		double weight = sc.nextDouble();
		double BMI = weight / (height * height);
		System.out.printf("BMI 수치 : %.2f%n",BMI);
		if(BMI >= 30) {
			System.out.println("고도비만");
		}else if(BMI >= 25 && BMI < 30) {
			System.out.println("비만");
		}else if(BMI >= 23 && BMI < 25) {
			System.out.println("과체중");
		}else if(BMI >= 18.5 && BMI < 23) {
			System.out.println("정상체중");
		}else {
			System.out.println("저체중");
		}
	
	}
	
	public static void practice8() {
//		키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//		(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
//		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		System.out.println("계산기를 사용하시겠습니까? (Yes / No)");
		String use = sc.next();
		if(use.equals("Yes")) {
			exit = true;
		}else {
			System.out.println("종료");
		}
		while(exit) {
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("부호 입력(+,-,*,/,%) : ");
		String simbol = sc.next();
		if(num1 >= 0 && num2 >= 0) {
			if(simbol.equals("+")) {
				System.out.println(num1+num2);
			}else if(simbol.equals("-")) {
				System.out.println(num1-num2);
			}else if(simbol.equals("*")) {
				System.out.println(num1*num2);
			}else if(simbol.equals("/")) {
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
					return;
				}else {
					System.out.println(num1/num2);
				}
			}else if(simbol.equals("%")){
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
					return;
				}else {
					System.out.println(num1%num2);
				}
				
			}
		}else {
			System.out.println("양수로 입력해주세요.");
		}
		System.out.println("종료하시겠습니까? (Yes/No)");
		String ex = sc.next();
		if(ex.equals("Yes")) {
			exit = false;
		}else {
			System.out.println("다음 계산 진행");
		}
	}
}
	
	public static void practice9() {
//		중간 고사 점수 : 80
//		기말 고사 점수 : 30
//		과제 점수 : 60
//		출석 회수 : 18
//		================= 결과 =================
//		중간 고사 점수(20) : 16.0
//		기말 고사 점수(30) : 9.0
//		과제 점수 (30) : 18.0
//		출석 점수 (20) : 18.0
//		총점 : 61.0
//		Fail [점수 미달]
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말고사 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과  제 점수 : ");
		double assignment = sc.nextDouble();
		System.out.print("출  석 횟수 : ");
		double attend = sc.nextDouble();
		
		double midScore = mid * 0.2;
		double finScore = fin * 0.3;
		double assignmentScore = assignment * 0.3;
		double attendScore = (attend/20) * 100 * 0.2;
		
		double total = midScore + finScore + assignmentScore + attendScore;
		System.out.println("========결과========");
		
		System.out.println("중간 고사 점수(20) : " + midScore);
		System.out.println("기말 고사 점수(30) : " + finScore);
		System.out.println("과제 점수    (30) : " + assignmentScore);
		System.out.println("출석 점수    (20) : " + attendScore);
		System.out.printf("총점 : %.2f / 100%n",total);
		if(attend > 14) {
			if(total >= 70) {
				System.out.println("[PASS]");
			}else {
				System.out.println("70점 미만 : [FAIL]");
			}
		}else {
			System.out.println("출석횟수 : " + attend+"/20");
			System.out.println("14회 미만이므로");
			System.out.println("출석횟수 부족 [FAIL]");
		}
		
	}
	
	
	public static void practice11() {
//		정수를 이용해서 4자리 비밀번호를 만들려고 하는데
//		이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
//		중복 값이 있으면 ‘중복 값 있음‘
//		자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
//		단, 제일 앞자리 수의 값은 1~9 사이 정수
		Scanner sc = new Scanner(System.in);
		System.out.print("첫째자리 정수 : ");
		String num1 = sc.next();
		System.out.print("둘째자리 정수 : ");
		String num2 = sc.next();
		System.out.print("셋째자리 정수 : ");
		String num3 = sc.next();
		System.out.print("넷째자리 정수 : ");
		String num4 = sc.next();
		String numbers = num1 + num2 + num3 + num4;
		int number = Integer.parseInt(numbers); // 문자열 numbers -> 
		System.out.println(number);             // Integer.parseint(numbers); int형 형변환
		
		if (number >= 1000 && number <= 9999) {
			if (num1.equals(num2) || num1.equals(num3) || num1.equals(num4) || // 문자열 같음을 확인하고 싶으면 equals 통해서 확인
					num2.equals(num3) || num2.equals(num4) || num3.equals(num4)) {
				System.out.println("숫자 중복값이 있습니다.");
			} else {
				System.out.println("생성 성공!");
			}
		} else {
			System.out.println("자리수가 맞지 않음");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		practice8();
	   boolean startPlug = true;
	   while(startPlug) {
	 
	   System.out.println("실행할 기능을 선택하세요.");
	   System.out.println("1. 메뉴 출력\n"
						+ "2. 짝수/홀수\n"
						+ "3. 합격/불합격\n"
						+ "4. 계절\n"
						+ "5. 로그인\n"
						+ "6. 권한 확인\n"
						+ "7. BMI\n"
						+ "8. 계산기\n"
						+ "9. P/F\n"
						+ "10. 프로그램 종료");
		/* System.out.print에서 출력할 내용이 길어져서
		 줄 바꿈으로 글을 작성하고 싶다면 \n이용해서 줄바꿈해서 출력하겠다는 표시
		 \r = 키보드 입력하는 위치를 현재 줄의 맨 처음으로 이동
		+는 ); 붙이지 않는 한 줄을 바꿔서 계속 이어서 작성할 수 있음
		*/
	    System.out.print("번호를 선택하세요 : ");
		int menuNumber = sc.nextInt();
		switch(menuNumber) {
			case 1: System.out.println("메뉴 출력");practice1();break;
			case 2: System.out.println("짝수 / 홀수");practice2();break;
			case 3: System.out.println("합격 / 불합격");practice3();break;
			case 4:	System.out.println("계절");practice4();break;
			case 5: System.out.println("로그인");practice5();break;
			case 6:	System.out.println("권한 확인");practice6();break;
			case 7: System.out.println("BMI");practice7();break;
			case 8:	System.out.println("계산기");practice8();break;
			case 9:	System.out.println("P / F");practice9();break;
			case 10: 
				System.out.println("실행을 종료하겠습니다.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
				startPlug = false;
				return;
			default:
				System.out.println("존재하지 않는 번호입니다.");
		}
		System.out.println("3초 후 초기설정으로 돌아갑니다...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2초 후 재시작");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1초 후 시작");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   }// while 중괄호
//		practice11();
		
	}
		
	}

