package api.net.tcp.lotto;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test02_Client {
public static void main(String[] args) throws IOException {
	String host = "localhost";
	int port = 30000; 
	
	InetAddress adress = InetAddress.getByName(host); // 이건 검사
	
	Socket socket = new Socket(adress, port);
	
	System.out.println("서버와 연결되었습니다.");
	
	//뭔갈 읽는다.
	InputStream in = socket.getInputStream();
	
/*
	int a = in.read();
	int b = in.read();
	int c = in.read();
	int d = in.read();
	int e = in.read();

	System.out.println((char)a);
	System.out.println((char)b);
	System.out.println((char)c);
	System.out.println((char)d);
	System.out.println((char)e);
	*/
	
	while(true) {
		int n = in.read();
		if(n==-1) {break;}
		System.out.println((char)n);
	}
			
	socket.close();
	}
} 
