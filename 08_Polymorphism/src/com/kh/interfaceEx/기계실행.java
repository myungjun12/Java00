package com.kh.interfaceEx;

public class 기계실행 {

	public static void main(String[] args) {
//		컴퓨터 윈도우 = new 컴퓨터();
//		윈도우.전원켜기();
//		윈도우.전원끄기();
//		
//		세탁기 돌돌이 = new 세탁기();
//		돌돌이.전원켜기();
//		돌돌이.전원끄기();
		
		//어린이용 기계 실행
//		어린이용계산기 c1 = new 어린이용계산기();
//		c1.전원켜기();
//		int a = 10; int b = 5;
//		System.out.println(a + "+" + b + "=" + c1.합(a, b));
//		System.out.println(a + "-" + b + "=" + c1.차(a, b));
//		System.out.println(a + "*" + b + "=" + c1.곱(a, b));
//		System.out.println(a + "/" + b + "=" + c1.몫(a, b));
//		System.out.println(a + "%" + b + "=" + c1.나머지(a, b));
//		c1.전원끄기();
		중학생계산기 중학생 = new 중학생계산기();
		중학생.전원켜기();
		int a = 15; int b = 3;
		System.out.println(중학생.합(a, b));
		System.out.println(중학생.차(a, b));
		System.out.println(중학생.곱(a, b));
		System.out.println(중학생.몫(a, b));
		System.out.println(중학생.나머지(a, b));
		중학생.전원끄기();
	}
}
