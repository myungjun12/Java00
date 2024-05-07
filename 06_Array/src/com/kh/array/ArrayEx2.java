package com.kh.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		//for문을 활용한 배열 출력하기
		int[] numbers = new int[5];
		
		//1부터 4까지 배열에 숫자를 넣기
		//index 0부터 시작하기 떄문에 i = 0
		//length = 길이
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i] + " ");
		}
	}
}
