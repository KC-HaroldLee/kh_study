package api.net.tcp4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {

//서버 개방 코드(=영업 시작 코드)
		int port = 30001;
		ServerSocket server = new ServerSocket(port);
		System.out.println("서버 준비되었습니다");

//서버 개방 이후에 연결을 대기하는 코드가 필요하다.
		//=socket: 연결클래스
		Socket socket = server.accept();
		System.out.println("사용자가 접속하였습니다");
		
		File target = new File("kh", "test-ok.txt");

		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in); // 까지는 같다
		ObjectInputStream ois = new ObjectInputStream(buffer);
		
		ois.readObject(port);
//	연결 종료 코드
		socket.close();
		server.close();
	}
}
