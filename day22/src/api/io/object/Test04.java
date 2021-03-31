package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException {

		List<Integer> balls = new ArrayList<>();
		
	
		for (int i = 1; i <= 45; i++) {
			balls.add(i);
		}
		
		Collections.shuffle(balls);
		
		
		File target = new File ("kh", "lotto.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream oos = new ObjectOutputStream(buffer);
		
		// 여기까지는 하것다.
		
		/*oos.writeObject(oos); // 얘는 원래 형식을 맞춰야하지만 내가 보내려는 건 리스트니까 오브젝트로 퉁친다.
		oos.flush();//일단은 난 써버릇 할래
		oos.close();
		*/
	}
}
