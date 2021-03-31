package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test06 {
	public static void main(String[] args) throws IOException {
		//내가 만든 클래스를 입출력해보는 연습.
		
		Student s = new Student("홍길동", 90, "010-3434-5656");
		
		//파일 출력
		File target = new File("kh", "student.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream oos = new ObjectOutputStream(buffer);
		
		oos.writeObject(s);
		
		oos.close();
	}
}
