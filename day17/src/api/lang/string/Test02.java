package api.lang.string;

public class Test02 {
	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		
		String c = new String("hello");
		String d = new String("hello");
				
		System.out.println(a == b);//a와 b는 동일
		System.out.println(b == c);//b와 c는 동일하지 않음
		System.out.println(c == d);//c와 d는 동일하지 않음
		System.out.println(a == d);//a와 d는 동일하지 않음
	}
}
