package api.net.tcp1;

import java.io.IOException;
import java.net.ServerSocket;

public class Test01 {
	public static void main(String[] args) {
		//TCP 통신 : 연결지향형 통신
		//=연결을 위해 대기하는 프로그램과 접속하는 프로그램 2가지가 필요하다.
		//=연결을 대기하는 서버
		//=연결을 시도하는 클라이언트
		
		//서버 코드
		//= 통신을 위해서 반드시 상대방의 IP과 port를 알아얗낟.
		//= 서버입장에서는 IP가 정해져있다.
		//어떤 포트가 사용 할 수 있는지 없는지 알수 없으니까 파악을 해봐야한다.
		//=ServerSocket
		
		try {
			ServerSocket server = new ServerSocket(30000);//웬만해서 1023 이상, 10000번대 피하기
			System.out.println("30000번 포트 사용시작");
		} catch (IOException e) {
			System.out.println("30000번 포트 사용중");
			e.printStackTrace();
		}
	}
	
}
