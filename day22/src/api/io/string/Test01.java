package api.io.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 문자열을 깨지지 않도록 파일에 저장(출력)
		// 문자열은 분해되서는 안된다.
		// 문자열은 byte와 호환이 된다.

		String text = "hello 자바";

		System.out.println(System.getProperty("sun.jnu.encoding")); // 기본 글꼴 보기

		// text를 byte로 바꿔본다. ----> byte[] 또는 List<Byte>
		byte[] a = text.getBytes();// 자바의 설정에 맞게 byte로 분해(UTF-8)
		System.out.println(Arrays.toString(a));

		byte[] b = text.getBytes("MS949");// 명시적으로 설정도 가능 (throw함)
		System.out.println(Arrays.toString(b));

		// byte를 String으로 변환
		String t1 = new String(a);
		System.out.println("t1 =" + t1);
		String t2 = new String(b, "MS949");
		System.out.println("t2 =" + t2);
	}
}
