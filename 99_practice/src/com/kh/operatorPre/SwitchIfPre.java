package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {

	public static void practice8() {
		// 주민번호를 이용해서 남자인지 여자인지 구분해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-)포함 입력 : ");
		String idNumber = sc.next();
		System.out.println(idNumber.charAt(7));
		// 940108-1645987
		String gender;
		char genderCode = idNumber.charAt(7);
		// 1이나 3이 들어온다면 남자
		// 2나 4가 들어온다면 여자
		// "" String '' char / char를 사용해서 숫자값을 가져오기 때문에 '' 사용
		if(genderCode == '1' || genderCode == '3') {
			gender = "남자";
		}else if(genderCode == '2' || genderCode == '4'){
			gender = "여자";
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
			return; // 결과값 else가 나올 경우 gender변수가 들어가 있지 않기 때문에 오류뜬다.
			// gender를 else에서도 사용해주거나 return으로 종료시켜야한다.
		}
		//여자인지 남자인지에 대한 결과
		System.out.println("입력한 주민번호는 " + gender + "입니다.");
	}
	
	                  // 카멜식 중간에 시작시 대문자
	
	public static void castingPractice1() {
	// 유니코드 출력 16진수
	// 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하기 위한 방식
	// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
	Scanner sc = new Scanner(System.in);
	System.out.print("문자 입력 : ");
	char inputChar = sc.next().charAt(0);
	int unicode = inputChar;
	System.out.println("입력한 문자 : " + inputChar + " 의 유니코드는 " + unicode + " 입니다.");
	}

	public static void castingPractice3() {
		// 주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;//기본값이 double 이기때문에 float로 변경해주는 f 붙여줌
		double dNum = 2.5;
		char ch = 'A';
		System.out.println(iNum1 / iNum2); // 몫 : 2
		System.out.println((int)dNum); // 2.5 실수->정수
		//double 8byte int 4byte 강제 형변환을 (int) 시켜줄 것
		System.out.println((double)iNum2 * dNum);//10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double) 필수가 아니다
		System.out.println((double)iNum1); // 10.0
		System.out.println((double)iNum1 / iNum2); // 2.5
		System.out.println(dNum); // 2.5
		System.out.println((int)fNum); // 3 실수형 -> 정수형
		System.out.println((int)(iNum1/fNum)); // 3
		// float는 소수점 이하 6자리 까지만 보여줌 기본으로
		System.out.println((double)iNum1 / fNum); // 3.333333
		// int와 float는 같은 크기의 byte를 가지고있다
		System.out.println((double)iNum1 / fNum); //3.333333333335
		System.out.println(ch); // A
		System.out.println((int)ch); // 65
		System.out.println(ch + iNum1); // 75
		// 큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨짐
		// 65 + (int iNum1 = 10) = 75
		System.out.println((char)(ch+iNum1)); // K
	}

	public static void controlPractice1() {
		// 키보드로 입력받고 입력 수정 조회 삭제 종료 버튼눌러서 시작하기
		Scanner sc = new Scanner(System.in);
		// 메뉴 출력하기
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		// 메뉴 번호 입력 받기
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		//선택된 메뉴에 따라 동작 수행
		switch(menuNumber) {
		case 1 : 
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2 : 
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3 : 
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4 : 
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
			default : 
				System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	public static void main(String[] args) {

		
//		practice8();
//		castingPractice1();
//		castingPractice3();
		controlPractice1();
	}
}
