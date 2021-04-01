package api.net.tcp2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test02 {
public static void main(String[] args) throws IOException {
	
	//정보저장
	String host = "192.168.35.108";
	int port = 30000;

	//유효성 검사(형식)
	InetAddress adress = InetAddress.getByName(host);
	
	//연결(=socket을 생성한다)
	//Socket socket = new Socket(host, port);
	Socket socket = new Socket(adress, port);
	System.out.println("서버와 연결되었습니다.");
	
	//연결 종료
	socket.close();
	

}
}
