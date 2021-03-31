package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03_2 {
public static void main(String[] args) throws IOException {
	//Test03에서 버퍼를 넣음
	
	File target = new File ("kh", "string2.kh");
	FileWriter fw = new FileWriter(target);
	BufferedWriter bw = new BufferedWriter(fw, 1024); 
	PrintWriter pw = new PrintWriter(bw); //이것만 넣으면 된다고?
	
	pw.println("헬로 JAVA!1"); // println로 바뀐다.
	pw.println("헬로 JAVA!2");
	pw.println("300");
	bw.flush();
	bw.close();
}
}
