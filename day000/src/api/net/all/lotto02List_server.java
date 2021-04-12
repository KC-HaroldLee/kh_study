package api.net.all;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lotto02List_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		System.out.println("누군가 접속");
		
		/*BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer);*/
				
		//줄일 수 있다. 기억하자.
		DataOutputStream data = new DataOutputStream(socket.getOutputStream());
		
		//인티저 잊지말자
		List <Integer> wins = new ArrayList <>();
		
		for(int i = 1; i<=45; i++) {
		wins.add(i);
		}
		Collections.shuffle(wins);
		
		List<Integer>wins2 = new ArrayList<Integer>(wins.subList(0, 6));
		//List는 인덱스는 get!
		for(int i=0; i<6; i++) {
			data.writeInt(wins2.get(i));
			data.flush();
		}
		
		
		System.out.println("전송완료");
	}
}
