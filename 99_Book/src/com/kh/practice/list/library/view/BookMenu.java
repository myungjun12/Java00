package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	//키보드 값 입력받을 Scanner
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	//Book을 실행하자마자 보이는 메인메뉴 만들기
	public void mainMenu() {
		//만약에 true 라면 계속 실행
		while(true) {
			System.out.println("=== 도서관리 프로그램 ===");
			System.out.println("1. 도서추가");
			System.out.println("2. 도서 전체 목록 조회");
			System.out.println("6. 종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				//도서 추가
				insertBook();
				break;
			case 2:
				// 전체 도서 목록 출력
				selectList();
				break;
			case 3:
				// 도서 제목 검색 결과
				searchBook();
				break;
			case 4:
				// 도서 삭제
				deleteBook();
				break;
			case 5:
				// 오름차순 정렬
				ascBook();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
		}
	}
	
	public void insertBook() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		//책 정보 저장하는 Book 객체 소환
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("도서 추가가 완료 되었습니다.");
	}
	public void selectList() {
		bc.selectList();
	}
	public void searchBook() {
		System.out.print("제목 검색 : ");
		String keyword = sc.nextLine();
		bc.searchBook(keyword);
	}
	public void deleteBook() { // 직접 입력받아 bc.메서드 호출해서 매개변수 초기화
		System.out.print("삭제할 도서 목록 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 도서 저자 : ");
		String author = sc.nextLine();
		//BookController에서 도서 삭제하는 기능 추가
		bc.deleteBook(title,author);
	}
	//도서목록을 오름차순으로 정렬하기
	//ascending : 오름차순
	public void ascBook() {
		// BookController에서 도서 오름차순으로 정렬하는 기능 추가
		bc.ascBook();
	}
	
}
