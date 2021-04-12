package api.net.tcp.lotto;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test03_server_lotto {
	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버 생성 완료");

		Socket socket = server.accept();
		System.out.println("누군가 접속");


		int[] lotto = new int[] { 10, 15, 20, 25, 30, 35 };
		
		//이사업체와, 데이터포장기사가 필요하다.
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer);
		 
		//int다 왜냐고? 위에를 int로 했으니까.
		for(int i = 0; i<6; i++) {
			data.writeInt(lotto[i]);
			data.flush();
		}
		
		socket.close();
		server.close();
	}
}
