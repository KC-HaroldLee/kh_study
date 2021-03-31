package lang;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		// 욕설필터링

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] badWords = {"십장생", "신발끈", "개나리", "식빵", "시베리아", "주옥" };

		String star = "*";

		for (int i = 0; i < badWords.length; i++) {
			if (input.contains(badWords[i])) {
				System.out.println("욕설감지");
				while (star.length() == badWords[i].length()) {
					star = star + "*";
				}
				input.replace(badWords[i], "star");
			}
		}
		System.out.println(input);
	}
}
