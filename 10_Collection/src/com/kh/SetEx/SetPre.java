package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("포스틱");
		set.add("프링글스");
		set.add("홈런볼");
		set.add("꼬북칩");
		set.add("꼬깔콘");
		set.add("스윙칩");
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println(set.contains("꼬북칩"));
		
		set.remove("홈런볼");
		
		set.clear();
		
		System.out.println(set.isEmpty());
		
	}
	
	
}
