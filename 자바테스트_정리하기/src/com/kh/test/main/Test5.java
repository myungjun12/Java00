package com.kh.test.main;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2: ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			int mul = num1 * num2;
			if(mul >= 1 && mul <= 9) {
				System.out.println("한자리 수입니다.");
			}else {
				System.out.println("두자리 수입니다.");
			}
		}
	}
}
