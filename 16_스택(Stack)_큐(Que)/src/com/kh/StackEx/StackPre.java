package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	//main
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(20);
		stack.push(50);
		stack.push(10);
		stack.push(40);
		stack.push(30);
		int removeStack = stack.pop();
		System.out.println("제거된 제일위의 값 : " + removeStack);
		int top = stack.peek();
		System.out.println("현재 스택의 제일 위의 값 : " + top);
		boolean isEmpty = stack.isEmpty();
		System.out.println("stack 값이 비어있습니까 ? : " + isEmpty);
		int size = stack.size();
		System.out.println("stack 길이 : " + size);
	}
}
