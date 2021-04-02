package lotto;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException {
		
		//주소와 포트설정
		String host = "localhost";
		int port = 30000;
		
		//형식검사
		InetAddress adress = InetAddress.getByName(host);
		
		//소켓 생성
		Socket socket = new Socket(adress, port);
		
		//통로만들기
		
		InputStream in = socket.getInputStream();
		System.out.println("서버와 연결되었습니다.");
		
		for(int i = 0; i<6; i++) {
			int ball = in.read();
			System.out.println(i + "번째 번호 = " + ball);
			}
	
		
	}
}
