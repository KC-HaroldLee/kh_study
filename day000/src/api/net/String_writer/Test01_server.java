package api.net.String_writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_server {
	public static void main(String[] args) throws IOException {
		
		String text = "welcome!";
		
		
		ServerSocket server = new ServerSocket(30000);
		System.out.println("접속대기중");
		Socket socket = server.accept();
		System.out.println("누군가 접속");
				
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream()); //인코딩은 생략 가능
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw =  new PrintWriter(bw);
		
		pw.println(text);
		pw.flush();
				
		socket.close();
		server.close();
	}
}
