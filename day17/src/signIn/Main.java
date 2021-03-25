package signIn;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("우편번호를 입력해주세요 (\"-\"은 생략)");
		String postNo = sc.next();
		String regexPostNo = "^[0-9]{5,6}$";
		boolean passPostNo = (Pattern.matches(regexPostNo, postNo));
		System.out.println(passPostNo);

		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		String regexPw = "^[a-zA-Z0-9!@#$]{8,16}$";
		boolean passPw = (Pattern.matches(regexPw, pw));
		System.out.println(passPw);

		System.out.println("이름 입력해주세요");
		String name = sc.next();
		String regexName = "^[가-힣]{2,24}$";
		boolean passName = (Pattern.matches(regexName, name));
		System.out.println(passName);

		System.out.println("전화번호를 입력해주세요 (\\\"-\\\"은 생략)");
		String phone = sc.next();
		String regexPhone = "^[0][1][0][0-9]{8}$";
		boolean passPhone = (Pattern.matches(regexPhone, phone));
		System.out.println(passPhone);

		System.out.println("생년월일을 입력해주세요. (YYYY-MM-DDg형식)");
		String birth = sc.next();
		String regexBirth = "^(19[0-9][0-9]|20\\d{2})(0[0-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$"; // whackur.tistory.com/148
		boolean passBirth = (Pattern.matches(regexBirth, birth));
		System.out.println(passBirth);

		sc.close();

		// 계산 (비번 숨기기)

		StringBuilder star = new StringBuilder();
		for (int i = 0; i < pw.length(); i++) {
			star.append("*");
		}

		// 출력
		if (postNo.length() == 5) {
			System.out.println("입력된 우편번호 : " + postNo + "(신주소)");
		} else
			System.out.println("입력된 우편번호 : " + postNo.substring(0, 3) + "-" + postNo.substring(3) + "(구주소)");

		System.out.println("입력된 비밀번호 : " + star);

		System.out.println("입력된 이름 : " + name);

		System.out.println("입력된 전화번호 : " + "010" + "-" + phone.substring(3, 7) + "-" + phone.substring(7, 11));

		System.out.println("입력된 생년월일 : " + birth.substring(0,4) + "-" + birth.substring(4, 6) + "-" + birth.substring(6, 8));

		if (passPostNo && passPw && passName && passPhone) {
			System.out.println("가입 성공");
		} else {
			System.out.println("가입 실패");
		}

	}
}