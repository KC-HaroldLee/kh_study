package api.net.tcp9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) throws IOException {
	
	ServerSocket server = new ServerSocket(30000);
	System.out.println("서버생성완료");
	
	System.out.println("접속 대기 중");
	Socket socket = server.accept();
	
	InputStreamReader isr = new InputStreamReader(socket.getInputStream());
	BufferedReader br = new BufferedReader(isr);
	
	//이건 out이고
	File target = new File ("kh", "log.kh");
	FileWriter fw = new FileWriter(target);
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter pw = new PrintWriter(bw);
	
	
	//이건 in이다.
	while(true) {
	String str = br.readLine();
	if(str==null) {
		System.out.println("문장입력을 멈춥니다."); //
		break;}
	System.out.println("받은문장 = " + str);
	pw.println(str);
	pw.flush();
	}
	
	//닫음	
	socket.close();
	server.close();
	
	
	
}
}
