package com.kh.StackEx;

import java.util.Stack;

/*
Stack(스택) 
	데이터를 저장하는 자료구조
	LIFO / Last In-First Out : 마지막에 추가된 항목이 먼저 제거
	뒤로 가기 기능, 실행 취소 기능
	
	 pop() : 맨 위 값을 제거하고 반환(보여줌)
	peek() : 스택이나 큐에서 맨 위 또는 맨 앞에 있는 데이터를 반환(보여줌) 하지만 제거하지는 않음 
	push() : 스택에서 값을 추가할 때는 push를 사용하거나 add를 사용해서 추가
			주로 스택에서는 push를 사용
			add는 보통 리스트나 컬렉션에서 주로 사용
			Stack 클래스가 Vector를 상속받아 만들어진 클래스이기 때문에 add 가능
	isEmpty() : 값이 비어있는지 확인
	size() : 크기 확인
 * */
public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		
		// 스택에서 맨 위 데이터를 확인하고 지우기
		// pop() : 맨 위에 있는 데이터를 제거하고 그 값을 반환(보여줌)
		int top = stack.pop();
		System.out.println(top);
		
		// peek() : 스택에서 맨 위 데이터 확인
		int numCheck = stack.peek();
		System.out.println(numCheck);
		
		// isEmpty() : 스택이 비어있는지 확인
		boolean isEmpty = stack.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("===========Stack 2===========");
		
		Stack<Integer> stack2 = new Stack<>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		int 사라진값 = stack2.pop();
		System.out.println("가장 마지막에 보여주고 사라진 stack2의 값 : " + 사라진값);
		
		int 맨위값 = stack2.peek();
		System.out.println("stack2의 맨 위 값은 : " + 맨위값);
		
		boolean 값존재유무 = stack2.isEmpty();
		System.out.println("stack2가 비어있습니까 ? :  " + 값존재유무);
		
		int 사이즈 = stack2.size();
		System.out.println("stack2의 사이즈 : " + 사이즈);
		
	}
}
