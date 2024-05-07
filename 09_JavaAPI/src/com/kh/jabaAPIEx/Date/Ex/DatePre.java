package com.kh.jabaAPIEx.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜만들기
		// 1. yyyy-MM-dd 1번을 많이 사용함
		SimpleDateFormat 날짜 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String 날짜표시 = 날짜.format(date);
		System.out.println("날짜표시 : " + 날짜표시);
		// 2. HH:mm:ss 
		SimpleDateFormat 시간 = new SimpleDateFormat("HH:mm:ss");
		String 시간표시 = 시간.format(date);
		System.out.println("시간표시 : " + 시간표시);
		// 3. yyyy-MM-dd HH:mm:ss
		//SimpleDateFormat주소값 가진 객체 생성 : 날짜와시간.객체정보 format() 사용 ()안에 / new Date()  
		SimpleDateFormat 날짜와시간 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 날짜와시간표시 = 날짜와시간.format(date);
		System.out.println("날짜와시간표시 : " + 날짜와시간표시);
		// 4. SimpleDateFormat 날짜 = E를 사용해서 요일 나타내기
		SimpleDateFormat 요일 = new SimpleDateFormat("E");
		String 요일표기 = 요일.format(date);
		System.out.println("오늘의 요일 : " + 요일표기);
	}

}
