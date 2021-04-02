package api.net.tcp6;

import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
	public static void main(String[] args) throws IOException {
		//날짜 객체를 클라이언트 접속시 전송 //타임서버
		
		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버 열림");
		Socket socket = server.accept();
		System.out.println("접속 대기중");
		//날자 객체 생성
		Date date = new Date();
		
		//출력 스트림 생성
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(buffer);
		
		//만들어 둔거 보내기
		oos.writeObject(date);
		oos.flush();
				
		
		socket.close();
		server.close();
	}
}
