package com.kh.AddressEX;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	//www.google.com 호트스명과 IP주소 가져오기
	public static void main(String[] args) { // InetAddress xx주소 = InetAddress.getByName("IP주소 or www.naver"); getByName getByAddress
		try {
			InetAddress 구글주소 = InetAddress.getByName("www.google.com");
			System.out.println("IP 주소 : " + 구글주소.getHostAddress());
			System.out.println("호스트명 : " + 구글주소.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("======================");
		// 나의 컴퓨터 이름과 자리번호 확인하기
		// getlocalhost
		try {
			InetAddress 내집주소 = InetAddress.getLocalHost();
			System.out.println(내집주소);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==================");
		// www.facebook.com 페이스북 호스트이름 호스트주소
		try {
			InetAddress 페이스북주소 = InetAddress.getByName("www.facebook.com");
			System.out.println(페이스북주소.getHostName());
			System.out.println(페이스북주소.getHostAddress());
			System.out.println("=================");
			System.out.println(페이스북주소);
			InetAddress 인스타그램주소 = InetAddress.getByName("www.instagram.com");
			System.out.println(인스타그램주소.getHostName());
			System.out.println(인스타그램주소.getHostAddress());
			System.out.println("=================");
			System.out.println(인스타그램주소);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// www.instagram.com 인스타그램 호스트이름 호스트주소
		
		
		
	}
}
