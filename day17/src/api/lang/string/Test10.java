package api.lang.string;

public class Test10 {
	public static void main(String[] args) {
		//문자열을 이용하여 형식 검사하려면?
		//ex회원아이디 입력
		//5~50글자
		//영문 소문자, 숫자와 특수문자중에서 -_만 사용가능
		
		String id = "kklastchnpd";
		
		boolean pass1 = id.length()>= 5 && id.length()<20;
		
		
	}
}
