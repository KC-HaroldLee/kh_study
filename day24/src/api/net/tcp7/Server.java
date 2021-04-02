package api.net.tcp7;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {
	public static void main(String[] args) throws IOException {
		// 로또번호를 List에 담아서 전송

		// 서버 준비
		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버 생성");
		System.out.println("접속 대기중");
		Socket socket = server.accept();

		
		// 통로 준비 버퍼 쓸 경우 문제가 보인다.
		//BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		//ObjectOutputStream oos = new ObjectOutputStream(buffer);
		
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		
		
		// 로또만들기
		List<Integer> balls = new ArrayList();
		for (int i = 0; i <= 45; i++) {
			balls.add(i);
		}
		
		Collections.shuffle(balls);
		//List<Integer> win = balls.subList(0, 6); //이건 ArrayList는 아니다.(근거가 없음) //getClass하면 
		List<Integer> win = new ArrayList<>(balls.subList(0, 6)); // 감싸야한다.
				
		
		System.out.println("전송 될 숫자 조합");
		System.out.println(win);

		oos.writeObject(win); //이거 ball로 바꿔보자 되긴된다 ArrayList$$sublist
		oos.flush();
		
		socket.close();
		server.close();

	}
}
