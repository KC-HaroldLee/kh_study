package api.net.tcp.Object;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Test02_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket (30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		Date a = new Date();
		
		BufferedOutputStream bos = new BufferedOutputStream (socket.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(a);
		oos.flush();
		
		socket.close();
		server.close();
	}
}
