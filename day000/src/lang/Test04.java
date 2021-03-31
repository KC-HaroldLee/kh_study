package lang;

public class Test04 {
	public static void main(String[] args) {
		String id = "kk4ever";
		
		boolean pass1 = id.contains("운영자");
		boolean pass2 = id.length() > 5 && id.length() <= 20;
		boolean pass3 = !(id.charAt(0)>= '0' && id.charAt(0)>= '9');

		//boolean pass3 = id.charAt(0) = '0';
		//System.out.println(id.charAt(0));
	}
}
