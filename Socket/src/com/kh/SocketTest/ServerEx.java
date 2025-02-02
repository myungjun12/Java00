package com.kh.SocketTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		ServerSocket server_socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			server_socket = new ServerSocket();
		} catch (IOException e) {
			System.out.println("해당 포트가 열려있습니다.");
			e.printStackTrace();
		}
		
		try {
			System.out.println("서버가 열렸습니다.");
			socket = server_socket.accept();
			//입력 출력 스트림 생성
			
			in = new BufferedReader(new InputStreamReader
					(socket.getInputStream())); // 입력 스트림
			
			out = new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()))); // 출력 스트림
			
			String message = null;
			message = in.readLine(); // Client로부터 데이터 읽어옴
			
			System.out.println("Client로부터 온 메세지" + message);
			
			out.write(message); // print(message)와 비슷하다.
			out.flush(); // 버퍼링으로 인해 기록되지 않은 데이터를 출력 스트림에 모두 출력 
			socket.close(); // 출력되지 않은 스트림을 모두 출력하고 스트림을 닫는다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
