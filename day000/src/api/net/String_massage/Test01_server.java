package api.net.String_massage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			String text = br.readLine();
			if (text==null) {
				break;
			}
			System.out.println(text);
		}
		socket.close();
		server.close();
System.out.println("서버종료");
	}
}
