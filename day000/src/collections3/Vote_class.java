package collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Vote_class {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//Map<Singer, Integer> map = new HashMap<>();

		map.put("임영웅", 0);
		map.put("아이유", 0);
		map.put("장범준", 0);
		map.put("BTS", 0);
		map.put("폴킴", 0);
		
		
		
		
		/*map.put(new Singer("임영웅"), 0);
		map.put(new Singer("아이유"), 0);
		map.put(new Singer("장범준"), 0);
		map.put(new Singer("BTS"), 0);
		map.put(new Singer("폴킴"), 0);
*/
		Scanner sc = new Scanner(System.in);
		
		Set<String> ks = map.keySet();


		while (true) {
			// 투표
			System.out.println("<경연 투표>");
			
			for (String name : ks) {
				System.out.println("- " + name);
			}
			String vote = sc.nextLine().toUpperCase().trim();

			if (vote.equals("그만")) {
				break;
			}

			// 투표 가능여부 및 계산
			if (map.containsKey(vote)) {
				System.out.println(vote + "에게 투표하였습니다.");
				int count = map.get(vote);
				count++;
				map.put(vote, count);
			} else {
				System.out.println(vote + "에게 투표할 수 없습니다.");
			}
		}
		sc.close();
		// 결과
		System.out.println("<투표결과>");
		for (String name : ks)
			System.out.println(name + map.get(name) + "표 획득");

	}

}
