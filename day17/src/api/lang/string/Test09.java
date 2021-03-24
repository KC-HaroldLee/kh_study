package api.lang.string;

public class Test09 {
	public static void main(String[] args) {
		// 문자열의 단점과 보완방법 탐색
		// 단점 : 불변이라는 것
		// 문자열은 char의 배열이기 때문에 크기를 바꿀 수가 없다.
		// 색인은 빠르지만 문자열 합성이 매우 느리다.

		// for (int i = 0; i<2; i++) {

		String text = "";
		
		long start = System.currentTimeMillis();

		for(int i = 0; i<1000; i++) {
		text += "Hello\n";
		}
		long finish = System.currentTimeMillis();
		System.out.println(text);

		System.out.println("소요시간 "  +  (finish-start) + "ms");
	}

}
