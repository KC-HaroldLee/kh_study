package etc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Drive_info {
	public static void main(String[] args) {

		List<File> list = new ArrayList<>(); //File

		for (char i = 'A'; i <= 'Z'; i++) { //char
			File drive = new File(i + ":\\");
			if (drive.exists()) {
				System.out.println(i + "드라이브가 감지되었습니다.");
				list.add(drive);
			}
		}
		System.out.println("총 " + list.size() + "개 발견");
		
		for(File drive : list) {
			System.out.println(drive.getAbsolutePath());
		}
	}
}
