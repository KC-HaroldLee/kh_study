package api.io.file;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		//파일, 폴더를 생성하고 삭제하는 기능
		File dir = new File ("kh", "test");
		
		System.out.println(dir.exists());
		
		//폴더 생성
		//dir.mkdir(); // 중간경로가 없으면 생성이 안됨
		dir.mkdirs(); // 중간 경로까지 다
		
		
		dir.delete();
	}
}
