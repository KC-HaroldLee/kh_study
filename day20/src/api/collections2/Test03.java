package api.collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
	//Q. set의 출력은 어떻게 하는가?
	//Iterator를 사용하는 방법
	//확장 for를 사용하는 방법
	Set<String> set = new HashSet<>();
	
	set.add("자바");
	set.add("파이썬");
	set.add("C++");
	set.add("안드로이드");
	set.add("iOs");
	
	//Iterator
	Iterator<String> iter = set.iterator();
	while(iter.hasNext()){
		String item = iter.next();
	System.out.println(item);
	
	}
	
	//확장 for문
	for(String item : set) {
		System.out.println();
	}
	
	
	//System.out.println(set);
	
	//set은 하나만 뽑을 수 없다.
	
	
		
}
}
