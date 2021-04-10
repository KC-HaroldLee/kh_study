package api.net.tcp.lotto;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test02_server {
	public static void main(String[] args) throws IOException {
		
		int port = 30000;
		ServerSocket server = new ServerSocket (port);
		
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		//뭔갈 아웃풋 해보자
		OutputStream out = socket.getOutputStream();
		
		//치고 빠진다.
		out.write(104);
		out.write(101);
		out.write(108);
		out.write(108);
		out.write(111);
		
		
		socket.close();
		server.close();
	}
}
