package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
	//public static final int EOF = -1;// 이거 보고싶다...
		
		File origin = new File("kh", "practice.kh");
		FileInputStream in = new FileInputStream(origin);

		File export = new File("kh", "copy.kh");
		FileOutputStream out = new FileOutputStream(export); // 트루 안 함

		while (true) {
			int a = in.read();
			if (a == -1) {
				break;
			} else {
				System.out.println(a);
				out.write(a);
			}
		}
		in.close();
		out.close();
	}
}
