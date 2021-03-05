package data;
	import java.lang.*;
public class Test15 {
	public static void main (String [] args) {
		//목표 : 나이를 이용하여 청소년인지 판정하는 프로그램
		// -청소년 14세 이상 19세이하 / 보통은 14세 이상 20세 미만으로 표현하지
		
		//입력
		int age =15;
		
		//계산
		//이거 안 된대...
		//boolean teen = 14 <= age <=19; //왜 안되냐!?
		//계산은 두 번 해야한다. 계산 순서대로 왼쪽 (괄호부터)
		
		// 그럼 이건가? 
		//13은 F.T 14는 T.T 24는 T.F
		boolean minTeenAge = age >= 14;
		//System.out.println(minTeenAge);
		boolean maxTeenAge = age < 20;
		//System.out.println(maxTeenAge);

		//사실 더 간단하게 아래와 같이 할 수 있다. 하지만 과정을 위해서 위처럼 표현한 것.
		//boolean teen = age >= 14 && age < 20;
		
		//논리끼리 합치는 계산이 있다.
		//boolean teen = a와 b가 모두 true이어야한다.
		boolean teen = minTeenAge && maxTeenAge;
		
		// 출력
		System.out.println(teen);
	}
}
