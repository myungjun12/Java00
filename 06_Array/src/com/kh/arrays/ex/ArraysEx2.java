package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

	//기본 생성자
	public ArraysEx2(){
		
	}
	
	public void method1() {
		//숫자 배열 생성하기
		int[] num = {6,4,2,3,5,7,9};
		
		//숫자 정렬하기
		Arrays.sort(num);
		//정렬된 내용 출력하기 
		System.out.println(Arrays.toString(num));
		//num 배열 복사하기 abs 
		int[] abc = Arrays.copyOf(num, num.length);
		System.out.println(Arrays.toString(abc));
		//num과 abc가 같은지 비교하기 
		System.out.println(Arrays.equals(num, abc));
		//Arrays.fill을 이용해서 숫자 6으로 모두 채우기
		int[] i = new int[5];
		Arrays.fill(i, 6);
		System.out.println(Arrays.toString(i));
	}
	
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}
}
