package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05_fun {
	public static void main(String[] args) throws IOException {
		// kh/song.txt 의 내용을 읽어
		// 파일 내부의 글자 수
		// 파일 내부의 글자 줄 수

		File target = new File("kh", "song.txt");
		FileReader fr = new FileReader(target);
		BufferedReader br = new BufferedReader(fr);

		// 글자 수
		char[] buffer = new char[1];

		int charCount = 0;
		int lineCount = 0;
		
		while (true) {
			int size = br.read(buffer);
			if (size == -1) {
				break;
			} 
			charCount++;
			if (size == 10) {
				lineCount++;
			}
		}

		System.out.println("글자 수 = " + charCount + "개");
		System.out.println("줄 수 = " + lineCount + "개");
	}
}
