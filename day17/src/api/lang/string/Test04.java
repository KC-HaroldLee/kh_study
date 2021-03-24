package api.lang.string;
import java.util.Scanner;
public class Test04 {
public static void main(String[] args) {
	
	//사용자에 닉네임 입력받음 다음과 같은 요구사항에 맞게
	//1. 운영자가 들어가면 안됨
	//2. 닉네임은 2~10글자 이내로만 설정가능
	//3. 닉네임의 첫글자는 숫자일 수 없다.
	
	//요구사항을 통과하면 "닉네임 설정이 완료 되었습니다"
	
	Scanner sc = new Scanner(System.in);
	System.out.println("닉네임을 입력해주세요.");
	String nickName = new String(sc.next());
	sc.close();
	
	System.out.println(nickName);
	
	
	boolean pass1 = !nickName.contains("운영자") ;
	boolean pass2 = nickName.length()>=2|| nickName.length()<=10;
	boolean pass3 = !(nickName.charAt(0)>= '0' && nickName.charAt(0)>= '9');
	
	if(pass1 && pass2 && pass3) {
		System.out.println("닉네임 설정이 완료되었습니다");
	}
	else {
		System.out.println("잘못된 닉네임 입니다.");
	}
	
}
}
