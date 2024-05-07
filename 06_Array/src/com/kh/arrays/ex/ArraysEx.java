package com.kh.arrays.ex;

import java.util.Arrays;

/*
 Arrays
 	배열과 관련된 다양한 작업을 쉽게 처리할 수 있도록 도와줌
 	정렬, 복사, 비교
메소드
sort() : 배열을 정렬
copyOf() : 배열을 복사해서 똑같은 배열을 만들어줌
equals() : 두 배열이 똑같은지 비교
fill() : 배열을 모두 지정된 값으로 채우기
toString() : 배열을 문자열로 변경 보여줌

asList() : 배열을 리스트로 변환해서 추가 배열을 수정하지 않고 배열의 내용을 감싸서 보여줌

String[] 배열 = {"사과","바나나"};

//List 계열에 추가할 때
 * ArrayList<String> list = Arrays.asList(배열);
 * ArrayList<String> list = Arrays.asList("사과","바나나");
 */
public class ArraysEx {
	public static void main(String[] args) {
		//숫자 배열을 생성
				//index  0 1 2 3 4 (length : 5)
		 	int[] num = {5,8,2,4,3};
		 	//정렬하기
		 	Arrays.sort(num);
		 	
		 	System.out.println(num); // 배열 주소
		 	//배열을 오름차순으로 정렬한 것을 문자열로 변경해서 출력
		 	System.out.println(Arrays.toString(num));
		 	
		 	//배열을 복사
		 	//배열이 들어갈 변수명 먼저 생성
		 	//int 배열이면 int 배열을 생성
		 			  // 복사 붙여넣기 복사될변수 어디까지복사할것인가
		 	int[] abc = Arrays.copyOf(num,num.length);
		 	System.out.println(Arrays.toString(abc));
		 	
		 	//두 배열이 똑같이 생겼는지 확인하기
		 		// num과 abc가 똑같은 값을 가졌는지 확인
		 	boolean same = Arrays.equals(num, abc);
		 	System.out.println(same);
		 	
		 	// 0 ~ 4의 자리까지 모두 똑같은 값으로 지정해서 출력
		 	int[] equalsNum = new int[5];
		 	Arrays.fill(equalsNum, 3);
		 	
		 	System.out.println("숫자 3으로 모두 채우기 : " + Arrays.toString(equalsNum));
	}
	
 	
}
