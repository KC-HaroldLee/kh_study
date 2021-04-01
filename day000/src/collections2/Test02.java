package collections2;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("master", "master1234"));
		list.add(new Member("tester", "tester1234"));
		list.add(new Member("user", "user1234"));
		
		String inputId = "master";
		String inputpw = "master1234";
		
		Member input = new Member(inputId, inputpw);
		
		if(list.contains(input)) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
		
		
		
	}
}
