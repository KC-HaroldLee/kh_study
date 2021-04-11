package api.net.all;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Object_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket (30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		Date a = new Date();
		
		//이사업체는 같다. 가만 오브젝트 포장기사가 필요하다.
		BufferedOutputStream bos = new BufferedOutputStream (socket.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(a);
		oos.flush(); //기사들은 화장실을 꼭 쓰더라.
		
		socket.close();
		server.close();
	}
}
