package com.kh.fileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {

	public FilePre() {
	}

	public void method1() {
		File 텍스트파일 = new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		}else { //존재하지 않는다면 
			//만약에 파일 만들기 성공!
			try {

				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName() + " 파일이 생성되었습니다.");
			
			} catch (IOException e) {
				System.out.println("파일 만들기 실패했습니다.");
				e.printStackTrace();
			
			}
		}
	}

	public void method2() {
		// 절대경로
		// 바탕화면에 뉴폴더라는 폴더 생성하고 뉴폴더 안에 파일생성.txt 파일 만들기
		
		//바탕화면 경로를 설정하는 방법		    c:/Users/user1 
		String 바탕화면경로 = System.getProperty("user.home") + "/Deskstop";
		
		String 폴더경로 = "c:/Users/user1/Desktop/뉴폴더";
		File 폴더 = new File(폴더경로);
		
		if(폴더.exists()) {
		
			System.out.println("폴더가 존재합니다.");
		
		}else {
			
			try {
				폴더.mkdir();
				System.out.println("폴더 생성 완료");
			} catch (Exception e) {
				System.out.println("폴더 생성 중 에러 발생!");
				e.printStackTrace();
			}
			
	
		}
		
		File txtFile = new File(폴더경로 + "/차명준.txt");
		if(txtFile.exists()) {
			System.out.println("파일이 존재합니다.");
		
		}else {
			
			try {
				txtFile.createNewFile();
				System.out.println(txtFile.getName() + " 파일이 생성되었습니다.");
				System.out.println("경로 : " + txtFile.getPath());
				System.out.println("절대경로 : " + txtFile.getAbsolutePath());
			
			} catch (IOException e) {
				System.out.println("파일 만들기를 실패했습니다.");
				e.printStackTrace();
		
			}
		}
	}

	public void method3() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Deskstop";
		
		//모든 폴더 생성
		File 폴더들 = new File(바탕화면경로 + "뉴1/뉴2/뉴3");
		폴더들.mkdirs(); // 뉴1/뉴2/뉴3 폴더 생성
		
		//파일 생성
		File 파일 = new File(폴더들 + "/새로운파일.txt");
		try {
		
			boolean 파일생성확인 = 파일.createNewFile();
			System.out.println("파일 생성 되었나요?" + 파일생성확인);
			
			//파일 크기 확인
			System.out.println(파일.length());//무엇도 써있지 않음
 
			//파일 마지막 수정일 확인
			System.out.println(파일.lastModified());
			
			//파일 삭제
			파일.delete();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void method4() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Deskstop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		try {
			텍스트파일.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void method5() {
		String 바탕화면경로 = System.getProperty("user.home") + "/Deskstop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		File 새로운이름 = new File(바탕화면경로 + "/newFFF/변경된이름.txt");
		
		//파일 이름 변경하기
		//만약에 파일이 존재할 경우 -> 파일 이름 변경 존재하지 않으면 변경x
		if(텍스트파일.exists()) {
			//만약에 파일 이름을 성공적으로 변경했다면
			if(텍스트파일.renameTo(새로운이름)) {
				System.out.println("파일 이름이 성공적으로 변경되었습니다.");
			}else {
				System.out.println("파일 이름 변경에 실패했습니다.");
			}
		}else {
			System.out.println("파일 이름이 존재하지 않습니다. 만들어주세요^^.");
		}
		
	}
	
	public static void main(String[] args) {	
		FilePre file = new FilePre();
//		file.method1();
//		file.method2();
		file.method3();
//		file.method4();
//		file.method5();
	}
}
