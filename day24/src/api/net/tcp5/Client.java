package api.net.tcp5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
public static void main(String[] args) throws IOException {
	String host = "127.0.0.1"; //loopback ip.
	int port =30000;
	
	InetAddress address = InetAddress.getByName(host);
	
	Socket socket = new Socket (address, port);
	
	//통로 준비(파일 입출력의 멀티바이트 입력 예제 참고)
	BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
	DataInputStream data = new DataInputStream(buffer);
	
	int a = data.readInt();
	int b = data.readInt();
	int c = data.readInt();
	int d = data.readInt();
	int e = data.readInt();
	int f = data.readInt();
	
	socket.close();
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	System.out.println("e = " + e);
	System.out.println("f = " + f);
}
}
