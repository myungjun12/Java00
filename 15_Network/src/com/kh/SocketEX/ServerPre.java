package com.kh.SocketEX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//채팅 시작 주최자
//port 2자리 3자리 4자리 컴퓨터에서 약속으로 지정한 숫자
public class ServerPre {
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			
			Socket clientSocket = server.accept();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
			
			String message;
			
			while((message = in.readLine()) != null) {
				System.out.println("send : ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
