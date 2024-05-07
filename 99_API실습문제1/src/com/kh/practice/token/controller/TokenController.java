package com.kh.practice.token.controller;

public class TokenController {

	//기본 생성자
	public TokenController() {}
	
	//입력된 문자열의 첫 글자를 대문자로 변환 후 반환
	// 예를 들어 "java"라는 문자열이 입력되면 자동으로 "Java"로 변경되게 만들어주자!
	//subString (처음시작하는 인덱스값, 끝나는 인덱스값)
	//toUpperCase
	public String firstCap(String input) {         
				// 0 ~ 1 첫 글자를 대문자로 변환하겠다	   //(1)이후로 출력하겠다.
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	
	 
}
