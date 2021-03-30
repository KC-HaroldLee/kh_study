package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
	
//single byte 입력
	//목표 : kh 폴더 안에 잇는 그 파일을 일거와 출력
	
	//준비물 : 객체 입통
	
	File target = new File("kh", "single.gp");
	
	FileInputStream in = new FileInputStream(target);
	
	
	// [프로그램] <----- in <-------- target <--------[single.gp]
	int n = 0;
	while(n!=-1) {
	System.out.println("n = " + n);
	n = in.read();
	}
	in.close();
}
}
