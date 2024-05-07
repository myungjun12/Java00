package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

	public class SnackMenu {
	// 고객이 메뉴를 입력하고 보는 창
	private Scanner sc = new Scanner(System.in); 
	private SnackController scr = new SnackController();
	
	public void menu() {
	System.out.println("스낵류를 입력하세요.");
	System.out.print("종류 : ");
	String kind = sc.next();
	System.out.print("이름 : ");
	String name = sc.next();
	System.out.print("맛 : ");
	String flaver = sc.next();
	System.out.print("개수 : ");
	int numof = sc.nextInt();
	System.out.print("가격 : ");
	int price = sc.nextInt();
	// 저장한 내용 출력
	System.out.println(scr.saveData(kind, name, flaver, numof, price));
	// 저장 내용 확인
	System.out.println(scr.confirmData());
	//만약에 y를 누르면 저장한 내용 출력
	System.out.print("저장한 정보를 확인하시겠습니까?(y/n)");
	String answer = sc.next();
	if(answer.equalsIgnoreCase("Y")) {// egualsIgnoreCase 대문자 소문자 상관없이 비교하겠다.
		System.out.println(scr.saveData(kind, name, flaver, numof, price));
		System.out.println(scr.confirmData());
	}
	
	}
	
}

