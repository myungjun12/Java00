package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPre {
	
	public void practice() {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("가,나,다,라,마"));
		list.add("사");
		System.out.println(list);
		Iterator<String> repeat = list.iterator();
		while(repeat.hasNext()) {
			String str = repeat.next();
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		//100,10,20,30,50,70
		//ArrayList<Integer> 숫자들 = new ArrayList<>();
		//1. 숫자들.add();
		//2. new ArrayList<>(Arrays.asList(""));
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100,10,20,30,50)); 
		
		numbers.add(70);
		System.out.print("numbers size : ");
		System.out.println(numbers.size());
		//Iterator 생성
		Iterator<Integer> repeat = numbers.iterator();
		// 다음으로 올 값이 존재한다면 반복한다.
		while(repeat.hasNext()) {
			int num = repeat.next();
			System.out.println(num);
		}
		//while문 사용해서 hasNext()로 다음 요소가 있는지 확인하고
		//next()로 출력하기
		IteratorPre it = new IteratorPre();
		it.practice();
	}
	
	
	
}
