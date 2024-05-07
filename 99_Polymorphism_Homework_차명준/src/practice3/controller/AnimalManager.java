package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
//		사이즈 5짜리 Animal 타입의 객체 배열 생성하여
		Animal[] animals = new Animal[5];
 		//무작위로
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			//만약에 랜덤으로 true false를 가져오게 한 다음 true면 강아지
			//random.nextBoolean() : 랜덤으로 거짓과 참이 나옴
			if(random.nextBoolean()) {
				animals[i] = new Dog("멍멍이" + i,"개",random.nextInt(30)+1);
			}else {
				animals[i] = new Cat("야옹이"+ i,"고양이","집","검은색");
			}
			//false면 고양이를 칸에 넣을 예정
		}
		
		for (Animal a : animals) {
			a.speak();
		}
		/*
		 반복문으로 각 인덱스별 객체의 speak() 메소드 실행 
		 * */
	}
}
