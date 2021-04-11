package api.net.tcp.lotto;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test03_server_lotto3 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		/*BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer);*/
		
	//	BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(socket.getOutputStream());
		
		List <Integer> wins = new ArrayList <>();
		
		for(int i = 1; i<=45; i++) {
		wins.add(i);
		}
		Collections.shuffle(wins);
		
		for(int i=0; i<6; i++) {
			data.writeInt(wins.get(i));
			data.flush();
		}
		
		
		System.out.println("전송완료");
	}
}
