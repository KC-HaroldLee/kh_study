package api.collections2;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		//집합연산
		//=서로 다른 두 집합간의 연산 ex : 합집합, 교집합, 차집합
		
		Set<Integer> a = new TreeSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Set<Integer> b = new TreeSet<>();
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		
		//합집합 : 새로운 set을 만들어서 a와 b를 추가.
		Set<Integer> c = new TreeSet<>();
		c.addAll(a); //c에 a를 모두 추가
		c.addAll(b); //c에 b를 모두 추가
		//System.out.println(c);
		
		//교집합 : 새로운 set을 만들어서 
		Set<Integer> d = new TreeSet<>();
		d.addAll(a);
		d.retainAll(b); //d에 b를 교집합 연산
		//System.out.println(d);
		
		//차집합 : 새로운 set을...
		Set<Integer> e = new TreeSet<>(a); // 이렇게 해도 된다. e.addAll(a)가 생략된다.
		e.removeAll(b);
		System.out.println(e);
		
		
	}
	
}
