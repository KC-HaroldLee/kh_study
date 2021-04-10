package api.net.tcp.Object;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test01_Client {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		InetAddress adress = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(adress, 30000);
		
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		ObjectInputStream ois = new ObjectInputStream(buffer);
		
		Object a = ois.readObject();
		System.out.println(a);
		
		socket.close();
	}
}
