package api.net.String_massage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버 생성 완료");

		Socket socket = server.accept();
		System.out.println("누군가 들어옴");
  
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			String text = br.readLine();
			if (text.equals("그만")) {
				break;
			}
			System.out.println(text);
		}
		System.out.println("서버 닫힘");
		socket.close();
		server.close();

	}
}
