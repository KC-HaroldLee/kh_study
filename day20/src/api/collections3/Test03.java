package api.collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {

		// 저장소의 모든 key, value를 출력.
		// map은 자체적으로 전체 출력하는 방법이 없다.
		Map<String, Integer> map = new HashMap<>();
		map.put("서인환", 100);
		map.put("이석현", 90);
		map.put("김성하", 70);
		map.put("최성민", 60);
		map.put("이해문", 65);
		
		//1.key만 set으로 추출하여 출력하는 방법.
		//2.EntrySet을 이용하는 방법.
		
		//1.Map에서 -> Set<String> -> Iterator<String> 또는 확장 for
		Set<String> set = map.keySet();
		for(String name : set) {
			System.out.println("이름 = " + name);
			System.out.println("점수 = " + map.get(name));
		}
		
		//2.EntrySet을 이용하는 방법.
		Set<	Entry<String, Integer>	> entrys = map.entrySet(); //이러면 Entry들이 생성된다 이들은 위치만 기억하고 있다.
		for (Entry<String, Integer> entry : entrys) {
			System.out.println("이름 = " + entry.getKey());
			System.out.println("점수 = " + entry.getValue());
		}
		
	}
}
