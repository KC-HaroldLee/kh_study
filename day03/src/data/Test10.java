package data;
	import java.lang.*;
public class Test10 {
	public static void main (String[]args) {

	//문제 1
     	//타율 계산
		//야구선수 타율은 '안타수 / 타수'로 계산됩니다.
		//안타에는 홈런이 포함된다, 야구선수 A의 지난 시즌 기록은 -
		//120타수 25안타 11홈런 
		//이선수의 타율을 구하여 화면에 출력


	int attempt = 120;
	int hit = 25;
	int hr = 11;
	double hitTotal = (hit+hr); //음... 좀 더 정확한 방법이 있을 거 같은데요
	
	double rate= ((hitTotal)/attempt);
	
	System.out.println("이 선수의 타율은 " + rate + "입니다");
}
}
