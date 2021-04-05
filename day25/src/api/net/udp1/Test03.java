package api.net.udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket();

		// Scanner sc = new Scanner(System.in);
		while (true) {
			String content = JOptionPane.showInputDialog("입력해주세요");
			byte[] data = content.getBytes("UFT-8");

			InetAddress address = InetAddress.getByName("localhost");
			int port = 30000;

			DatagramPacket dp = new DatagramPacket(data, data.length, address, port);

			ds.send(dp);
			if (content == null) {
				break;
			}
		}
		
		
		ds.close();
	}
}
