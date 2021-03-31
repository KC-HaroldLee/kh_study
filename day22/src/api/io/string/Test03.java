package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
public static void main(String[] args) throws IOException {
	//Test02의 문제를 해결하겠다.
	// FileOutputStream ---> FileWriter
	// BufferedOutputStream --->  BufferedWriter //버퍼 조절시 사용할 것
	
	File target = new File ("kh", "string2.kh");
	FileWriter fw = new FileWriter(target);
	
	fw.write("헬로 JAVA!"); // 바로 안들어갔다는 것은 버퍼가있다는 뜻이다.
	fw.flush();
	fw.close();
}
}
