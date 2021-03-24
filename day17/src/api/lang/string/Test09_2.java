package api.lang.string;

public class Test09_2 {
	public static void main(String[] args) {
		// 문자열 합성이 느리기 때문에 이를 처리 할 수 있도록
		// 도와주는 클래스
		// StringBuffer, StringBuilder 둥중에 하나를 상황에 맞게 이용한다.
		
		StringBuffer buffer = new StringBuffer();


		String text = "";
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<100; i++) {
			buffer.append("hello\n");
		}
		
		long finish = System.currentTimeMillis();
		
		System.out.println(buffer.toString());

		System.out.println("소요시간 "  +  (finish-start) + "ms");
	}

}
