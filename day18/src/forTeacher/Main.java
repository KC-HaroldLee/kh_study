package forTeacher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			Teacher tt = new Teacher();
			
			System.out.println("이름을 입력해주세요 : ");
			tt.setName(sc.next());
			
			System.out.println("과목 개수를 입력해주세요.");
			tt.setSubjNo(sc.nextInt());
			
			System.out.println("과목이름을 등록합니다.");
			tt.inputSubjList();
			
		}
	}
}
