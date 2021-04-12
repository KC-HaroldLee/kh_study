package api.net.String_writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test02_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		String a = "hello!!!";
		
		pw.write(a);
		pw.flush();
		
		socket.close();
		server.close();
	}
}
