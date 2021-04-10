package api.net.tcp.lotto;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test01_Client {
public static void main(String[] args) throws IOException {
	String host = "localhost";
	int port = 30000; 
	
	InetAddress adress = InetAddress.getByName(host); // 이건 검사
	
	Socket socket = new Socket(adress, port);
	
	System.out.println("서버와 연결되었습니다.");
	
	socket.close();
	}
} 
