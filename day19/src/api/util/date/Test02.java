package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//시간을 원하는 형식으로 출력
		Date a = new Date();
		
		//1. 정보를 직접 ㅜㄹ러와서 시간을 조립해서 생성
		int year = 1900 + a.getYear();
		int month = 1+ a.getMonth();
		int date = a.getDate();
		System.out.println(year + "-" + month + "-" + date);
		
		//2. 형식 변환 객체를 만들어서 변환하도록 지시
		//java.text 패키지에 형식 변환과 관련된 클래스들이 모여있다.
		
		//보통 업캐스팅을 한다.
		
		Format fmt = new SimpleDateFormat("yyyy-MM-dd");
		//SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		//time = fmt.format(a);
		
				
	}
}
