package multi_byte;

import java.awt.image.DataBufferInt;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
public static void main(String[] args) throws IOException {
	File target = new File ("kh", "multi.kh");
	
	FileInputStream out = new FileInputStream(target);
	
	BufferedInputStream buffer = new BufferedInputStream(out);
	DataInputStream dataIn = new DataInputStream(buffer);
	
	//dataIn.readInt(); // 4byte를 읽어와서 int로 복원해라
	int a = dataIn.readInt(); // 4byte를 읽어와서 int로 복원하고 int a 에 넣어라
	double b = dataIn.readDouble();//
	float c = dataIn.readFloat();
	char d = dataIn.readChar();
	
	dataIn.close();
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	
}
}
