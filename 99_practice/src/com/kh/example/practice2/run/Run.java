package com.kh.example.practice2.run;
//Product를 가져와서 실행하는 클래스
import com.kh.example.practice2.model.vo.Product;

public class Run {
	// 메인 메서드
	public static void main(String[] args) {
		//Product 객체 생성
		Product product1 = new Product();
		//정보 : 사과 사과가격 사과브랜드
		product1.setpName("사과");
		product1.setPrice(2000);
		product1.setBrand("유기농 마을");
		
		product1.information();
		
		System.out.println("=== get 불러오기 ===");
		System.out.println("이름 : " + product1.getpName());
		System.out.println("가격 : " + product1.getPrice());
		System.out.println("브랜드 : " + product1.getBrand());
	}
}
