package com.kh.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//	순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
	
		public void method1() {
			// 정수 0 1 2 [10,20,30] 출력하기
			int[] num = new int[3];
			for(int i = 0; i < num.length; i++) {
				num[i] = 10 * (i+1);
				System.out.println(num[i]);
			}
			// 문자열 각 자리에 월 화 수 목 금 토 일
			String[] str = {"월","화","수","목","금","토","일"};
			for(int i = 0; i < str.length; i++) {
				System.out.println("str["+i+"] = " + str[i] + "요일");
			}
			
			//double
			double[] dbl = new double[3];
			for(int i = 0; i < dbl.length; i++) {
				dbl[i] = 1.0+i;
				System.out.print(dbl[i] + " ");
			}
			
			//char
			char[] ch = {'A','B','C'};
			for(int i = 0; i < ch.length; i++) {
				System.out.print(ch[i] + " ");
			}
			
		}
	
		public void practice1() {
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i] + " ");
		}

	}
		
		public void practice2() {
			int[] numbers = new int[10];
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = numbers.length-i;
				System.out.print(numbers[i] + " ");
			}
		}

		public void practice3() {
//			사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
//			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num < 0) {
				System.out.println("양의 정수를 입력해주세요.");
				return;
			}
			int numbers[] = new int[num];
			for(int i = 0; i < numbers.length; i++ ) {
				numbers[i] = i+1;
				System.out.print(numbers[i] + " ");
			}
		}

		public void practice4() {
			
			Random random = new Random();
			String str[] = {"사과","귤","포도","복숭아","참외"};
			for(int i = 0; i < str.length; i++) {
				int r = random.nextInt(5);
				System.out.println("str["+r+"] "+str[r] + " ");
			}
		}
		
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자 입력 : ");
			String str = sc.next();
		}
		// 보류..
		public void practice6() {
//			“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//			입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
//			범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
			// 요일 생성         0   1   2   3   4   5   6    length[7]
			String[] week = {"월","화","수","목","금","토","일"};
			Scanner sc = new Scanner(System.in);
		while(true) {
				System.out.print("숫자 입력(0 ~ 6) : ");
				// 0 ~ 6 까지의 숫자 입력받음
				int num = sc.nextInt();
				// 0~6 숫자를 벗어난 값 안내 println ;
				if(num <= 6 || num >= 0) {
					System.out.println(week[num] + "요일");
					break;
				}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요!");
				continue;
				}
			}//while
		}
		
		public void practice7() {
			
		Scanner sc = new Scanner(System.in);
		while(true) {
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				if(num < 1) {
					System.out.println("1 이상의 값을 입력해주세요.");
					continue;
				}
				int[] numbers = new int[num];
				int sum = 0;
				for(int i = 0; i < numbers.length; i++) {
					System.out.print("numbers["+i+"] = ");
					numbers[i] = sc.nextInt();
					System.out.println(numbers[i]);
					sum += numbers[i];
				}
				System.out.println("numbers 배열 값들의 합 : " + sum);
				break;
			}
		}

		public void practice07() {
			//길이가 7인 배열을 생성
			int[] num = new int[7];
			//랜덤으로 숫자 출력하기
			//랜덤으로 숫자를 출력하는 방법
			//1.Random 객체 사용 : 조금 더 넓은 범위로 랜덤을 사용
			//2.Math 객체에서 random() 메서드 사용 : 위 Random객체보다 작은 범위로 사용 가능
							//num의 최종 길이를 알기 위해서 num.length를 사용
			for(int i = 0; i < num.length; i++) {
				num[i] = (int)(Math.random() * 45 + 1);
				System.out.println("num["+i+"] = " + num[i]);
			}
		}
		
		public void practice8() {
			
		}
		// 보류..
		public void practice9() {
//			길이가 7인 배열을 생성하고, 1 ~ 45까지 랜덤한 숫자값을 넣어서 출력
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			String[] str = new String[num];
			Random random = new Random();
			int sum = 0;
			for(int i = 0; i < str.length; i++) {
				str[i] = Integer.toString(random.nextInt(45)+1);
				System.out.println("str["+i+"] " + str[i]);
				sum += Integer.parseInt(str[i]);
			}
			System.out.println("str[]배열 값의 합 : " + sum);
		}

		public void practice10() {
			
		}
		// 보류..
		public void practice11() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			int[] numbers = new int[num];
			Random random = new Random();
			for(int i = 0; i < numbers.length; i++ ) {
				numbers[i] = random.nextInt(10)+1;
				System.out.print(numbers[i] + " ");
			}
		}

		public void practice12() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			int[] numbers = new int[num];
			Random random = new Random();
			for(int i = 0; i < numbers.length; i++ ) {
				numbers[i] = random.nextInt(10)+1;
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			int max = numbers[0];
			int min = numbers[0];
			for(int i = 0; i < numbers.length; i++) {
				if(max < numbers[i]) {
					max = numbers[i];
				}
			}
			System.out.println("최대값 : " + max);
			for(int i = 0; i < numbers.length; i++) {
				if(min > numbers[i]) {
					min = numbers[i];
				}
			}
			System.out.println("최솟값 : " + min);
		}

		public void practice13() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			int[] numbers = new int[num];
			Random random = new Random();
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = random.nextInt(10)+1;
			}
			System.out.println(Arrays.toString(numbers));
			int count = 0;
			int[] exNum = new int[num];
			
			for(int i = 0; i < numbers.length; i++) {
				boolean plug = false;
				for(int j = 0; j < exNum.length; j++) {
					if(numbers[i]==exNum[j]) {
						plug = true;
					} 
				}
				if(!plug) {	
					exNum[count++] = numbers[i];
					}
			}
			System.out.println(Arrays.toString(exNum));
		}

		public void practice14() {
//			로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
			Random random = new Random();
			int[] numbers = new int[6];
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = random.nextInt(45)+1;
				System.out.print(numbers[i] + " ");
			}
			Arrays.sort(numbers); // 오름차순정렬
			System.out.println();
			System.out.println(Arrays.toString(numbers));
			
		}

	public void practice15() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.next(); // Scanner를 통해 문자열 str 값 초기화
		char[] array_str = new char[str.length()]; // char[] array_str 단어 낱개로 넣을 공간생성 = 범위 str.length전달
		for(int i = 0; i < array_str.length; i++) { // str 범위 = char[] 범위 
			array_str[i] = str.charAt(i); // .charAt을 통해 낱개 값 전달
			System.out.println("array_str["+i+"] = " + array_str[i]);
			}
