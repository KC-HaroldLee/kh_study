package data;
	import java.lang.*; //열여덟
public class Test18 {
	public static void main(String[] args) { //ctrl + space... wow... 나중에 자주 쓸래
		//문자, 문자열
		//=문자는 1글자를 보관하기위한 형태 (char)
		//=문자열은 여러글자를 보관하기 위한 형태 (String
		
		char a = 'A'; // 문자는 작은 따옴표를 써야한다.
		char b = 'B'; 
		char c = '가'; //도 된다
		//자음 따로 모음 따로는 안된다.
		//char d = 'ㄱ' //은 안된다. 물론 모음도
		
		//'A'는 아스키코드에서 65(10)이다.
		//아 한글자씩 해야하는 이유 표에 하나씩 찍혀 있으니까
		
		System.out.println(a);
		System.out.println((int)a);//wow
		System.out.println((int)a+(int)b); // 숫자이긴 한데 계산 용도는 아니다.
		
		int e = a; // 이것도 된다.
		System.out.println(e);
		
		//하지만
		int f = 44032;
		char g =  (char)c; //앞에 꼭 명시적, 강제변환 (큰 -->작)
		System.out.println(g); // 결과 값 가

		
		//Q. 다음 변수가 영어 글자인지 판정하여 출력
		char ch = 'H';
		int eng = ch;
		boolean engUpper = eng >= 65 && eng<=90;
		boolean engLower = eng >= 97 && eng<=122;
		boolean endDef = engUpper || engLower;
		System.out.println(endDef);
		
	}
	}
