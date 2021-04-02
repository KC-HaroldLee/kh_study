package api.net.tcp8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {

		String text = "Welcome";
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		
		//옛날파일전송때는
		/*
		FileWriter fw = new FileWriter(파일);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		*/
		
		//osw는 Writer와 OutputStream간의 출력 변환을 수행(+인코딩 설정) 
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println(text);
		pw.flush();
		
		socket.close();
		server.close();
		
	}
}