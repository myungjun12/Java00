package com.kh.DeQueEx;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Deque(덱)
	양쪽 끝에서 삽입과 삭제가 모두 가능
	스택 + 큐의 기능을 모두 제공 
	양방향으로 데이터를 추가하거나 제거할 수 있습니다.
	
메서드
	addFirst()    : 맨 앞에 값 추가
	addLast()     : 맨 뒤에 값 추가
	removeFirst() : 맨 앞 값 제거 
	removeLast()  : 맨 뒤 값 제거
	getFirst()    : 맨 앞의 값이 무엇인지 확인 (제거하지 않음)
	getLast()     : 맨 뒤의 값이 무엇인지 확인 (제거하지 않음)
	
	Deque 인터페이스이기 때문에 ArrayDeque로 된 객체를 이용해서 공간 생성
	 
 * */
public class DeQueEx {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		System.out.println("add First 활용해서 값 추가 : " + deque);
		
		// 맨 뒤에 값 추가 addLast
		deque.addLast(4);
		deque.addLast(5);
		deque.addLast(6);
		System.out.println("add Last 활용해서 값 추가 : " + deque);
		
	    // 맨 앞의 값 제거 
		deque.removeFirst();
		System.out.println("remove First 활용해서 값 제거 : " + deque);
		deque.removeLast();
		System.out.println("remove Last 활용해서 값 제거 : " + deque);
		
		// 맨 앞의 값 확인 
		int 맨앞값 = deque.getFirst();
		System.out.println("맨 앞의 위치한 값 : " + 맨앞값);
		int 맨뒤값 = deque.getLast();
		System.out.println("맨 뒤의 위치한 값 : " + 맨뒤값);
		
		
	}
}
