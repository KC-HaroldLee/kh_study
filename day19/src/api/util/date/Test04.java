package api.util.date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Test04 {
	public static void main(String[] args) {
		
		//지역설정
		Date d = new Date();
		
		Format f = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss", Locale.KOREA);
		
		System.out.println(f.format(d));
	}
}
