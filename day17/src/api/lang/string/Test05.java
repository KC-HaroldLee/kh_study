package api.lang.string;
import java.util.Scanner;
public class Test05 {
public static void main(String[] args) {
	//쿵쿵따
	
	//준비
	String given = "바나나";
	String input = "나트륨";

	//계산
	boolean pass1 = input.length()==3;
	//boolean pass2 = given.charAt(2)==input.charAt(0);
	boolean pass2 = given.charAt(given.length()-1)==input.charAt(0);
	
	
	
	//출력

	System.out.println("쿵쿵따");
	System.out.println("게임오버");
	
}
}
