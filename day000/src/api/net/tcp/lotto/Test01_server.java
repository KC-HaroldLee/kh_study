package api.net.tcp.lotto;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_server {
	public static void main(String[] args) throws IOException {
		
		int port = 30000;
		ServerSocket server = new ServerSocket (port);
		
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		socket.close();
		server.close();
	}
}
