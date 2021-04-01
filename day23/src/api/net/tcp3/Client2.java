package api.net.tcp3;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client2 {
	public static void main(String[] args) throws IOException {

		//String host = "127.0.0.1";
		String host = "localhost";
		int port = 30000;
		
		//유효성 검증
		InetAddress address = InetAddress.getByName(host);
		
		//소켓 설정
		Socket socket = new Socket(address, port);
		
		InputStream in = socket.getInputStream();
		
		while(true) {
		int n = in.read();
		if(n==-1) break;
		System.out.println(n);
		}
	}
}
