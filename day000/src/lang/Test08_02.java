package lang;

public class Test08_02 {
	public static void main(String[] args) {
			
		String a = "이상";
		
		StringBuffer sbf = new StringBuffer(); 
		//long start = System.currentTimeMillis();
		for(int i=0; i<100; i++) {
		// 얜 임포트 할게 없지 당연히
			sbf.append("이상");
		}
		System.out.println("String Buffer -> " + sbf.toString()); // 여기 주목
		
	}
}
