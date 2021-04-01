package collections2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
public static void main(String[] args) {
	
	List<Student> list1 = new ArrayList<>();
	
	//list1.add("이석현", 80, "01033592409");
	
	/*Student a = new Student("이석현", 90, "0105656565");
	list1.add(a);
	
	Student b = new Student("서인환", 100, "0105656565");
	list1.add(b);	*/
	
	list1.add(new Student("이석현", 90, "0105656565"));
	list1.add(new Student("서인환", 100, "0105656565"));
	
	System.out.println(list1); // [참조주소]
	System.out.println(list1.get(0)); // 참조주소
	System.out.println(list1.get(0).getName()); // "이석현"
	
	Student z = list1.get(1);
	System.out.println(z.getName()); //"서인환"
}
}
