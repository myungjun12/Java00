package com.kh.example.practice5.run;

import java.util.Random;

import com.kh.example.practice5.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {
		
		Lotto lotto1 = new Lotto();
		
		System.out.println("로또 번호 추첨");
		
		lotto1.information();
	}
}
