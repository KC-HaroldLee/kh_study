package api.lang.string;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Test12 {
public static void main(String[] args) {
	// ^검사식$
	// '^' :문장의 시작점을 의미
	// '$' :문장의 종료점을 의미
	// '[]' : 들어가야할 것 	// '[a-c]' 이건 구간
	// '{}' : 횟수 {int} {int, int}

	
	//1. 우편번호 : 신주소 다섯자리 숫자, 구주소 다섯자리숫자.
	//2. 비밀번호 : 영문 대문자, 영문 소문자, 숫자, 특수문자(!@#$) 8~16자 이내로 작성
	//3. 이름 : 한글 2글자 ~ ?글자
	//4. 전화번호 : 010-xxxx*xxxx 형태
	//5. 생년월일 : YYYY-MM-DD형태
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("우편번호를 입력해주세요 (\"-\"은 생략)");
	String postNo = sc.next(); 
	String regextPostNo = "^[0-9]{5,6}$";
	//System.out.println(Pattern.matches(regextPostNo, postNo));
	boolean passPostNo = (Pattern.matches(regextPostNo, postNo));
	System.out.println(passPostNo);
	
	System.out.println("비밀번호를 입력해주세요");
	String pw = sc.next(); 
	String regextPw = "^[a-zA-Z0-9!@#$]{8,16}$";
	//System.out.println(Pattern.matches(regextPw, pw));
	boolean passPw = (Pattern.matches(regextPw, pw));
	System.out.println(passPw);
	
	System.out.println("이름 입력해주세요");
	String name = sc.next(); 
	String regextName = "^[가-힣]{2,24}$"; //이거 어쩌냐
	//System.out.println(Pattern.matches(regextName, name));
	boolean passName = (Pattern.matches(regextName, name));
	System.out.println(passName);	
	
	System.out.println("전화번호를 입력해주세요");
	String phone = sc.next(); 
	String regextPhone = "^[0][1][0][1-9]{8}$"; //이거 어쩌냐
	//System.out.println(Pattern.matches(regextPhone, phone));
	boolean passPhone = (Pattern.matches(regextPhone, phone));
	System.out.println(passPhone);
	
	sc.close();
	
	//출력
	if(postNo.length()==5) {
	System.out.println("입력된 우편번호 : " + postNo + "(신주소)");}
	else
	System.out.println("입력된 우편번호 : " + postNo.substring(0,3) +"-" +  postNo.substring(3) + "(구주소)");
	
	StringBuilder star = new StringBuilder();
	for(int i=0; i < pw.length(); i++) {
		star.append("*");
	}
	
	System.out.println("입력된 비밀번호 : " + star);
	
	System.out.println("입력된 이름 : " + name);
	
	System.out.println("입력된 전화번호 : " + "010" + "-" + phone.substring(3,7) + "-" + phone.substring(7,11));
	
	
	if(passPostNo && passPw && passName && passPhone) {
		System.out.println("가입성공");
		}
	else {
		System.out.println("가입실패");
	}
	
}
}