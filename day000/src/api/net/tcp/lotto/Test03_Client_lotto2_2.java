package api.net.tcp.lotto;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test03_Client_lotto2_2 {
	public static void main(String[] args) throws IOException {
		InetAddress adress = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(adress, 30000);
		
		BufferedInputStream bufferIn = new BufferedInputStream(socket.getInputStream());
		DataInputStream dataIn =  new DataInputStream(bufferIn);
		
		for(int i = 0; i<6; i++) {
			int a = dataIn.read();
			System.out.println(a);
		}
		socket.close();
	}
}
