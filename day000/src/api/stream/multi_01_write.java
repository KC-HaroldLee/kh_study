package api.stream;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class multi_01_write {
	public static void main(String[] args) throws IOException {
		File target = new File  ("kh", "sample.kh");
		FileOutputStream out = new FileOutputStream(target);
		
		//멀티부터는 배열로 버퍼를 만들 수 없어
		BufferedOutputStream buffer =  new BufferedOutputStream(out);
		
		//buffer에도 write가 있긴하다. 하지만 byte까지밖에 되지 않는다.
		DataOutputStream dataOut = new DataOutputStream(buffer);
		
		
		dataOut.writeDouble(1.12);
		dataOut.writeChar(12);
		dataOut.writeDouble(1.12);
		dataOut.writeLong(1000L);
		dataOut.writeLong(5000L);
		
		dataOut.flush();
		
		
		
	}
}
