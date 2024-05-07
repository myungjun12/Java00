package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
//메서드
	//기본 생성자
	public ArrayPre() {
		
	}
	//void
	public void practice1() {
		//배열을 사용해서 전체 합 구하기
		//배열을 사용할 때 제일 먼저
		//숫자인지 문자열인지 문자인지 실수인지 구분을 해준 후 [] 표시 작성
		
		// index     0  1  2  3  4    length : 5
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;
		
		// for - eaca문 처음부터 끝까지 반복해서 무언가를 진행할 때 사용
		
		for (int 숫자 : num) {
			// num 안에 있는 모든 숫자가 하나씩 숫자 안에 들어가고
			// 숫자들의 합
			result += 숫자; //{ 1 + 2 + 3 + 4 + 5
		}
		System.out.println("숫자들의 합 : " + result);
	}

	public void practice2() {
		//AraayList 사용해서 물건 추가하기
		ArrayList<String> goods = new ArrayList<>();
		//상품을 추가할 떄는 add 더하기
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("T  V");
		goods.add("에어컨");
		
		//모두 보기 2가지
		System.out.println(goods);
		for(String product : goods) {
			System.out.println(product);
		}
	}

	public void practice3() {
		//배열을 사용해서 최대값 찾기
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0];
		for(int num : numbers) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("최대값 : " + max);
	}

	public void practice4() {
		//찾음 못찾음 ~~!
		//과일가게 사과 바나나 딸기 오렌지
		String[] fruits = {"사과","바나나","딸기","오렌지"};
		
		String search = "키위";
		boolean found = false; // 아직은 찾았는지 안찾았는지 모르기 때문에 false;
		for(String  f : fruits) {
			//만약에 내가 찾는 과일이름이 있다면 찾았다~!
			if(f.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + "찾았나요 ? " + (found ? "찾음" : "못찾음"));
	}
	
	public void practice5() {
		//스캐너 동물을 입력하고 배열에 동물이 있는지 확인할 것
		// 4 search 스캐너로 변경
		// String zoo = {"코끼리","원숭이","푸바오","토끼","공작"};
		ArrayList<String> list = new ArrayList<>();
		boolean plug = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
		System.out.print("list["+i+"] 동물 입력 : ");
		list.add(sc.next());
		}
		
		System.out.print("검색할 동물 입력 : ");
		String search = sc.next();
		
		for(String  animal: list) {
			if(animal.equals(search)) {
				plug = true;
				break;
			}
		}
		System.out.println(search+ "이(가) 리스트에 있나요?" +(plug ? "존재합니다" : "존재하지 않습니다."));
	}
}
