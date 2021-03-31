package etc;

import java.io.File;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_test {
	public static void main(String[] args) {
		
		File a = new File("kh", "sample.txt");
		//System.out.println(a.exists());
		
		//Format f1 = new SimpleDateFormat("Y년 M월");
		
		Date d = new Date(a.lastModified()); // 수로 빼놨다.
		
		//System.out.println(f1.format(d));


		Format f2 = new DecimalFormat("0");
		Format f3 = new DecimalFormat(".##");
		Format f4 = new DecimalFormat("000.00");
		
		System.out.println(f2.format(500));
		System.out.println(f3.format(0.512));
		System.out.println(f4.format(0.512));
		
		
	}
}
