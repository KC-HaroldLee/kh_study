package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws Exception {
		//목표: kh라는 폴더안에 single.gp라는 이름의 파일을 만들고 원하는 내용을 byte단위로 출력.
		//그래서 유니코드는 불가능하다.
		//준비물. : 파일 객체와, (만드는거니까) 출력통로
		
		//파일 객체
		File target = new File("kh", "single.gp");
		
		//스트림
		FileOutputStream out = new FileOutputStream(target);
		
		//프로그램 ----> out ----> target---->[single.gp]
		//덮어쓰기다.
		out.write(237);
		out.write(140);
		out.write(140);
		//out.write(236);
		//out.write(140);
		//out.write(188);
		
		//통로는 close해야한다.
		out.close();
	}
}
