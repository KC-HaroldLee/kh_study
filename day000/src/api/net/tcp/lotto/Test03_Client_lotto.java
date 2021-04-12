package api.net.tcp.lotto;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test03_Client_lotto {
	public static void main(String[] args) throws IOException {
		String host = "localhost";
		int port = 30000;
		
		InetAddress adress = InetAddress.getByName(host);
		Socket socket = new Socket(adress, port);
		
		//이사업체가 대기중이다. 그리고 !그 전에 데이터 포장기사가 풀어줘야한다
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		DataInputStream data = new DataInputStream(buffer);
		
		while(true) {
			int a = data.readInt();
			if(a==-1) {
				break;
			}
			System.out.println(a);
		}
		socket.close();
	}
}
