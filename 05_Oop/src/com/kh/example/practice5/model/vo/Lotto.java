package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	
	int[] lotto = new int[6];
	Random random = new Random();
	
	{
		for (int i = 0; i < lotto.length;i++) {
		lotto[i] = random.nextInt(45)+1;
		}
	}
	public Lotto() {
		
	}
	
	public void information() {
		 for(int i = 0; i < lotto.length;i++) {
		System.out.print(lotto[i] + " ");
		}
	}
}
	