package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	
	public static void main(String[] args) {
		//원본이미지 pigs.jpg pigs_cute.jpg 가로 = 400 세로 = 200
		// 파일 경로 설정
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 크기조정이미지 = "src/com/kh/imageEx/pigs_cute.jpg";
		
		//새로 만들 이미지 가로 세로 크기 설정
		int 가로크기 = 400;
		int 세로크기 = 200;
		
		//원본 이미지 데이터를 버퍼 이미지로 읽어들임
		try {
			
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			//새로운 크기의 이미지 생성
			BufferedImage 이미지버퍼 = new BufferedImage(가로크기, 세로크기, BufferedImage.TYPE_BYTE_GRAY);
			
			//모든 준비 완료 이미지에 그리기 시작하자!
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로크기, 세로크기, Image.SCALE_SMOOTH);
			
			이미지버퍼.createGraphics().drawImage(이미지그리기,0,0,null);
			
			//새로 만든 이미지를 파일로 저장하기!
			ImageIO.write(이미지버퍼, "jpg", new File(크기조정이미지));
			
			System.out.println("이미지 크기 조정 성공");
			
		} catch (IOException e) {
			
			System.out.println("이미지 파일 크기 조정 중 오류 발생!!");
			e.printStackTrace();
	
		}
	}
	
	
	
}
