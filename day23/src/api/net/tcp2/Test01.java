package api.net.tcp2;

import java.net.InetAddress;

public class Test01 {
	public static void main(String[] args) {

// TCP 클라이언트 코드
// =반드시 접속해야할 서버의 IP와 port를 알아야한다.
// ip경우 돈을 내고 등록하거나 DDNS설정을 하면 영문으로 바꿔서 쓸 수 있다.

		String host = "192.168.35.108";
		int port = 30000;

		try {
			InetAddress address = InetAddress.getByName(host);
			System.out.println("접속 가능한 주소입니다"); //양식만 검사
		} catch (Exception e) {
			System.out.println("접속 가능한 불가능입니다");
		}
	}
}
