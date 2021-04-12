package api.net.String_massage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test01_Client {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address, 30000);

		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter br = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(br);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작");
		while (true) {
			String text = sc.nextLine();
			if (text.equals("그만")) {
				break;
			}
			pw.println(text);
			pw.flush();
		}
		
		sc.close();
		socket.close();
	}
}
