package api.net.String_massage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address, 30000);

		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);

		Scanner sc = new Scanner(System.in);

		while (true) {
			String text = sc.nextLine();
			pw.println(text);
			if (text.equals("그만")) {
				break;
			}
			pw.flush();
		}
		socket.close();
		System.out.println("그만 입력해서 서버와 종료 끊음");

	}
}
