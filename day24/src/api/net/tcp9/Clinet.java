package api.net.tcp9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import java.util.Scanner;

public class Clinet {
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("127.0.0.1");
		int port = 30000;

		Socket socket = new Socket(address, port);

		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw = new BufferedWriter(osw);
	PrintWriter pw = new PrintWriter(bw);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("하고 싶은말을 적고 엔터를 누르세요.");
			System.out.println("\"!그만!\"이라고 입력하면 전송을 멈춥니다");

			String str = sc.nextLine();

			if (str.equals("!그만!")) {
				pw.println("종료합니다.");
				break;
			}
			// 바로 쓰고
			pw.println(str);
			// 바로 비운다
			pw.flush();
			pw.close();
		}
		sc.close();
		socket.close();
	}
}
