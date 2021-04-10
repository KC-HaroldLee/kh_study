package api.net.tcp.lotto;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03_server_lotto2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer);
		
		int [] balls = {10, 15, 20, 25, 30, 35};
		
		for(int i = 0; i<balls.length; i++) {
			data.writeInt(balls[i]);
			System.out.println(balls[i] + "를 전송합니다...");
			data.flush();
		}
		System.out.println("전송완료");
	}
}
