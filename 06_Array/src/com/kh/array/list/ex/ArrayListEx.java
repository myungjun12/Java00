package com.kh.array.list.ex;

import java.util.ArrayList;
import java.util.Arrays;

/*
 ArrayList
 리스트는 배열과 비슷하지만 크기가 제한이 되어있지 않기 때문에 다름
 원하는 만큼 담을 수 있음
 
 이름 ArrayList로 사용하지 말 것.!
 
 ArrayList<자로형> 변수명 = new ArrayList<자료형>();
 wrapper 클래스
 int 	-> Integer
 String -> String
 double -> Double
 
 
 add 		추가
 get 		반환
 set 		수정
 remove 	삭제
 size 		개수 확인
 isEmpty 	비었는지 확인
 clear 		모두 삭제
 */
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		// index 자리위치 0
		// 자리가 비어있기 때문에 true
		System.out.println(arr.isEmpty());
		//숫자 추가하기
		arr.add(10); // 0
		System.out.println("추가 확인 : " + arr.get(0));
		System.out.println(arr.isEmpty());
		//크기 확인 size 
		System.out.println(arr.size());
		//set 수정하기 위치 어떻게 수정할거야?
		//     key value
		arr.set(0, 20);
		System.out.println("수정 후 : " + arr.get(0));
		//삭제
		arr.remove(0);
		//삭제했기 때문에 아무것도 없음
		System.out.println(arr.isEmpty());
	}
}
