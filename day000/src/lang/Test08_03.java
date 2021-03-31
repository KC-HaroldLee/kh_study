package lang;

public class Test08_03 {
	public static void main(String[] args) {
			
		String a = "이상";
		
		StringBuilder sb = new StringBuilder(); 
		//long start = System.currentTimeMillis();
		for(int i=0; i<100; i++) {
		// 얜 임포트 할게 없지 당연히
		sb.append("이상");
		}
		System.out.println("String Builder -> " + sb.toString()); // 여기 주목
		
	}
}
