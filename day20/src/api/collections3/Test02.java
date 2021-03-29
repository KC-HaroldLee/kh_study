package api.collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Map<String, String> db = new HashMap<>();

		db.put("master", "master1234");
		db.put("teseter", "tester1234");
		db.put("user", "user1234");
		db.put("student", "student1234");
		db.put("manager", "manager1234");

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력해주세요.");
		String pw = sc.nextLine();
		sc.close();
		
		if (db.containsKey(id)) {
			System.out.println("이미 사용중인 아이디입니다");
		}
		else {
			db.put(id, pw);
			System.out.println("회원가입이 완료되었습니다.");
			System.out.println(db);
			
		}
	}
}
