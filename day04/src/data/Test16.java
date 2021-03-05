package data;
import java.lang.*;
public class Test16 {
	public static void main(String[]args) {
		//목표 : 나이를 이용해서 무임승차 대상인지 판정
		// - 기준 : 어르신(65세 이상, 유아 (8세 미만)
		// 아까완 다르게 하나만 true면 된다! 그래서 or!
		
	//입력
	int age = 7;
	
	//계산
	//이건 아까 방법
	//boolean oldman = age >=65;
	//boolean infant = age < 8;
	//boolean freeRide = oldman || infant; // or을 써야지!

	//이건 간단한 방법
	boolean freeRide = age <8 || age >=65; // or을 써야지

	
	//이건 생각의 전환 (말장난)
	//8세이상 이고 65세 미만인 경우가 아니면 무임승차입니다.
	//boolean freeRide = !(age >=8 && age <65); // 아 느낌표를 여기도 쓸 수 있구나!

		
	//출력
	
	System.out.println(freeRide);
	}
}
