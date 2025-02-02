package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		CharacterController controller = new CharacterController();
		try {
			int count = controller.countAlpha(input); // countAlpha 반환값을 count에 대입
			System.out.println(" ' " + input + " ' 에 포함된 영문자 개수 : " + count);
			
			
		} catch (CharCheckException e) {
			e.printStackTrace();
		}finally {//try 블록에서 일어난 일에 관계없이 항상 실행이 보장되어야 할 뒷정리용 코드
			sc.close();
		}
	}
}
