package api.net.tcp.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3_buffered { 
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버 생성 완료");
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		InputStream in = socket.getInputStream(); 
		
		File target = new File ("kh", "ok.MOV");
		FileOutputStream fileout = new FileOutputStream(target);
		
		System.out.println("파일을 전송 받습니당");
		
		//인공 버퍼
		byte [] buffer =  new byte [1024];
		
		while(true) {
		int a = in.read(buffer);
		if(a==-1) {break;}
		fileout.write(buffer, 0, a);
		}
		socket.close();
		server.close();
		System.out.println("끝");
	}
}
