package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
	//프로젝트 내부에 있는 kh폴더의 hello.txt의 정보를 확인
		
	//파일을 제어할 수 있는 객체를 생성
	File a = new File("kh/hello.txt");
	File b = new File("kh", "hello.txt");
	
	
	System.out.println(a.exists());// 존재하는가
	System.out.println(b.exists());// 존재하는가
	
	System.out.println(a.length());// 파일크기. 파일은 글자들의 합이니 String과 같다.
	System.out.println(a.getName());// 이름 뽑아오기
	
	System.out.println(a.getPath()); // 경로 뽑아오기 상대경로 파일 이름 포함
	System.out.println(a.getAbsolutePath()); // 절대 경로
	System.out.println(a.getPath());
	
	System.out.println(a.lastModified()); // 최종 수정 시각
	Date d = new Date(a.lastModified());
	Format f = new SimpleDateFormat("Y년 M월 d일 E요일, a H:mm:ss");
	System.out.println(f.format(d));
	}
}
