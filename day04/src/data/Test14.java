package data;
	import java.lang.*;
public class Test14 {
	public static void main(String[]args) {
		//사용자에게 출생년도 4자리를 입력받아 성인인지 판정하는 프로그램
		//입력값은 2000 성인은 한국나이로 20세 이상
		//성인이면 true, 미성년자면 false
		//나이도 출력되게
		// 2002는 20살 2003은 19살
		
		int birthYear = 2000;
		
		//boolean adult =  나이가 20세 이상인가요? <인지 주석? 뭐라고 하셨지?   
		boolean adult =  birthYear<=2002; // 적어야지? 그래야 나이가 많으니
		
		//나이 = 태어난 해에서 올해까지 숫자가 몇 개 있는지.
		
		int intlAge = 2021-birthYear; //ㅋㅋㅋ 아니 줄임말이 intl인데
		int koreaAge = intlAge+1;
		
		System.out.println(adult);
		System.out.println("당신의 (한국)나이는 " + koreaAge + "입니다.");
		
		
	}

}
