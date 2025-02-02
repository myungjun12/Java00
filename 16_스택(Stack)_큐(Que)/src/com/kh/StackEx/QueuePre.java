package com.kh.StackEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {

	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(80);
		que.offer(60);
		que.offer(30);
		que.offer(20);
		
		int 맨앞제거되는값 = que.poll();
		System.out.println(맨앞제거되는값);
		int 맨앞의값 = que.peek();
		System.out.println(맨앞의값);
		System.out.println("que 비어있는지 확인 : " + que.isEmpty());
		System.out.println("que 공간 값 확인");
		System.out.println(que);
		que.remove(30);
		System.out.println(que);
		que.clear();
		System.out.println(que);
		System.out.println(que.isEmpty());
		System.out.println(que.size());
	}
}
