package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {

	public static void main(String[] args) {
		ArrayList<String> Arr = new ArrayList<>();
		
		Arr.add("사과");  // 0
		Arr.add("바나나");// 1
		Arr.add("오렌지");// 2
		System.out.println(Arr);// Arr [0,1,2] = 
		System.out.println(Arr.get(0));//0번째 =
		System.out.println(Arr.get(1));//1번째 =
		System.out.println(Arr.get(2));//2번째 =
		Arr.set(1, "포도");//바나나 -> 포도변환
		System.out.println(Arr.get(1));
		System.out.println(Arr.size());//리스트 멤버수
		System.out.println(Arr.isEmpty());//Arr 공간비었냐?
		Arr.remove(2);//오렌지 제거
		Arr.remove(0);//사과 제거
		Arr.clear();//전체 삭제
		System.out.println(Arr.isEmpty());//Arr 공간 비었냐?
		System.out.println(Arr);// [] 없으니까.
	} 
}
