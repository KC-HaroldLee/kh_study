package api.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class single_copy_1 {
	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream(new File("kh", "sample.kh"));
		FileOutputStream out = new FileOutputStream(new File("kh", "copy.kh"));

		while (true) {
			int a = in.read();
			if (a == -1) {
				break;
			}
			out.write(a);
		}

	}
}
