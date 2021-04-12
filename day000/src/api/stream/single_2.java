package api.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class single_2 {
public static void main(String[] args) throws IOException {
	File target = new File("kh", "sample.kh");
	
	FileOutputStream out = new FileOutputStream(target);
	
	out.write(123);
	out.write(124);
	out.write(125);
	out.write(126);
	
}
}
