package api.net.tcp3;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {

		//String host = "127.0.0.1";
		String host = "localhost";
		int port = 30000;
		
		//유효성 검증
		InetAddress address = InetAddress.getByName(host);
		
		//소켓 설정
		Socket socket = new Socket(address, port);
		
		InputStream in = socket.getInputStream();
		
		int a = in.read();
		int b = in.read();
		int c = in.read();
		int d = in.read();
		int e = in.read();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(e);
	}
}
