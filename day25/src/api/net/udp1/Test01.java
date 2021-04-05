package api.net.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test01 {
public static void main(String[] args) throws IOException {
	//User Datagram protocol
	//=비연결통신 (ex : 문자 우편)
	//TCP와 구별된다.
	// 신회도는 낮지만 빠른 전송을 추구하는 통신방식
	//=안정적인환경(ex근거리)에서 활용하면 높은 효율
	//서버와 클라이언트 개념이 아닌 전송자.수신자 개념이 존재
	
	//우체국 만들기
	 DatagramSocket ds= new DatagramSocket(); //보내는 것은 그냥 기본 생성자로 만든다.
	 
	 String content = "Hello UDP!";
	 
	 //편지지 재료 준비
	 byte[]data = content.getBytes();
	 
	 InetAddress address = InetAddress.getByName("localhost");
	 int port = 30000;
	 
	 //편지지 인쇄?
	 DatagramPacket dp = new DatagramPacket(data, data.length, address , port);
	 
	 //전송 우체국에!
	 ds.send(dp);
	 
	 ds.close();
}
}
