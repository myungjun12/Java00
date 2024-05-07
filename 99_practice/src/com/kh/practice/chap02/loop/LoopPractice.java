package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	// Greeting : 안녕하세요 인사를 출력하는 메서드
	public void Geeting() {
		System.out.println("안녕하세요.");
	}
	// 출력 메서드
	public void Greeting2() {
		System.out.println("반갑습니다.");
	}

	public void practice1() {

	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num = sc.nextInt();
	if(num < 1) {
		System.out.println("1 이상의 숫자를 입력해주세요.");
		return;
	}
//	int i = 1;
//	while(i <= num) {
//		System.out.print(i + " ");
//		i++;
//	}
	for(int i = 1; i <= num; i++) {
		System.out.print(i + " ");
	}
	System.out.println();
  }

	public void practice2() {
		
		// 1 미만의 숫자가 입력됐다면
		// 1 이상의 숫자를 입력해주세요가 출력되면서
		// 다시 사용자가 값을 입력하도록 하기 
		// 입력 받기 위해서는 스캐너를 통해서 입력 받기
		
		Scanner sc = new Scanner(System.in);
	// whlie 바깥에서는 num ??.
    int num;
	while(true) {
		System.out.print("정수 입력 : ");
			 num = sc.nextInt();
				if(num < 1) {
					System.out.println("1 이상의 숫자를 입력해주세요");
						}else {
							break;
							}
					}// while 종료
			System.out.println("1부터 " + num + " 까지의 숫자들");
			int i = 1;
			while( i <= num) {
				System.out.print(i + " ");
				i++;
			}
			System.out.println();
		}        //while문 안에 지역변수 num
	
	public void practice3() {
		//사용자로부터 한 개의 값을 입력받아
		Scanner sc =new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 미만의 숫자를 입력하셨습니다. 재 입력 해주세요.");
			}else {
				break;
			}
		}
		System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다.");
		while(num >= 1) {
			System.out.print(num + " ");
			num--; 
		}
		System.out.println();
		//1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하기
		//단 입력한 수는 1보다 크거나 같아야 함
	}
	
	public void practice4() {
		//1미만의 숫자가 입력되면 1이상의 숫자를 입력해주세요 출력되면서
		//사용자가 값을 입력하도록 하기 
		//숫자를 입력받은 숫자부터 1까지 출력하기
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("숫자 입력 : ");
			 num = sc.nextInt();
			 // 1 미만의 숫자가 들어오면!
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				// 조건에 관계없이 do로 인해 무조건 1회 실행되는 것이기 때문에 return이나 break를
				// 작성해주지 않아도 될 경우가 많음
			}
		}while(num < 1);
		// 만약에 1보다 커서 밑으로 내려온다면
		// num 부터 1까지 거꾸로 출력해주는 for문을 작성해주기
		for(int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice12() {
	Scanner sc = new Scanner(System.in);
	// 두 정수와 연산 기호를 받아서 계산하는 메소드
	String operator; // char를 사용할 경우 : charAt
			while(true) {
				System.out.print("프로그램 종료를 원할 경우 exit를 입력하세요.");
				System.out.print("연산입력(+,-,*,/) : ");
							operator = sc.next();
							//만약에 exit를 입력해서 프로그램 종료를 원할 경우
							//문자열(String)로 비교할 경우 equals 사용
									if(operator.equals("exit")) {
										System.out.println("프로그램을 종료합니다.");
										break;
										}
											//정수1과 정수2를 입력 받아서 계산하기
											System.out.print("정수1 : ");
											int 정수1 = sc.nextInt();
											System.out.print("정수2 : ");
											int 정수2 = sc.nextInt();
											//정수1과 정수2 계산에 대한 결과(=result)
											int 결과;
											//switch case "+"'''
							if(operator.equals("+")) {
								결과 = 정수1 + 정수2;
							}else if(operator.equals("-")) {
								결과 = 정수1 - 정수2;
							}else if(operator.equals("*")) {
								결과 = 정수1 * 정수2;
							}else if(operator.equals("/")) {
								if(정수2 == 0) {
									System.out.println("0으로 나눌 수 업습니다.");
								}
								결과 = 정수1 / 정수2;
							}else if(operator.equals("%")) {
						if(정수2 == 0) {
							System.out.println("0으로 나눌 수 없습니다.");
						}
						결과 = 정수1 % 정수2;
					}else {
						System.out.println("잘못 입력했습니다.");
						continue;
					}
					System.out.println(정수1 + " " + operator + " " + 정수2 + " = " + 결과);
				}
			}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num ; i++ ){
			sum += i;
			if(i < num) {
				System.out.print(i + " + ");
			}else {
				System.out.println(i + " = ");
			}
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}
	
	public void practice6() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 수를 입력해주세요.");
			return;
		}
		System.out.println(num1 + "부터 " + num2 + "까지의 수 나열");
		for( int i = num1; i <= num2 ; i++ ){
			System.out.print(i + " ");
		}
		
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
	System.out.println("num1부터 num2 까지의 수를 나열해주세요.");
		while(true) {
			System.out.print("정수 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 2 입력 : ");
			int num2 = sc.nextInt();
			// Math에 있는 random보다 Random에 있는 랜덤 기능이 더 많지만
			// 둘 다 사용하는데 큰 차이는 없다.
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
				System.out.println(min + "부터 " + max + "까지의 수를 나열합니다.");
						for( int i = min; i <= max ; i++ ){
							System.out.print(i + " ");
							}
							System.out.println();
							break;
						}
					}
				
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 출력 할 단을 입력하세요 : ");
		int dan = sc.nextInt();
		for(int i = 1; i <= 9;i++) {
			System.out.println(dan + " X " + i + " = " + dan * i);
		}
	}

	public void practice9() {

//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
			int dan = sc.nextInt();
			if(dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
					return;
				}
						for( int i = dan; i <= 9;i++) {
							System.out.println("======= " + i + "단! =======");
							for(int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
				System.out.println();
			}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("단 입력 : ");
			int dan = sc.nextInt();
			if (dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			for (int i = dan; i <= 9; i++) {
				System.out.println("======= " + i + "단! =======");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
				System.out.println();
			} // for fin
		} // while
	}

	public void practice13() {
		//키보드로 숫자를 입력 받고 별찍기를 진행한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 입력받은 수만큼 세로줄 출력 ex) 세로로 이 + 한자 二 칸
		for(int i = 0; i < num; i++) {
			//한줄씩 별을 만들어주고 싶음
			// 한 줄 - 하나 두 줄 - 둘 세 줄 - 삼 ... num줄 = num
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			for(int k = 0; k < num-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		/*
		 첫번째 줄에서 가장 많은 별을 출력 / 마지막에서 가장 적은 별을 출력
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();                   // num = 5입력 받았다고 가정
		for(int line = 1; line <= num ; line++) { // 세로줄의 갯수 1 ~ num까지 생성 5줄까지 조건성립 ↓ star -- 
			for(int star = num; star >= line; star--) { // 별은 num(5) ~ line(1)개 첫줄 5 4 3 2 1 5개 생성
				System.out.print("*");       // 다음줄은 star -- 되면서 num(5) ~ line++(2) 5 4 3 2 4개 생성
			}      					// ' ' ' ' 이후로 5 4 3 2 1 생성 line이 num보다 커졌을경우 조건미성립 생성불가
			System.out.println();
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int size = sc.nextInt();
		for(int line = 0; line < size; line ++) {
			System.out.println("====line"+ line +"===========");
			for(int blank = 0; blank < line; blank++) {
				System.out.print(" ");
			}
			for(int star = 0; star < size-line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}



			
