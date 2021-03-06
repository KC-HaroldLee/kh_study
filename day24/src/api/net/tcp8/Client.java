package api.net.tcp8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("localhost");
		int port = 30000;

		Socket socket = new Socket(address, port);

		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			String text = br.readLine();
			if (text == null) {
				break;
			}
			System.out.println(text);
			
		}
		socket.close();

	}
}
