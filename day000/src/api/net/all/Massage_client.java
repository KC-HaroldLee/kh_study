package api.net.all;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Massage_client {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address, 30000);

		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream()); //책 보내는 작가
		BufferedWriter br = new BufferedWriter(osw); // 책으로 만들어주는 작가
		PrintWriter pw = new PrintWriter(br); // 글만 쓰는 작가

		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작");
		while (true) {
			String text = sc.nextLine();
			if (text.equals("그만")) {
				break;
			}
			pw.println(text); //흠흠 제가 작성하죠
			pw.flush(); //잠깐 화장실 좀
		}
		
		sc.close();
		socket.close();
	}
}
