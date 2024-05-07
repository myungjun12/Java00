package com.kh.jabaAPIEx.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Date : 특정 날짜와 시간을 나타내는 클래스
Calendar : 날짜와 시간을 조작하는데 사용되는 추상클래스
Gre go rian Calendar = 그레고리력을 사용해서 날짜와 시간을 계산
SimpleDateFormat = 날짜와 시간을 형식으로 보여주고 그것을 출력
LocalDate
KST = Korean Standard Time
	= 한국    일반적인   시간
 * */
public class DateEx {
	public static void main(String[] args) {
		//1. Date
		Date date = new Date();
		System.out.println(date);
		//2. Calendar
		Calendar calendar = Calendar.getInstance();
			//년 월 일
		int year  = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);//0월부터 가져온다
		int day   = calendar.get(Calendar.DAY_OF_MONTH);//이번달에 있는 날짜
		System.out.println("현재 날짜 : " + year + "/" + (month+1) + "/" + day);
		
		/*
		 * 3. Gregorian
		 그레고리안 달력은 1년 1월 1일이 무조건 월요일로 정의돼있음
		 2024, 4, 23을 하면 자동으로 2024년 5월 23일로 변경됨
		 2024년 5월 23일은 목요일 
		 * */
		
		GregorianCalendar 그레고리안1 = new GregorianCalendar();
		GregorianCalendar 그레고리안2 = new GregorianCalendar(2024,4,23);//일(1)월(2)화(3)수(4)목(5)금(6)토(7)
		int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK);// 5월 23일이 목요일이기 때문에 5라고 나오는 것
		System.out.println("날짜 : " + 날짜);
		
		/* 중요합니다 
		 4. SimpleDateFormat 년 월 일
		 년 : y year
		 월 : M Month (분이랑 첫 글자가 m인 것이 같기 때문에 월은 대문자 M)
		 일 : d day
		 시 : H Hour (H : 0 ~ 23 시    h : 오전(am)과 오후(pm)로 나눠서 표기)
		 분 : m minute
		 초 : s second
		 
		 요일 : E 요일은 표준으로 E를 사용하기로 함
		 * */
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시 = 날짜형식.format(new Date());
		System.out.println("날짜형식 지정해서 표시하기 : " + 날짜표시);
		
		//5. localDate 현재 날짜 가져오기
		LocalDate 현재날짜는 = LocalDate.now();
		System.out.println("현재날짜 : " + 현재날짜는);
		
	}
}
