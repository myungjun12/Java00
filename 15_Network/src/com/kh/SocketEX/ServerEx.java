package com.kh.SocketEX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
java.net.BindException: Address already in use: bind
	at java.base/sun.nio.ch.Net.bind0(Native Method)
	at java.base/sun.nio.ch.Net.bind(Net.java:555)
	at java.base/sun.nio.ch.Net.bind(Net.java:544)
	at java.base/sun.nio.ch.NioSocketImpl.bind(NioSocketImpl.java:643)
	at java.base/java.net.ServerSocket.bind(ServerSocket.java:388)
	at java.base/java.net.ServerSocket.<init>(ServerSocket.java:274)
	at java.base/java.net.ServerSocket.<init>(ServerSocket.java:167)
	at com.kh.SocketEX.ServerEx.main(ServerEx.java:14)

ServerSocket 주최자 = new ServerSocket(12349);
소괄호 안에 들어있는 포트번호를 사용하고 있기 때문에 나는 것으로
소괄호 안에 있는 번호를 바꿔주면 됨

 * */
//대화 시작하는 대화 주체자
public class ServerEx {
	public static void main(String[] args) {
		//대화 주체자는 나의 집 주소와 우리집에 어떻게 들어올지 들어오는 경로(포트번호)생성
		
		//서버 측의 포트 번호를 지정해서 ServerSocket 생성
		try {
			ServerSocket s = new ServerSocket(12350);
			
//			System.out.println("주최자 측 번호가 열렸습니다.");
			System.out.println("party chat open");
			
			
			// 우리집에 방문하는 손님의 연결을 수락
			
			Socket b = s.accept();
			System.out.println("client success"); //집 문 열어줌을 확인
			
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			
			// 참가자에게 받은 메세지 수신 및 출력
			String m  ; // = in.readLine();
			
			while( (  m = in.readLine() )    != null) {
				System.out.println("send success : " + m); //이거 한줄 추가(선생님)
				
				out.println("zzcccccc hhhhhh eeeee cccc kkk");
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			b.close();
			s.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}