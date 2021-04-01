package api.net.tcp1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03 {
	public static void main(String[] args) throws IOException {

//서버 개방 코드(=영업 시작 코드)
		int port = 30000;
		ServerSocket server = new ServerSocket(port);
		System.out.println("서버 준비되었습니다");

//서버 개방 이후에 연결을 대기하는 코드가 필요하다.
		//=socket: 연결클래스
		Socket socket = server.accept();
		System.out.println("사용자가 접속하였습니다");
//	연결 종료 코드
		socket.close();
		server.close();
	}
}
