package api.net.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Sender {
public static void main(String[] args) throws IOException {
	//UDP멀티 캐스트
	//채널에 가입하여 그룹 전송이 가능하도록 하는 UDP통신방식
	
	MulticastSocket ms = new MulticastSocket();
	InetAddress adress = InetAddress.getByName("234.234.234.234");
	int port = 30000;
	ms.joinGroup(adress); // 채널 가입
	
	String content = "Hello Multicast!";
	byte[] data = content.getBytes();
	DatagramPacket dp = new DatagramPacket(data, data.length, adress, port );//채널 아이피를 적어야한다!!
	
	ms.send(dp);
	ms.close();
}
}
