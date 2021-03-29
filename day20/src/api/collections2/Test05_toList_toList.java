package api.collections2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test05_toList_toList {
public static void main(String[] args) {
		
		//아이폰과 갤럭시 휴대폰 색상은
		//아이폰 - "블랙", "그린", "옐로우", "퍼플", "레드", "화이트"
		//갤럭시 - "블랙", "화이트", "팬텀 그레이", "팬텀 핑크"
		
		Set<String> i = new HashSet<>();
		i.add("블랙");
		i.add("그린");
		i.add("옐로우");
		i.add("퍼플");
		i.add("레드");
		i.add("화이트");		
		
		Set<String> g = new HashSet<>();
		g.add("블랙");
		g.add("화이트");
		g.add("팬텀그레이");
		g.add("팬텀핑크");
		
		//1.아이폰과 갤럭시 휴대폰이 공통적으로 가지고 있는 색상.
		Set<String> a = new HashSet<>(i);
		a.retainAll(g);
		System.out.println("<공통 색상>");
		for(String color : a) {
		System.out.println(color);
		}
		
		//2.아이폰만 가지고 있는 색상
		Set<String> b = new HashSet<>(i);
		b.removeAll(g);		
		System.out.println("<아이폰 고유 색상>");
		for(String color : b) {
		System.out.println(color);
		}
		
		//3.갤럭시만 가지고 있는 색상
		Set<String> c = new HashSet<>(g);
		c.removeAll(i);
		System.out.println("<갤럭시만 고유 색상>");
		for(String color : c) {
			System.out.println(color);
		}
		
		//4.모든 색상
		Set<String> d = new HashSet<>(g);
		d.addAll(i);
		System.out.println("<모든 색상>");
		for(String color : d) {
			System.out.println(color);
		}
	}
	
}

