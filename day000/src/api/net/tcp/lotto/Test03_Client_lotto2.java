package api.net.tcp.lotto;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Test03_Client_lotto2 {
	public static void main(String[] args) throws IOException {
		
		String host = "127.0.0.1";
		int port = 30000;		
	
		InetAddress adress = InetAddress.getByName(host);
	
		Socket socket = new Socket (adress, port);
		
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		DataInputStream data = new DataInputStream(buffer);
	
		int [] balls = new int [6];
		
		for(int i  = 0; i< balls.length; i++) {
		balls [i] = data.readInt();
		}
		System.out.println(Arrays.toString(balls));
	}
}
