package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
//메서드
	//기본생성자
	public CharacterController() {
	}
	
	//문자열이 비어있을 때 예외상황 문구 만들기
	public int countAlpha(String s) throws CharCheckException {
		if(s == null || s.isEmpty()) {//입력받은 문자열이 없거나 비었다면
			throw new CharCheckException("입력된 문자열이 비어 있습니다.");
		}
		
		if(s.contains(" ")) {//입력된 문자열에 공백이 '포함'된다면
			throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
		}
		
		if(s.matches(".*[0-9_].*")) {//...
			throw new CharCheckException("체크할 문자열 안에 숫자나 밑줄이 들어있습니다.");
		}
		
		int count = 0; // 반환타입을 위해 생성
		// Scanner로 입력받은 문자열의 길이만큼 포문으로 돌리겠다.
		//c로 문자를 하나씩 char형으로 변환해서 입력한 문자가(a~z A~Z) 아스키코드범위내에있다면
		//count++하고 메서드는 int형 반환타입이기에 return count;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				count++;
			}
		}
		
		return count;
	}
}
