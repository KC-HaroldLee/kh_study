package api.net.tcp7;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		int port = 30000;

		Socket socket = new Socket(address, port);

		//버퍼 쓸 경우 문제가 보인다.
		//BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		//ObjectInputStream ois = new ObjectInputStream(buffer);
		
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		
		List<Integer> win = (List<Integer>) ois.readObject();	
		
		socket.close();
		
		System.out.println("win -" + win);
	}
}
