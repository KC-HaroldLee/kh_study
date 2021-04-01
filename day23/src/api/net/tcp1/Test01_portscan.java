package api.net.tcp1;

import java.io.IOException;
import java.net.ServerSocket;

public class Test01_portscan {
	public static void main(String[] args) {
	
		// 포트스캔 프로그램
		for(int port=0; port<=65535; port++)
		
		try {
			ServerSocket server = new ServerSocket(port);//웬만해서 1023 이상, 10000번대 피하기
			//System.out.println(port + " 번 포트 사용시작");
		} catch (IOException e) {
			System.out.println(port + "번 포트 사용중");
		}
	}
}
