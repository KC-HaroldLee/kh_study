package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test03_sol {
	public static void main(String[] args) throws Exception {
//		Test01 에서 저장한 객체(java.util.Date)를 불러온다
//		= 객체 입출력은 무수히 많은 자료형의 객체들을 저장할 수 있다.
//		= 자료형을 고려하면서 저장하기가 어렵고, 성능도 느려진다.
//		= Object 형태로 업-캐스팅해서 저장(아무거나)
//		= 개발자가 저장한 형태를 알고 있을 것이기 때문에 프로그램에서 신경쓰지 않으며, 성능 향상

//		준비물 : 파일객체 + 스트림 3종세트
		File target = new File("kh", "object.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream ois = new ObjectInputStream(buffer);

//		[프로그램] <-- ois(역직렬화+조립) <-- buffer(대기실) <-- in(통로) <-- target <-- [object.kh]

		Object object = ois.readObject();
//		System.out.println(object.getClass());
		Date d = (Date) object;// 다운캐스팅(원래 Date였던 객체를 Object로 보관하다가 되돌린다)

//		통로 정리
		ois.close();

		System.out.println(d);

	}
}
