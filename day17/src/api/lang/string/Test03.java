package api.lang.string;

public class Test03 {
	public static void main(String[] args) {
		
	
	String url = "https://www.naver.com";
	
	//글자수는 얼마입니까?
	System.out.println(url.length());
	
	
	//http로 시작합니까?
	System.out.println(url.startsWith("http"));
	
	//.com으로 끝납니까?
	System.out.println(url.endsWith(".com"));
	
	//naver글씨가있는지
	System.out.println(url.contains("naver"));
	
	
	//naver글씨가 어디?
	System.out.println(url.indexOf("naver"));
	
	//6번째 글씨가 뭔가요?
	System.out.println(url.charAt(11));
	
	
	
	}
}
