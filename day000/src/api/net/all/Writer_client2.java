package api.net.all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Writer_client2 {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address, 30000);
		
		//여긴 두 작가만 필요하다.
		InputStreamReader isr = new  InputStreamReader(socket.getInputStream()); //배송받는 작가(날로먹네)
		BufferedReader br = new BufferedReader(isr);//책을 읽어주는 작가
		//이걸 또A4용지에 적어주는 작가라고 고용하게??
		
		
		while(true) {
			String a = br.readLine();
			if(a==null) {break;}
			System.out.print(a);	
		}
		
	}
}
