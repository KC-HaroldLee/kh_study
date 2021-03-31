package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02 {
public static void main(String[] args) throws IOException {
	//PrintWriter : 출력의 편의를 위한 각종명령을 제공하는 도구
	
	//준비물 : 파일객체, 출력스트림
	File target = new File ("kh", "stirng.kh");
	FileOutputStream out = new FileOutputStream(target);

	//출력
	String str = "헬로 JAVA!1";
	byte [] by = str.getBytes();
	out.write(by);
	
	str = "헬로 JAVA!2";
	by = str.getBytes();
	out.write(by);
	
	//문제점
	//1. byte로의 변환과 인코딩 처리를 자동화 할 수 없는가?
	//2. 개행 문자를 직접 추가하지 않을 수는 없는가?
	//3. 문자열 외의 데이터들은 출력할 수 없는가?

}
}
