package api.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class single_copy_2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream(new File ("kh", "Sample.kh"));
		FileOutputStream out = new FileOutputStream(new File ("kh", "copy.kh"));
		
		byte [] arr = in.readAllBytes();
		//writeAllBytes는 없다.			
		out.write(arr);
		
		System.out.println("all done");
	}
}
