package api.net.all;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Object_client {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InetAddress address = InetAddress.getByName("localhost");
		Socket socket = new Socket (address, 30000);
		
		BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object a = ois.readObject();
		
		System.out.println(a);
	}
}
