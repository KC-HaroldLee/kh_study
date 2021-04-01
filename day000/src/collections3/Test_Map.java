package collections3;

import java.util.HashMap;
import java.util.Map;

public class Test_Map {
public static void main(String[] args) {
	Map<String, Integer> info = new HashMap<>();
	info.put("서인환", 100);
	info.put("이석현", 95);
	info.put("황석용", 70);
	

	
	System.out.println(info.containsKey("서인환"));
	System.out.println(info.containsKey("김수완"));
	
	int score = info.get("서인환");
	System.out.println(score);
	
	Integer Score = info.get("이석현");
	System.out.println(Score);
	
	System.out.println(info.containsValue(70));
	
	info.remove("서인환");
	info.remove("이석현", 70); //하나 마나임
	info.remove("이석현", 95);
	info.remove(70); // 무반응
	
	
	
	System.out.println(info);
}
}
