package com.kh.fileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre {

	public static void main(String[] args) {
		// Hello World.txt 파일에 나는 자바가 너무 재밌다 라는 내용을 작성하고
		// 파일을 저장하기
		// 헬로우월드에 자바는 정말정말재밌다?. 라는 말을 이어쓰기
		String 헬로우월드 = "Hello World.txt";
		try {
			FileWriter 글쓰기 = new FileWriter(헬로우월드,true);
			String 내용 = "\n나는 자바가 너무 너무 너무 너무ㅁㄴㅇ리ㅏㅓㅁㄴ 재밌다.";
			글쓰기.write(내용);
			
			글쓰기.close();
			System.out.println("글쓰기 완료");
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}
