package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copier_buffer {
	public static void main(String[] args) throws IOException {
		File origin = new File("kh", "sample.kh");
		File export = new File("kh", "sample-copy.kh");

		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(export);

		byte[] buffer = new byte[10];

		while(true) {
		int size = in.read(buffer);
		if(size == -1) break;
		out.write(buffer, 0, size);
		}
//		정리
		in.close();
		out.close();

	}
}
