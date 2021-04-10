package api.net.String_writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test01_Client {
	public static void main(String[] args) throws IOException {
		InetAddress adress = InetAddress.getByName("127.0.0.1");
			Socket socket = new Socket(adress, 30000);
			System.out.println("접속완료!");
			

			InputStreamReader isr =  new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String a = br.readLine();
				if(a==null) {break;}
				System.out.println(a);
			}
			socket.close();
	}
}
