package api.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class single_read_1 {
	public static void main(String[] args) throws IOException {
		File target = new File("kh", "sample.kh");

		FileInputStream in = new FileInputStream(target);

		while (true) {
			int n = in.read();
			if (n == -1) {
				break;
			}
			System.out.println("n =" + n);
		}
		System.out.println("all done");
	}
}
