package lang;

public class Test03 {
	public static void main(String[] args) {
//쿵쿵따
		String given = "컴퓨터";
		String input = "터미널";
		//String input = "타이어";
		//String input = "터미네이터"; 
		
		boolean pass1 = input.length() == 3;
		boolean pass2 = given.charAt(given.length()-1) == input.charAt(0);
				
		if(pass1 && pass2) {
			System.out.println("쿵쿵따");
		}
		else {
			System.out.println("게임오버");
		}
		
	}
}
