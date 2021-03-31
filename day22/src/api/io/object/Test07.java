package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//불러오기
		
		File target = new File("kh", "student.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream ois = new ObjectInputStream(buffer);
		
		Student a = (Student)ois.readObject();//다운캐스팅
		ois.close();
		
		System.out.println("이름 = " + a.getName());
		System.out.println("점수 = " + a.getScore());
		System.out.println("전화번호 = " + a.getPhone());
	}
}
