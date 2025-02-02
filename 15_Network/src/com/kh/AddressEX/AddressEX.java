package com.kh.AddressEX;

import java.net.InetAddress;

import java.net.UnknownHostException;

/*
IP 주소 : 컴퓨터에서 네트워크에 특정 장치를 확인하는데 사용하는 숫자

가장 기본 주소

우리집주소
우리집주소 = 192.168.0.1. = localhost = 127.0.0.1

port = 네트워크에서 데이터를 주고 받을 수 있는 장소
타인의 컴퓨터나 도메인, 또는 특정위치에 들어갈 수 있는 번호 2자리나 4자리

InetAddress : Java에서 IP 주소를 나타내는데 사용
	호스트명과 IP주소간의 변환, 집주인에 대한 정보 검색 등을 가능하게 해줌
	
메서드명 : 
getByName(String host) : host 명에 대한 정보를 반환

getHostName() : 호스트 명을 가져옴

getHostAddress() : IP주소를 가져옴
 * */

/*
호스트명 : www.google.com
IP 주소 : 172.217.25.4

	강남에 35호
192.168.0.35의 경우 내 집에있는 호수를 가리켜서 사용
숫자로 우리집주소 = 127.0.0.1 = localhost = 192.168.0.35

영어로 된 이름 주소와 숫자로 된 주소가 다른사람이 검색했을 경우와 내가 검색했을 때 숫자 주소가 
다르게 나오는 경우는 영어로 된 이름주소 주인이 진짜 본인의 실제 숫자 주소를 보호하기 위해 
임시로 보여주는 숫자 주소이기 때문에 개인이 다르게 보여지는 것임 
 * */
public class AddressEX {
	//최종 실행 main 메서드 
	public static void main(String[] args) {
		//1. naver에 대해 알아보기
		try {//error가 생길지는 모르나 일단 시도해보는 것이 try 
			
			
			InetAddress 주소 = InetAddress.getByName("www.naver.com");
			System.out.println("호스트명 : " + 주소.getHostName());
			System.out.println("IP 주소 : " + 주소.getHostAddress());
			
		} catch (UnknownHostException e) {//시도했을 때 예외가 발생하면 보일 내용 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. daum에 대해 알아보기
		try {
			
			InetAddress 다음주소 = InetAddress.getByName("www.daum.net");
			System.out.println("호스트명 : " + 다음주소.getHostName());
			System.out.println("IP 주소 : " + 다음주소.getHostAddress());
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3. IP주소로 daum.net 검색하기
		try {
			InetAddress 다음IP = InetAddress.getByName("211.249.220.24");
			System.out.println("호스트명 : " + 다음IP.getHostName());
			System.out.println("IP 주소 : " + 다음IP.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
