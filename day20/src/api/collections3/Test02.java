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

		System.out.println("���̵� �Է����ּ���.");
		String id = sc.nextLine();

		System.out.println("��й�ȣ�� �Է����ּ���.");
		String pw = sc.nextLine();
		sc.close();
		
		if (db.containsKey(id)) {
			System.out.println("�̹� ������� ���̵��Դϴ�");
		}
		else {
			db.put(id, pw);
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			System.out.println(db);
			
		}
	}
}
