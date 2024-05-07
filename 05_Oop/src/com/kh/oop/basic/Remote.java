package com.kh.oop.basic;

public class Remote {

	//1. 필드 
	public boolean powerOn; // 전원 상태
	public int volume; 
	public String channel;
	//2. 생성자 (공간 생성자, 필수 생성자)
	public Remote() {
		
	}
	
	public Remote(int volume,boolean powerOn,String channel) {
		this.volume = volume;
		this.powerOn = powerOn;
		this.channel = channel;
	}
	
	//3.메서드
	public void situation() {
		System.out.println("음량 : " + volume);
		System.out.println("전원(true(on)/false(off)) : " + powerOn);
		System.out.println("채널 : " + channel);
	}
	
	public static void main(String[] args) {
		//리모컨 객체 생성하기
		System.out.println("객체 1");
		Remote rm = new Remote(100,true,"Tvn");
		rm.situation();
		System.out.println("객체 2");
		Remote orderRm = new Remote(200,true,"KBS");
		orderRm.situation();
	}

}
