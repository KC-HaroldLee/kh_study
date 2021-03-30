package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) throws IOException {
		// 복사 프로그램에 버퍼를 적용시켜 성능을 향상시킨 프로그램을 만든다.

		// 준비물 : 파일 2개, 스트림 2개(입/출)

		File origin = new File("kh", "practice.kh");
		File copy = new File("kh", "copy.kh");

		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(copy);

		byte[] buffer = new byte[8192]; // 10개씩
		while (true) {
			int size = in.read(buffer);
			if (size == -1) {
				break;
			}
			out.write(buffer, 0, size);
		}
		System.out.println(Arrays.toString(buffer));

		// 정리
		in.close();
		out.close();
	}

}
