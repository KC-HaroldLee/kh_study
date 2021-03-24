package api.lang.integer;

public class Test04 {
	public static void main(String[] args) {
		
		char [] a = new char[] {'a', 'd', 'm' , 'i' , 'n'};
		String id = new String(a);
		char [] b = new char[] {'t', 'e', 's' , 't' , '1' ,'2' ,'3', '4'};
		String pw = new String(b);
		
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
		
		
		
		String id2 = new String ("admin");
		String pw2 = new String ("test1234");
		
		System.out.println("id2 = " + id2);
		System.out.println("pw2 = " + pw2);
		
	}
}
;