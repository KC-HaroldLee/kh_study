package api.net.all;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Massage_server_tofile {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		File target = new File("kh", "ok.txt");
		FileWriter fw = new FileWriter(target, true); //초급 작가
		
		//연결 해야하므로 그 작가들이 필요하긴 하다.
		InputStreamReader isr = new InputStreamReader(socket.getInputStream()); // 책받는 작가
		BufferedReader br = new BufferedReader(isr); //책읽어주는 작가
		
		while (true) {
			String text = br.readLine();
			if (text==null) {
				break;
			}
			fw.write(text+"\n"); //대신 쓰는 놈은 얘다.
			fw.flush(); //언제나 똥싼다.
		}
		socket.close();
		server.close();
System.out.println("서버종료");
	}
}
