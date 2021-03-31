package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test04_02 {
	public static void main(String[] args) throws IOException {

		File target = new File("kh", "string2.kh");
		FileReader reader = new FileReader(target); // char단위로 들어온다.

		char[] buffer = new char[10];
		StringBuffer sb = new StringBuffer();

		while (true) {
			int size = reader.read(buffer);
			if (size == -1) {
				break;
			}
			sb.append(buffer, 0, size);
		}
		System.out.println(sb.toString());
	}
}
