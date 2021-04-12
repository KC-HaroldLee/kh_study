package api.net.tcp.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Test01_Client3_buffered {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("localhost");
		Socket socket = new Socket(address, 30000);

		//스트림! 스트림! 갈길이 멀다!
		OutputStream os = socket.getOutputStream();
		
		//파일파일!!
		File target = new File("D:\\폰정리\\85728054-C3CA-4D6E-8F4C-01243B4AFDCF.MOV");
		FileInputStream fis = new FileInputStream(target);
		
		byte [] buffer =  new byte [1024];
		
		//일반적으론int만 떠올리자 제발
		while(true) {
		int a = fis.read(buffer);
		if(a==-1) {break;}
		os.write(buffer, 0, a);
		}
	}
}
