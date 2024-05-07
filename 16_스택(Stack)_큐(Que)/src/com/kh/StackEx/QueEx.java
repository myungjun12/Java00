package com.kh.StackEx;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue(큐)
	먼저 추가된 항목이 먼저 제거
	First In First-Out : 먼저 추가된 항목이 가장 먼저 제거
	데이터가 줄을 서있는 것과 유사하며, 가장 먼저 들어간 항목이 가장 앞에 위치
	대기, 이벤트 처리
	
 메서드 
 	offer() : 큐에 공간이 충분한 경우 값이 추가되고, 추가되면 true 반환 
 			추가되지 못하면 예외
 			add를 사용할 수 있지만 offer와 마찬가지로 공간이 없으면 예외 처리가 된다.
	poll() : 값을 제거하고 반환 만약에 비어있는 경우 null 반환 
	remove() : poll 동일한 기능을 수행하지만, 비어있는 경우 예외를 던짐
	peek() : 맨 앞에 있는 값을 반환하지만 제거하지는 않는다.
	element() : peek 처럼 맨 앞에 있는 값을 반환하지만 제거하지는 않음. 비어있는 경우 예외를 던짐
 * */
public class QueEx {
		
	public static void main(String[] args) {
		//Queue 인터페이스 이기 때문에 직접적으로 객체생성 불가
		//Queue                  LinkedList 사용해서 많이 작성 
		Queue<Integer> que = new LinkedList<>();
		
		// 큐에 데이터 추가
		que.offer(1);
		que.offer(2);
		que.offer(3);
		
		// 큐에서 맨 앞에 있는 데이터를 확인 제거 
		int 맨앞 = que.poll(); // 맨 앞의 데이터 확인후 제거 
		System.out.println(맨앞);
		//큐 맨 앞에 데이터 확인 
		int 데이터확인 = que.peek(); // 1제거 후 맨 앞 2 확인
		System.out.println(데이터확인);
		
		boolean isEmpty = que.isEmpty();
		System.out.println("비어있나요 ? " + isEmpty);
	}
}
