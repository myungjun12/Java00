package com.kh.practice.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX {
	//기본 메서드
	
	// LoopForEX 에서 출력하길 원한다면
	// public static void guguDan 으로 static을 추가해준 다음에
	// public static void main(String[] args){
	// guguDan();
	//}
	// 출력용 클래스를 만들어서 출력하기 LoopForRun
	public void guguDan() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신 것을 환영합니다.");
		
		// 구구단을 0을 입력하기 전까지 반복해서 출력하기
		// 반복하기 위해 while문 사용
	while(true) {
		System.out.println("종료를 원한다면 0을 입력해주세요.");
		  System.out.print("출력할 단을 입력해주세요 : ");
		  	int dan = sc.nextInt();
				// 만약에 숫자 0이 들어오면 프로그램 종료하기
				if(dan == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
					}
					for( int i = 1; i <= 9 ; i++ ){
						System.out.println(dan + " X " + i + " = " + dan * i);
					}
				}
			}

	public void guguDan2() {
		// 1. 스캐너로 구구단 값 입력받기
		// 2. int dan = sc.nextInt();
		// 3. for 문을 활용해서 9번부터 1번까지 출력하기
		//    for ( int a = 1; 조건 ; a-- ){
		//		System.out.println("거꾸로 출력하기");
		// }
		// 4. 종료를 원할경우 0을 입력해주면 종료하기 while문 추가하기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("구구단 거꾸로 출력하기");	
				System.out.println("종료를 원할 경우 0을 입력하세요.");	
					System.out.print("단 입력 : ");
						int dan = sc.nextInt();
							if(dan == 0) {
								break;
								}// continue : 자주 사용되지 않음
								 // if 1~ 9까지만 입력 가능하도록 조건
									if(dan < 1 || dan > 9) {
										System.out.println("1부터 9까지의 숫자를 입력해주세요.");
										continue; // 아래 내용을 무시하고 while 반복문으로 돌아간다.
										}	
									for( int i = 9; i >= 1 ; i-- ){
										System.out.println(dan + " X " + i + " = " + dan * i);
									}
								}
							}
					
	public void guguDan3() {
		// int dan = 원하는 단만 지정해서 출력
		
		// 1단부터 9단까지 출력
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println("****** " + dan + " 단!******");
				// 1단에서 부터 1 ~ 9 를 곱해준 값을 출력
					for(int num = 1; num <= 9; num++) {
						System.out.println(dan + " X " + num + " = " + dan * num);
					}
					System.out.println();
				}
			}
	
	public void guguDan4() {
		for(int 단 = 2; 단 <= 9; 단++) {
			System.out.println("******** " + 단 + "단 ********");
				for(int 숫자 = 1; 숫자 <= 9;숫자++) {
					System.out.println(단 + " X " + 숫자 + " = " + 단 * 숫자);
				}
			}
		}

	public void randomNumber() {
		// Random 불러와 / 내가 지정한 범위에서 / 숫자를 랜덤으로 출력하기
			Random random = new Random(); // 로또 번호 생성
			 // nextInt() 안에 숫자를 넣어서 어디서부터 어디사이에서 랜덤으로 숫자가 나와야하는지
			// 범위를 지정할 수 있음
			int randomNumber = random.nextInt(); // 0 ~ 4 사이에 숫자가 나옴
			// 숫자를 셀 때 코드 안에서는 -1~ 정수 양수 0 부터 시작 
			// 랜덤으로 지정한 숫자 -1 
			System.out.println("랜덤숫자 : " + randomNumber);
			
		}
	
	public void randomFor() {
			// Random 호출하기
			Random ran = new Random();
			// 랜덤숫자 3개 출력 1 ~ 10 사이의 숫자
			for(int num = 1; num <= 3; num++) {
				// 랜덤으로 숫자를 만들어주기
				int randomNumber = ran.nextInt(10) + 1;
				System.out.println("랜덤숫자 : " + num + "번 : " + randomNumber);
			}
		}
	
	public void randomFor2() {
		// 랜덤으로 1 ~ 45 번호 6자리를 for문을 이용해서 출력
			Random random = new Random();
				for(int num = 1; num <= 6; num++) {
					int lottoNumber = random.nextInt(45)+1;
						//if 랜덤 숫자가 같다면 번호를 제외하고 출력하기 .. 알고 싶은데..
						System.out.println("랜덤 추첨 번호 : " + num + "번 : " + lottoNumber);
					}
				}
										
	// 1부터 10까지의 숫자 중에서 홀수만 출력하기
	// 홀수 = odd
		public void oddNum() {
			for(int num = 1; num <= 10;num++) {
				// 만약에 숫자가 홀수라면 출력하기
				if (num % 2 != 0) { 
					System.out.print(num + " ");
				}
			}
		}
		// 짝수만 1 ~ 10까지 출력하기
		public void even() {
			for(int num = 1; num <= 10; num++) {
				if(num % 2 == 0) {
					System.out.print(num + " ");
				}
			}
		}

		public void squareStar() {
			int star = 3;
			for(int i = 0; i < star; i++) {//한줄출력 0 1 2
				
				for(int j = 0; j < star; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		
		//삼각형 모양의 별 출력 
		public void triangle() {
		
			for( int i = 0; i < 5 ; i++ ){
				for( int j = 0; j < 5-(i+1) ; j++ ){
					System.out.print(" ");
				}
				for( int k = 0; k < 1+(i*2) ; k++ ){
					System.out.print("*");
				}
				System.out.println();
			 }
		}

		public void numberGame() {
			//숫자 맞추기 게임
			// 숫자를 맞출 때까지 계속 문제를 풀도록 하기 while(true)
			// for 기회 2번 주기
			// if 문 수정해서 숫자값이 정답보다 작으면 숫자가 작습니다.
			// h int 숫자값이 정답보다 높으면 숫자가 너무 큽니다.
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
//			while(true) {	
				//랜덤으로 만드렁진 숫자가 무엇인지 키보드로 맞추는 게임 
				int randomNumber = random.nextInt(3) + 1; // 1 ~ 3
				System.out.println("숫자를 맞춰보세요");
				for(int i = 0; i < 3;i++) {
				int guest = sc.nextInt(); // 게스트가 입력한 숫자 가져오기
				// 만약에 숫자를 맞췄다면 숫자를 맞췄습니다.
				if(guest == randomNumber) {
					System.out.println("축하합니다. 숫자를 맞췄습니다.");
					break;
				}else {
					System.out.println("숫자를 틀렸습니다.");
//					System.out.println("정답은 : " + randomNumber);
					if(guest < randomNumber) {
						System.out.println("정답보다 높습니다.");
					}else {
						System.out.println("정답보다 작습니다.");
					}
				} 
				
				
				System.out.println("게임을 다시 시작하겠습니까? (1번 yes / 2번 no)");
				int playAgain = sc.nextInt();
				// 만약에 2번을 누르면 break;
				if(playAgain==1) {
					System.out.println("게임을 재시작합니다.");
					continue;
				}else {
					break;
				}
				
				}
				
		}
//			}
		
}

     
     
     
		
		

				
						
					