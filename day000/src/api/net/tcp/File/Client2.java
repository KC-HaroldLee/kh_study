package api.net.tcp.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address, 30000);
		
		OutputStream out = socket.getOutputStream();

		File target = new File("D:\\IMG_4503.MOV");
		FileInputStream filein = new FileInputStream(target);
		
		System.out.println("파일 전송을 시작합니다");
		System.out.println("총"+ target.length() +"bytes");
		while(true) {
		int a = filein.read();
		if(a==-1) {break;}
		out.write(a);
		}
		socket.close();
	}
}
