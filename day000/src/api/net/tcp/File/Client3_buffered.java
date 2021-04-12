package api.net.tcp.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client3_buffered {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address, 30000);
		
		OutputStream out = socket.getOutputStream();

		File target = new File("D:\\폰정리\\85728054-C3CA-4D6E-8F4C-01243B4AFDCF.MOV");
		FileInputStream filein = new FileInputStream(target);
		
		System.out.println("파일 전송을 시작합니다");
		System.out.println("총"+ target.length() +"bytes");
		
		byte [] buffer =  new byte [1024];
		
		while(true) {
		int a = filein.read(buffer);
		if(a==-1) {break;}
		out.write(buffer, 0, a);
		}
		socket.close();
	}
}
