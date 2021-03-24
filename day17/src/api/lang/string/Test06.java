package api.lang.string;

public class Test06 {
	public static void main(String[] args) {
		
		String word = "Hello World";
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
		System.out.println(word);
		
		
		System.out.println(word.substring(1,5));
		
		
		String url = "www.naver.com";
		System.out.println(url.substring(4,9));
		System.out.println(url.substring(4));
		
		
		String word2 = "      가운데 정렬        ";
		System.out.println(word2.trim());
		
	}
}
