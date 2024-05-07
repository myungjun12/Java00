package com.kh.oop.basic;

public class Bank {
	// 이름 계좌번호 잔액 비밀번호 마케팅수신동의 
	public String name;
	public String accountNumber;
	public int balance;
	public String password;
	public boolean agree;
	
	//생성자 메서드
	//boolean의 기본값은 false;
	//1. 필수가 아닌 생성자 = 클래스명 같아야함
	public Bank() {
				
	}
	//2. 필수인 생성자 이름 계좌번호 잔액 패스워드
	public Bank(String name, String accountNumber, int balance, String password) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.password = password;
		
	}
	
	//3. 출력 메서드
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + balance);
		System.out.println("비밀번호 : " + password);
		System.out.println("마케팅 수신동의 : " + agree);
	}
	
	//4. 최종 메인 출력 메서드
	public static void main(String[] args) {
		//1. 조 씨 은행 통장
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-3333";
		customer1.balance = 123;
		customer1.password = "1597";
		customer1.agree = true;
		
		customer1.info();
		
		System.out.println("========================");
		
		// 2. 던 씨 은행 통장
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accountNumber = "123-123-1234";
		customer2.balance = 154051457;
		customer2.password = "1593";
		customer2.agree = false;
		
		customer2.info();
		
		// 3. 필수 생성자를 활용해서 마이클 씨의 은행 통장 
		// 이름 계좌번호 잔액 비밀번호 를 입력하고
		// 마케팅 수신동의를 true 변경해서 출력하기
		
		Bank customer3 = new Bank("macle","112-115-1541",15489754,"3597");
		customer3.agree = true;
		customer3.info();
	}
}
