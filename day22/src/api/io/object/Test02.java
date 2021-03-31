package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// 모든 클래스의 객체가 출력이 가능한 것은 아니다.
			// java.io.Serializable 자식클래스만 가능

		// 객체 생성
		Runtime r = Runtime.getRuntime();

		// 파일 출력
		// 객체 --> (직렬화) --> 바이너리 형태 --> (분해) --> 데이터 -->(출력) -->통로;

		File target = new File("kh", "object2.kh");

		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out); // 까지는 같다
		ObjectOutputStream oos = new ObjectOutputStream(buffer);

		// 객체 --> oos(직렬화+분해) --> buffer(대기실) --> out(통로) --> target -- [object.kh]

		oos.writeObject(r);
		oos.close();
	}
}
