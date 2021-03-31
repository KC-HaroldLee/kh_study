package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05_sol {
	public static void main(String[] args) throws IOException {
		// kh/song.txt 의 내용을 읽어
		// 파일 내부의 글자 수
		// 파일 내부의 글자 줄 수

		File target = new File("kh", "song.txt");
		FileReader fr = new FileReader(target);
		BufferedReader br = new BufferedReader(fr);

		// BufferedReader br = new BufferedReader(new FileReader(target)); 과 같다.

		// 줄 수
		int charCount = 0;
		int lineCount = 0;

		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			charCount += line.length(); // 아 리드라인이 아니라 라인 렝스구나.
			// if(!line.trim().length()>0){//공백을 제거 하고 줄 길이가 0이라면
			// if(!line.trim().isEmpty()){//공백을 제거하고 줄이 비어있다면
			if (!line.isBlank()) {// 아무것도 없다면 < 이게 제일 말과 비슷
				lineCount++;
			}

			System.out.println("줄 수 = " + lineCount + "개");
			System.out.println("글자 수 = " + charCount + "개");

		}
	}
}
