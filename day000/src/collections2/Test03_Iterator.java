package collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03_Iterator {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("자바");
		set.add("파이썬");
		set.add("C++");
		set.add("안드로이드");
		set.add("iOS");

		System.out.println(set);

		//이터레이터를 활용해서
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
	
		//혹은 확장for
		for(String item : set) {
			System.out.println(item);
		}
	}
}
