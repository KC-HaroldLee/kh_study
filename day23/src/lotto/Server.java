package lotto;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Server {
public static void main(String[] args) throws IOException {
	
	//서버 개설
	ServerSocket server = new ServerSocket(30000);
	System.out.println("서버가 열렸습니다.");
	
	//접속 대기중
	Socket socket = server.accept();
	
	//번호 추첨
	Random r = new Random();
	
	List<Integer> balls = new ArrayList<>();
	for(int i = 1; i<=45; i++) {
		balls.add(i);
	}
	//섞기
	Collections.shuffle(balls);	
	
	//통로만들기
	OutputStream out = socket.getOutputStream();
	//6개만 넘기기
	for(int i =0; i<6; i++) {
		out.write(balls.get(i));
	}
	
	socket.close();
	server.close();
}
}
