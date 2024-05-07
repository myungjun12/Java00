package com.kh.practice.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void practice() {
		ArrayList<String> list = new ArrayList<>(/*생략가능*/);
		String str = "application";
		list.add("a");
		list.add("p");
		list.add("p");
		list.add("l");
		list.add("i");
		list.add("c");
		list.add("a");
		list.add("t");
		list.add("i");
		list.add("o");
		list.add("n");
		Arrays.asList(list);
		System.out.println(Arrays.asList(list));
		
		
	}
	
	
	public static void main(String[] args) {
		practice();
	}
}
