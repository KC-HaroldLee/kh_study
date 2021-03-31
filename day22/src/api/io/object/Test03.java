package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) throws Exception {
		// Test01 객체를 불러온다.
		// 객체 입출력은 무수히 많은 자료형의 객체들을 저장할 수 있다.
		// 뭔지 모르니 Object로 업캐스팅

		// 준비물
		File target = new File("kh", "object.kh");

		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream ois = new ObjectInputStream(buffer);

		// [프로그램] <-- ois(역직렬화+조립) <-- buffer(대기실) <--in(통로) <-- target <--
		// [oobject2.kh]
		//

		Object object = ois.readObject();
		Date d = (Date) object; // 다운캐스팅(원래 Date였던 객체를 다시...)

		ois.close();

		System.out.println(d);

	}
}
