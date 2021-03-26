package api.util.date;

import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//java.util은 필수는 아니지만 매우 유용한 도구들이 존재한다.
		//Date클래스 : 시간 정보를 관리하는 클래스
		
		Date a = new Date();
		Date b = new Date (2021, 3 ,26);
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}
