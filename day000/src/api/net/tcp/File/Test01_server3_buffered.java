package api.net.tcp.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_server3_buffered {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();

		// new를 쓰지말자 갈길이 멀다.
		InputStream is = socket.getInputStream();

		// 파일파일!!
		File target = new File("kh", "ok.mov");
		FileOutputStream fos = new FileOutputStream(target);
		
		//버퍼는 씹자 byte!
		byte [] buffer = new byte[1024];
 		
		// 일반적으론int만 떠올리자 제발
		while (true) {
			int a = is.read(buffer);
			if (a == -1) {
				break;
			}
			fos.write(buffer,0,a);
		}
		
		socket.close();
		server.close();
		System.out.println("끝");
	}
}
