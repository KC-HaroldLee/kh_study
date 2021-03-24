package api.lang.String;
//import java.lang.String;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		String id = new String();
		String pw = new String();

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력해주세요");
		id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		pw = sc.next();

		if (id.equals("admin") && pw.equals("test1234")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
