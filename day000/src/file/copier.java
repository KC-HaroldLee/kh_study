package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copier {
	public static void main(String[] args) throws IOException {
		// 바이트 카피

		// 준비물은 꼭 세트다.
		File origin = new File("kh", "sample.kh");
		File export = new File("kh", "sample-copy.kh");

		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(export, true);

		while (true) {
			int n = in.read();
			System.out.println(n);
			if(n==-1) {
				break;
			}
			else {
			out.write(n);
			}
		}

	}

}
