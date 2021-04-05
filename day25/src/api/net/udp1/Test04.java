package api.net.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		// UDP 수신코드
		// 발신자와 동일한 객체들이 피룡하지만 수신이라는 점에서 코드가 일부 바뀜

		// datagramSocket(우체국)은 수신을 위한 포트를 지정해야한다.
		int port = 30000;
		DatagramSocket ds = new DatagramSocket(port);

		// 받을 수 있는 공간 확보

		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);

		//수신
		int size = dp.getLength(); //실제 읽은 byte크기
		
		while(true) {
		ds.receive(dp);
		String content = new String(data, 0 , size); //data를 0위치에서 size개 만큼 문자열로 복원.
		System.out.println(content);
	
		}
		
		//ds.close();
		

	}
}
