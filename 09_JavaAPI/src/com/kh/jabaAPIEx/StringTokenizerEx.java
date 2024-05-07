package com.kh.jabaAPIEx;

import java.util.StringTokenizer;

/*
StringTokenizer
Token = 동전 최소 단위 정보를 가진 물리적 가상적 물체 
 * */
public class StringTokenizerEx {
	
	public static void main(String[] args) {
	//										소괄호안에 "" 로 무언갈 넣어줘야함
		StringTokenizer token1 = new StringTokenizer("자 바 는 즐 거 워");
		//hasMoreTokens 만약에 토큰글자 안에 글자가 조금이라도 들어있다면 true
		while(token1.hasMoreTokens()) {
			//nextToken : 현재 토큰은 꺼냈고 다음 토큰 보여줄 준비해 
			//구분자를 넣지 않으면 기본으로 띄어쓰기 기준으로 구분
			System.out.println(token1.nextToken());
		}//while
		
		//구분자를 ,를 넣은 Tokenizer를 볼 것 입니다.
		StringTokenizer token2 = new StringTokenizer("Program ,ming ,T반");
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
	}
}
