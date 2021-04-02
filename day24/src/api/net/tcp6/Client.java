package api.net.tcp6;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	InetAddress address= InetAddress.getByName("127.0.0.1");
	int port = 30000;
	
	Socket socket = new Socket(address, port);
	
	//입력 스트림 생성
	BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
	ObjectInputStream ois = new ObjectInputStream(buffer);
	
	Object date = ois.readObject();
	
	socket.close();
	
	System.out.println(date);
	}
}
