package api.net.all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Massage_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		//바뀌어져있다. 작가 두명 기억나니?
		InputStreamReader isr = new InputStreamReader(socket.getInputStream()); // 책받는 작가
		BufferedReader br = new BufferedReader(isr); //책읽어주는 작가

		while (true) {
			String text = br.readLine();
			if (text==null) {
				break;
			}
			System.out.println(text); //읽기만 한다.
		}
		socket.close();
		server.close();
System.out.println("서버종료");
	}
}
