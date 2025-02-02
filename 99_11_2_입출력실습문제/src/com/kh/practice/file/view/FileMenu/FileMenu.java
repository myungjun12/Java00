package com.kh.practice.file.view.FileMenu;

import java.util.Scanner;

import com.kh.practice.file.model.controller.FileController;

public class FileMenu {
	//키보드로 입력 받을 Scanner 작성
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		System.out.println("1. 파일저장");
		System.out.println("2. 파일열기");
		System.out.println("3. 파일편집");
		System.out.println("4. 종   료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			//파일 저장
			fileSave();
			break;
		case 2:
			//파일 열기
			fileOpen();
			break;
		case 3:
			//파일 수정
			fileEdit();
			break;
		case 4:
			System.out.println("프로그램 종료");
			System.exit(0);
			//return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
	//1. 파일 저장
	public void fileSave() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		//파일이 존재한다면 ~
		if(fc.checkName(fileName)) {
			System.out.println("파일이 이미 존재합니다.");
		}else {
			System.out.print("작성할 내용 입력 : ");
			String content = sc.nextLine();
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}
	
	public void fileOpen() {
		System.out.print("열어줄 파일 이름 입력 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		System.out.println("파일 내용 : " + fileContent);
	}
	
	public void fileEdit() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		
		//파일이 없다면 파일이 존재하지 않습니다.
		System.out.println("현재 파일 내용 : " + fileContent);
		System.out.print("새로운 내용 입력 : ");
		String newContent = sc.nextLine();
		fc.fileEdit(fileName, new StringBuilder(newContent));
	}
	
}
