package api.net.tcp4;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static void main(String[] args) throws IOException {
	
	//정보저장
	String host = "1.220.236.75";
	int port = 30000;

	//유효성 검사(형식)
	InetAddress adress = InetAddress.getByName(host);
	
	//연결(=socket을 생성한다)
	//Socket socket = new Socket(host, port);
	Socket socket = new Socket(adress, port);
	System.out.println("서버와 연결되었습니다.");
	
	File target = new File("kh", "test.kh");

	FileOutputStream out = new FileOutputStream(target);
	BufferedOutputStream buffer = new BufferedOutputStream(out); // 까지는 같다
	ObjectOutputStream oos = new ObjectOutputStream(buffer);
	
	oos.writeObject(port);
	
	//연결 종료
	socket.close();
	

}
}