//		ex)	String[] array_str;
//			array_str = str.split("");     // split : 나누다
//			for(String s : array_str) {
//				System.out.print(s + " ");
//			}
		
		}
		
		public void practice16() {
//			사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//			배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.

			//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//			늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.

			//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
			
			Scanner sc = new Scanner(System.in);
	        ArrayList<String> strings = new ArrayList<>();
	        System.out.print("배열의 크기를 입력하세요: ");
	        int size = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < size; i++) {
	            System.out.print((i + 1) + "번째 문자열: ");
	            String input = sc.nextLine();
	            strings.add(input);
	        }
	        char choice;
	        do {
	            System.out.print("더 값을 입력하시겠습니까? (Y/N): ");
	            choice = sc.nextLine().charAt(0);
	            if (choice == 'Y' || choice == 'y') {
	                System.out.print("더 입력하고 싶은 개수: ");
	                int additional = sc.nextInt();
	                sc.nextLine(); // 개행문자 처리 (엔터값)
	                for (int i = 0; i < additional; i++) {
	                    System.out.print((size + i + 1) + "번째 문자열: ");
	                    String input = sc.nextLine();
	                    strings.add(input);
	                }
	                size += additional;
	            }
	        } while (choice == 'Y' || choice == 'y');
	        sc.close();
	        System.out.println(strings);
	    }


		public void practice17() {
//			사용자가 입력한 값이 배열에 있는지 검색하여
//			있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//			단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
			String[] chickenMenu = {"양념치킨","후라이드치킨","간장치킨"};
			//사용자로부터 치킨 이름 입력 받기
			Scanner sc = new Scanner(System.in);
			System.out.print("치킨 이름을 입력하세요 : ");
			String inputChic = sc.next();
			//배열에 사용자가 입력한 치킨이 있는지 검색
			// for-each 문을 사용해서 치킨이 있는지 확인하는 작업
			// 만약에 치킨이 존재한다면 found = true; break;
			// 만약에 치킨이 존재한다면 배달가능 출력 
			// 존재하지 않는 다면 ㅇㅇ 치킨은 없는 메뉴입니다 출력
			boolean found = false;
			for (String chicken : chickenMenu) {
				if(chicken.equals(inputChic)) {
					found = true;
					break;
					}
				}
				if(found) {
					System.out.println(inputChic + "배달 가능! 합니다.");
				}else {
					System.out.println(inputChic +"는 없는 메뉴입니다.");
				}
			}
		}	




