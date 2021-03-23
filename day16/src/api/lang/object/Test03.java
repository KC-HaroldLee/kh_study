package api.lang.object;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	//업캐스팅으로 Object로 참조변수로 만들 수 있나?
	//=저장할 대상이 불확실할때 Object 형태로 관리할 수 있다.
	//=아무거나에 해당하는 역할을 수행가능
	
	Object a = 10;
	Object b = "hello";
	Object sc = new Scanner(System.in);
	Object d = 3.14;
	Object e = true;
	
	System.out.println(a.getClass());
	System.out.println(b.getClass());
	System.out.println(sc.getClass());
	System.out.println(d.getClass());
	System.out.println(e.getClass());
}
}
