package com.kh.SetEx;

import java.util.TreeSet;

/*
TreeSet
중복을 허용하지 않고, 값을 자동으로 정렬하는 구조
검색 트리의 형태로 데이터를 저장하며, 자동으로 정렬된 상태 유지

자동으로 0 ~ 9, A ~ Z, a-z, ㄱ-ㅎ 정렬해줌

add( ) : 추가
remove() : 제거
contains() : 지정된 값이 있는지 확인
isEmpty() : TreeSet이 비어있는지 확인
size () : 개수 확인
first() : 가장 작은 데이터 반환
last() : 가장 큰 데이터를 반환
clear() : 모든 값 제거
 * */
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		//추가
		ts.add(5);
		ts.add(2);
		ts.add(1);
		System.out.println("TreeSet 모두 보기 : " + ts);
	
		ts.remove(2);
		System.out.println("TreeSet 모두 보기 : " + ts);
		
		//값 포함이 되어있는지 확인
		System.out.println(ts.contains(5));
		
		//비어 있는지 확인
		System.out.println(ts.isEmpty());
		
		//데이터 갯수
		System.out.println(ts.size());
		
		//가장 작은 값
		System.out.println(ts.first());
		
		//가장 큰 값
		System.out.println(ts.last());
		
		//모든 값 제거
		ts.clear();
		System.out.println("모두 보기 : " + ts);
		
	}
}
