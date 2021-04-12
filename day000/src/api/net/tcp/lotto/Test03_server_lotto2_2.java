package api.net.tcp.lotto;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03_server_lotto2_2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버 생성");
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		System.out.println("로또번호 생성");
		List<Integer> balls = new ArrayList <>();
		for(int i =1;  i<=45; i++) {
			balls.add(i);
		}
		Collections.shuffle(balls);
		
		//통로
		BufferedOutputStream bufferOut = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream dataOut = new DataOutputStream(bufferOut);
		
		for(int i = 0; i<6; i++) {
			dataOut.write(balls.get(i));
			dataOut.flush();
		}
		System.out.println("전송완료");
		socket.close();
		server.close();
	}
}
