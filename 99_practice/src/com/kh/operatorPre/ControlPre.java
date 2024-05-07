package com.kh.operatorPre;

import java.util.Scanner;

// 패키지 : 내가 만든 클래스가 들어있는 폴더 위치

// 클래스 : 실행하고자 하는 코드를 작성하는 공간 
public class ControlPre {
	// 기본 출력 메서드
	// 최종으로 출력하는 메서드가 아니지만 상황에 따라
	// 최종 메서드에서 호출해 사용할 수 있는 메서드 중 하나
	// static : 메모리에서 고정 
	public static void practice1() {// 모든 사람이 사탕을 골고루 나눠갖기
		// 스캐너를 이용해서 키보드로 입력받은 내용을 컴퓨터에 출력
		// System.in 키보드로 입력 받을 수 있게 해주는 출력 시스템
		// Scanner : 키보드로 입력받은 내용을 컴퓨터로 출력
		// 기본으로 갖춰져있기는 하지만 라이브러리에서 가져와야하기 때문에
		// import를 이용해서 가지고 옴
		Scanner sc = new Scanner(System.in);
		// 스캐너를 불러온 다음에 바로 sc로 스캐너 기능을 불러와도 되긴 하지만
		// System.out.print 를 이용해서 어떤 행동을 진행하고 있는지
		// 확인하는 작업을 진행할 것
		System.out.print("인원 수를 입력하세요 : ");
		int people = sc.nextInt();
		// 사탕 개수 입력 받기
		System.out.print("사탕 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		
		// 1인당 나눠줄 사탕 개수 계산
		int getCandies = candies/people; // 나눈 몫값 
		
		// 나눠주고 남은 사탕 개수 계산
		int reMain = candies % people; // 나눈 몫의 나머지값
		
		// 결과 출력
		System.out.println("참여 인원 : " + people);
		System.out.println("캔디 총 개수 : " + candies);
		System.out.println("동일하게 나눠가진 캔디 개수 : " + getCandies);
		System.out.println("남은 캔디 개수 : " + reMain);
	}
	// 메인 메서드 : 최종으로 실행하는 메서드
	// 이름 학년(숫자만) 반(숫자만) 번호(숫자만) 성별(M/F) 성적(소수점 아래 둘째 자리까지)
	public static void practice2() {// 키보드로 정보 입력받기 + 남 여 확인 ismale / pemale
		// Scanner 활용해서 키보드 읩력받는 창 만들어주기
		Scanner sc = new Scanner(System.in);
		// 이름 입력 받기
		System.out.print("이름 : ");
		String name = sc.nextLine();
		// 학년 입력 받기
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		// 반 입력 받기
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		// 번호 입력 받기
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		// 성별 입력 받기 Strign -> char
		// 스캐너로 char 값을 입력받고자 할 경우에는
		// charAt 을 사용해서 문자열 위치를 읽어오는 작업을 진행해야함
		// 시스템으로 예를 들면
		// System - out - print()
		// Scanner - next - charAt(숫자만 적음)
		//                    				내가 보고자하는 숫자만 적음
		// T	A	B	L	E = 5글자
		// 만약에 맨 앞글자를 보고 싶다면 
		// charAt(0) : 맨 앞 글자를 보기
		// charAt(1) : 두번째 글자를 보기
		// charAt(2) : 세번째 글자를 보기
		// charAt(3) : 네번째 글자를 보기
		// charAt(4) : 다섯번째 글자를 보기
		// TABLE의 경우 총 5글자이기 때문에
		// charAt 에서는 4까지만 작성할 수 있다
		System.out.print("성별(M/F) : ");
//		String gender = sc.next();
		char gender = sc.next().charAt(0);
		// 어떤 글자가 들어오든 관계없이 맨 앞에 있는 글자만
		// 필요하기 때문에 0으로 작성
		// 성적 입력 받기 (소수점 둘째 자리 까지만 입력받음)
		System.out.print("점수 : ");
		double score = sc.nextDouble();// 전체자리 입력받음
		// 성별에 따라 출력 문자열 설정
		// 삼항 연산자 출력 문자열 설정
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println(" 반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("성별 : " + gender);
		//printf +,
		//printf 로 %f 를 출력할 때는 소수점 자리를 지정해줘도 되고
		// 지정해주지 않아도 된다.
		// 다만 만약에 소수점 자리 위치를 지정해서 출력하길 원한다면
		// % . 출력을 원하는 소수점 위치자리 값 f
		// 예를 들어 소수점 4번째 자리까지 출력하기 원함 : %.4f
		// 소수점 2번째 자리까지 출력하길 원한다면 %.2f
		System.out.printf("성적 : %.2f",score);
	}
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		// 국어 점수 입력
		System.out.print("국어 점수 입력하세요 : ");
		int korean = sc.nextInt();
		// 영어 점수 입력
		System.out.print("영어 점수 입력하세요 : ");
		int english = sc.nextInt();
		// 수학 점수 입력
		System.out.print("수학 점수 입력하세요 :");
		int math = sc.nextInt();
		// 입력받은 점수로 합계 계산
		// 점수 총합 = 국어 영어 수학
		int total = korean + english + math;
		// 총 점수 나누기 3을 해서 평균 점수 계산
		// 점수가 무조건 소수점 이외 정수만 나온다는 보장이 없기 때문에 
		// 실수(소수점 자리가 있는 수) 가 나온다는 가정에 진행
		double average = (double)total/3.0;
		System.out.println("국어점수 : " + korean);
		System.out.println("영어점수 : " + english);
		System.out.println("수학점수 : " + math);
		System.out.println("과목 합계 : " + total);
		System.out.println("과목 평균 : " + average);
		
		
	}
	// 2개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면
	// true 아니면 false 출력
	public static void practice4() {

		Scanner sc = new Scanner(System.in);
		// 첫 번째 수 입력받기
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// == true == 양쪽에 있는 값이 같으면 true
		// 3 == 5 false 
		// 5 == 5 true
		// != 같이 다르면 true
		// 3 != 3 false
		// equal
		boolean result = num1 == num2;
		System.out.println("num1 과 num2의 결과 : " + result);
	}
	// 실습 문제 4번 응용 
	// 두개의 수를 키보드로 입력 받아 입력 받은 수가 모두 다르면 true
	// 모두 같으면 false 
		public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 출력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 출력 : ");
		int num2 = sc.nextInt();
		boolean result1 = num1 != num2;
		System.out.println("두 수가 같으면 = " + result1); // false
		boolean result2 = num1 == num2;
		System.out.println("두 수가 같으면 = " + result2); // true
	}
		
		
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수 3 입력 : ");
		int num3 = sc.nextInt();
		boolean result = (num1==num2) && (num2==num3);
		System.out.println("num1 : " + num1 + ", num2 : " + num2 + ", num3 : " + num3 );
		System.out.println("result : " + result);
//		if(num1==num2&&num2==num3) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
	}
	
	public static void main(String[] args) {
		// 작성해준 메서드 중에서 실행이나 출력하고자 하는 메서드 작성
//		practice1();
//		practice2();
//		practice3();
//		practice4();
		practice5();
	}

}
