package data;
	import java.lang.*;
public class Test20 {
	public static void main(String[] args) {
		//20190503 이라는 정수값이 있을 때,
		//year, month, date라는 변수를 만들어
		//연, 월, 일 정보를 각각 추출하여 저장 후 출력하세요
		
		
		//입력
		int year, month, day;
		int date = 20190503 ;
		
		//계산
		year = (date / 10000);
		//month = ((date-((date / 10000)*10000)-(date % 100))/100);
        month = (date%10000)/100;
		day = (date % 100);
		//month = ((date-(year*10000)-(day))/100);
		
		
		//출력
		System.out.println(year + "년 " + month + ("월 ")+ day + "일입니다.");
	}
}
