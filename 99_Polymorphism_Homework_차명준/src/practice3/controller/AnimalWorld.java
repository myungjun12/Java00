package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Horse;
import practice3.model.vo.Rabbit;

public class AnimalWorld {

	//ture면 토끼
	//false면 말이 들어감
	public static void main(String[] args) {
		// 5개짜리 Animal 타입의 객체 배열 생성
		Animal[] animals = new Animal[5];
		//무작위 
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			if(random.nextBoolean()) {
				   // true 라면 
				animals[i] = new Rabbit("깡총이" + i,"토끼",random.nextInt(5)+10,"검은색"); // 범위 : 10 ~ 15-1 (kg) 
			}else {// false 라면
				animals[i] = new Horse("적토마" + i,"조랑말","마구간","갈색");
			}
		}
		//for - each 
		for(Animal a : animals) {
			a.speak();
		}
	}
}
