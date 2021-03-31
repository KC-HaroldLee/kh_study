package multi_byte;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) throws IOException {
		// 파일 준비
		File target = new File("kh", "lotto.kh");
		// 스트림 준비
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream dataOut = new DataOutputStream(buffer);

		Random r = new Random();

		List<Integer> Base = new ArrayList <>();
		
		for(int i =1; i<=45; i++) {
			Base.add(i);
		}
		Collections.shuffle(Base);
		
		
		
		
		List<Integer> checkList = new ArrayList<>();
		/*for (int i = 0; i < 6;) {
			int n = r.nextInt(45) + 1;
			if (!checkList.contains(n)) {
				dataOut.writeInt(n);
				checkList.add(n);
				i++;
			} else {

			}
		}*/
		
		
		dataOut.flush();
		dataOut.close();
		System.out.println(checkList);
	}
}
