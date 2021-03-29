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
		
		List<String> i = new ArrayList<>();
		i.add("블랙");
		i.add("그린");
		i.add("옐로우");
		i.add("퍼플");
		i.add("레드");
		i.add("화이트");		
		
		List<String> g = new ArrayList<>();
		g.add("블랙");
		g.add("화이트");
		g.add("팬텀그레이");
		g.add("팬텀핑크");
		
		//1.아이폰과 갤럭시 휴대폰이 공통적으로 가지고 있는 색상.
		List<String> a = new ArrayList<>();
		a.addAll(i);
		a.retainAll(g);
		System.out.println("공통색상 : " + a);
		
		
		//2.아이폰만 가지고 있는 색상
		List<String> b = new ArrayList<>(i);
		//b.addAll(i);
		b.removeAll(g);
		System.out.println("아이폰만 가지고 있는 색상 : " + b);
		
		//3.갤럭시만 가지고 있는 색상
		List<String> c = new ArrayList<>();
		c.addAll(g);
		c.removeAll(i);
		System.out.println("갤럭시만 가지고 있는 색상 : " + c);
		
		//4.모든 색상
		List<String> d = new ArrayList<>();
		d.addAll(g);
		d.addAll(i);
		System.out.println("모든 색상 : " + d); 
	}
	
}
