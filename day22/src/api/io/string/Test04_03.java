package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test04_03 {
	public static void main(String[] args) throws IOException {

		File target = new File("kh", "string2.kh");
		FileReader reader = new FileReader(target); // char단위로 들어온다.
		BufferedReader br = new BufferedReader(reader);

		StringBuilder sb = new StringBuilder();
		
		while (true) { // 문자열에선 null이 EOF다
			String line = br.readLine();
			if (line == null) {
				break;
			}
			sb.append(line);
			sb.append("\n");
			System.out.println("line = " + line);
		}

	}
}
