package date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
public static void main(String[] args) {
	Date a = new Date(); // 일단 현재 날짜.
	
	int year = 1900+a.getYear(); //뭐 이렇게도 된다...
	// 아래 생략.
	
	Format fmt = new SimpleDateFormat("YYYY-MM-dd");
	System.out.println(fmt.format(a));
}
}
