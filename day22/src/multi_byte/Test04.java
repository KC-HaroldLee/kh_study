package multi_byte;

import java.awt.image.DataBufferInt;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.type.ArrayType;

public class Test04 {
	public static void main(String[] args) throws IOException {
		File target = new File("kh", "lotto.kh");

		FileInputStream out = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(out);
		DataInputStream dataIn = new DataInputStream(buffer);

		List<Integer> win = new ArrayList<>();
		
		for (int i = 0; i < target.length()/4; i++) {
			int no = dataIn.readInt();
			win.add(no);
		}
		dataIn.close();
		System.out.println("이번주 로또 번호는 = " + win);

	}
}
