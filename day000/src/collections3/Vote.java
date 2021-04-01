package collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Vote {
	public static void main(String[] args) {
	//	Map<String, Integer> map = new HashMap<>();
		
		Map<Singer, Integer> map = new HashMap<>(); //****

		/*map.put("임영웅", 0);
		map.put("아이유", 0);
		map.put("장범준", 0);
		map.put("BTS", 0);
		map.put("폴킴", 0);*/
		
		
		
		
		map.put(new Singer("임영웅"), 0);
		map.put(new Singer("아이유"), 0);
		map.put(new Singer("장범준"), 0);
		map.put(new Singer("BTS"), 0);
		map.put(new Singer("폴킴"), 0);

		Scanner sc = new Scanner(System.in);
		
		

		while (true) {
			// 투표
			System.out.println("<경연 투표>");
			Set<Singer> ks = map.keySet();
			for (Singer singer : ks) {  //****
				System.out.println("- " + singer.getName()); //****
			}
			String vote = sc.nextLine().toUpperCase().trim();

			if (vote.equals("그만")) {
				break;
			}

			// 투표 가능여부 및 계산
			Singer find = new Singer(vote); //****
			if (map.containsKey(find)) { //****
				System.out.println(vote + "에게 투표하였습니다.");
				int count = map.get(vote);
				//count++; 아래에 합침
				map.put(find, count+1);
			} else {
				System.out.println(vote + "에게 투표할 수 없습니다.");
			}
		}
		sc.close();
		// 결과
		System.out.println("투표가 완료되었습니다");
		System.out.println("<투표 결과>");
		for(Entry<Singer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey().getName() + " : " + entry.getValue() + "표");
		}

	}

}
