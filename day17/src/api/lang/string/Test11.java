package api.lang.string;

import java.util.regex.Pattern;

public class Test11 {
	public static void main(String[] args) {
		//정규표현식(Regular Expression, 중여서
		String id = "kklastchnpd";
		String regext = "^[a-z0-9]{5,20}$";
		System.out.println(Pattern.matches(regext, id));
	}
}
