package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test03_sol2 {
	public static void main(String[] args) {
		
		File [] list =File.listRoots();
				
		System.out.println("총" + list.length + "개의 드라이브가 감지되었습니다.");
		for(File drive : list) {
			System.out.println(drive.getAbsolutePath());
		}
	}

}
