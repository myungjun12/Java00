package com.kh.array.list.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEx2 {
//메서드
	// 기본 생성자
	public ArrayListEx2() {

	}

	public void method1() {
		// 딸기 바나나 사과
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		arr1.add("딸기");
		arr1.add("바나나");
		arr1.add("사과");
		arr2.add("A");
		arr2.add("B");
		arr2.add("C");
		arr1.addAll(arr2); // arr1에 arr2 바로 뒤 공간을 줘서 합친다
		arr2.clear();// arr2 비움 
		System.out.println(arr2.isEmpty());// arr2 비었습니까 o
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));
		System.out.println(arr1.get(5));
		System.out.println(arr1.set(1, "키위"));
		System.out.println(arr1.size());
		System.out.println(arr1.remove(1));
		System.out.println(arr1.isEmpty());
		for (int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i) + " ");
		}
//	 ex2)	for (String s : arr1) {
//			System.out.print(s + " ");
//		}
		// 앞으로 사용할 for 문
		System.out.println();
		System.out.println("=======================");
		for (String 과일 : arr1) {
			System.out.print(과일 + " ");
		}
		System.out.println();
		arr1.clear();
		System.out.println(arr1.isEmpty());
		// get 0 1 2 사용해서 각 index 자리에 값 출력하기

		// set 바나나 -> 키위 수정

		// size를 이용해서 크기 확인
	}

	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		// 동물 사자 호랑이 고양이 강아지
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		animal.add(0, "코알라");
		System.out.println(animal.get(0));
		System.out.println(animal.size());
		animal.set(3, "토끼");
		animal.remove(4);// animal.remove("강아지");!!
		System.out.println(animal.get(0));
		System.out.println(animal.get(1));
		System.out.println(animal.get(2));

		Collections.sort(animal); // ㄱ~ㅎ 정렬
		for (String name : animal) {
			System.out.print(name + " ");
		}
		System.out.println();
		animal.clear();
		System.out.println(animal.isEmpty());
	}

	public void method3() {
		//피자 가게
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자메뉴 ===");
		pizza.add("고구마"); // pizza 0 1 2 생성
		pizza.add("포테이토");
		pizza.add("페페로니");
		//모두 보기
		System.out.println(pizza);
		
		System.out.println(pizza.get(0));// pizza 공간 0 1 2 출력
		System.out.println(pizza.get(1));
		System.out.println(pizza.get(2));
		
		pizza.set(2,"파인애플"); // 페페로니 -> 파인애플
		
		pizza.remove("파인애플"); // 파인애플 삭제
		
		for(String menu : pizza) {
			System.out.print(menu + " ");//pizza 공간에 객체 리스트(menu라고 선언) 나열
		}
		System.out.println();// 줄바꿈
		
		System.out.println("피자가게가 사라질 예정입니다.");
		pizza.clear(); // 피자 객체 전체 삭제
		System.out.println(pizza.isEmpty()); // 피자공간 비었는지 ? true/false 
	}
	
	// 메인 최종 출력
	public static void main(String[] args) {
		ArrayListEx2 list = new ArrayListEx2();
		list.method3();

	}
}
