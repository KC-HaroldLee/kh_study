package api.net.tcp5;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args) throws IOException {
	
	//well-known port : 0~1023.
	ServerSocket server = new ServerSocket(30000);
	System.out.println("서버 생성 성공");
	
	//new 쓰지 않음
	Socket socket = server.accept();
	
	//사용자 접속 후 int 6개를 추첨하여 전송
	int [] lotto = new int[] {10, 15, 20, 25, 30, 35};
	
	BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
	DataOutputStream data = new DataOutputStream(buffer);

	for(int i =0; i<6; i++) {
		data.write(lotto[i]);
	}
	
	//연결을 끊기 전에 꼭
	buffer.flush();
	
	
	
	//socket.close();
	//server.close();
}
}
