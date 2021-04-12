package api.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class single_read_2 {
	public static void main(String[] args) throws IOException {
		
		//이번엔 뭉쳤다.
		FileInputStream in = new FileInputStream(new File("kh", "sample.kh")); // 이렇게 줄일 수도 있다.

		byte[] array = in.readAllBytes();
		System.out.println(Arrays.toString(array));
		
		byte[] arrayRest = in.readAllBytes();
		System.out.println(Arrays.toString(arrayRest));
		
			
	}
}
