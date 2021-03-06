package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		// 컴퓨터에는 이론상 26개의 드라이브가 존재할 수 있다.
		// A:\~Z:\까지

		// 현재 본인의 컴퓨터에 존재하는 모든 드라이브 경로를 읽어와서 List에 저장한 후 출력

		char[] driveName = new char[26];

		for (int i = 0; i < driveName.length; i++) {
			driveName[i] = (char) (65 + i);
		}
		// System.out.println(Arrays.toString(driveName));

		for (int i = 0; i < driveName.length; i++) {
			File drive = new File(driveName[i] + ":/");
			if (drive.exists()) {
				System.out.println("<" + driveName[i] + "드라이브의 정보>");
				// 절대경로
				System.out.println("절대경로 = " + drive.getPath());
				// 수정날짜
				Date d = new Date(drive.lastModified());
				Format f = new SimpleDateFormat("Y년 M월 d일 E요일, a H:mm:ss");
				System.out.println("마지막 수정시간 = " + f.format(d)); // !?!?!?!??!?!?!?!?!
				// 파일크기
				System.out.println("???(?)= " + drive.length());
				// 읽기가능
				System.out.println("읽기가능 = " + drive.canRead());
				// 쓰기가능
				System.out.println("쓰기가능 = " + drive.canWrite());

				System.out.println("-----------------------------");
			}
		}
	}

}
