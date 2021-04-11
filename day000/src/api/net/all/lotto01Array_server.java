package api.net.all;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class lotto01Array_server {
	public static void main(String[] args) throws IOException {
		String host = "localhost";
		int port = 30000;
		
		InetAddress adress = InetAddress.getByName(host);
		Socket socket = new Socket(adress, port);
		
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		DataInputStream data = new DataInputStream(buffer);
		
		while(true) {
			int a = data.readInt();
			if(a==-1) {
				break;
			}
			System.out.println(a);
		}
		socket.close();
	}
}
