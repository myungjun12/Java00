package com.kh.op;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList names = new ArrayList();
		int index = 0;
		for(int i = 0;i <= 4 ;i++){
			System.out.print("이름을 입력 : ");
			names.add(sc.nextLine());
		}
		System.out.println("성이 '김'인 분의 이름을 모두 출력합니다.");
		for (Object name : names) {
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
