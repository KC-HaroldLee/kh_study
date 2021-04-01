package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_test {
	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		//입력한다.
		list1.add("아이유"); list1.add("유재석"); list1.add("김힘찬");
		
		//추출한다.
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		//확인한다.
		System.out.println(list1.contains("아이유")); // true
		System.out.println(list1.contains("너바나")); // false
		
		//인덱스를 뽑는다.
		System.out.println(list1.indexOf("유재석")); // 1
		
		//지운다.
		list1.remove(0);
		list1.remove("이석현");//같음 없어도 에러 안뜸. 찾진 않아.
	}
}
