package multi_byte;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//multi byte(int, long, float, double ...) 출력
		File target = new File ("kh", "multi.kh");
		
		FileOutputStream out = new FileOutputStream(target);
		
		
		/*불가능
		out.write(1.5); 
		out.write(100L);
		out.write(1500); <-이건 순환구조로 다른 수가 들어갈 것이다.
		*/
		
		//1. 자료형이 깨진다.
		//2. 자료형마다 분해 및 조립방법이 다르다.
		
		//새로운 것들을 추가하자.
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream dataOut = new DataOutputStream(buffer);
		
		//프로그램 ---> dataOut(분해) ---> buffer(대기실) ----out(통로) ---> target ---> [multi.KH]
		
		dataOut.writeInt(100); // 100을 int의 형식으로 분해하세요...buffer에 아직 남아 있음
		dataOut.writeDouble(100); // 100을 double의 형식으로 분해하세요...buffer에 아직 남아 있음
		dataOut.writeFloat(100); // 100을 float의 형식으로 분해하세요...buffer에 아직 남아 있음
		dataOut.writeChar(100); // 100을 char의 형식으로 분해하세요...buffer에 아직 남아 있음
		dataOut.writeUTF("안녕");
		
		//이렇게 하면 buffer에 18바이트(4+8+4+4)의 자료만 남아있다.
		//대기실을 비워야 출력이 이루어진다. (수동) (8192)
		//대기실을 가득채워도 출력이 이루어진다. (자동)
		
		dataOut.flush(); // 명령어...
		
		dataOut.close(); // flush가 포함되어있다. 나가긴하다.
	}
}
