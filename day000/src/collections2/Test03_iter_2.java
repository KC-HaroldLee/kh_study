package collections2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test03_iter_2 {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	
	map.put("피카츄", 80);
	map.put("라이츄", 77);
	map.put("파이리", 77);
	map.put("꼬부기", 95);
	
	/*Set<String> set = map.keySet();
	for(String name : set) {
		System.out.println(name);
		System.out.println(map.get(name));
	}*/
	
	
	Set<Entry<String, Integer>> entrys = map.entrySet();
	for(Entry<String, Integer> entry : entrys){
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}
