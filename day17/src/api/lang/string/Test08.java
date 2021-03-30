package api.lang.string;
import java.util.Scanner;
public class Test08 {
	public static void main(String[] args) {
	//문자열과 원시 자료형간의 변환
	//int -> String 혹은 String -> int
	
	int a = 100;
	//String b = a;
	//String b = (String)a;
	//String b = ""+a; //편법 : 문자열은 어떤 값과 더해도 문자열이 된다는 특징을 이용
	String b = String.valueOf(a); //정식 방법
	
	String c = "12345";
	int d = Integer.parseInt(b); // 정식 방법
}
}
