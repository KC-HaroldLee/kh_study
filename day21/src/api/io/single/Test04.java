package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		//목표 : 싱글바이트 출력을 여러개 묶어서 처리
		//byte ----> byte[]
		
		//준비
		File origin = new File ("kh", "single2.kh");
		FileOutputStream out = new FileOutputStream(origin);
		
		byte [] data = new byte[] {104,101,108,108,111}; //hello
		out.write(data);// 오 한 번에 되네?!
		out.write(data, 1, 3);//
		out.write(data, 2, 3);//
		
		out.close();
	}
}
