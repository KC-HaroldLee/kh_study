package api.net.all;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Writer_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		
		//문자전송은 조금 다른 이사방식이다. 작가가 세명 동원된다.
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());//편지부치는 작가
		BufferedWriter bw = new BufferedWriter(osw);//책으로 만들어주는 작가
		PrintWriter pw = new PrintWriter(bw);//글만 쓰는 작가
		
		String a = "hello!!!";
		
		pw.write(a);
		pw.flush();
		
		socket.close();
		server.close();
	}
}
