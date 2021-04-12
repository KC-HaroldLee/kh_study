package api.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class single_1 {
public static void main(String[] args) throws IOException {
	File target = new File ("kh", "sample.kh");
	
	FileOutputStream out = new FileOutputStream(target, true); // 파일이 없는 경우 예외처리
	
	out.write(65);
	out.write(66);
	out.write(67);
	out.write(68);
	
	System.out.println("done");
	
	
}
}
