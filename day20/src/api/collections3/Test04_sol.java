
package api.collections3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test04_sol {
	public static void main(String[] args) {
		// 투표 프로그램
		// 음악 경연 프로그램에
		// 다음과 같은 것들이 출연했다고 가정합시다.
		// 임영웅, 아이유, 장범준, BTS, 폴킴 (을 등록하고)
		// 사용자에게 투표하고 싶은 가수 이름을 입력받도록 구현

		Map<String, Integer> singer = new HashMap<>();
		//Map<Integer, String> number = new HashMap<>();
		
		singer.put("임영웅", null); //일부러 에러뜨게 한 부분
		singer.put("아이유", 0);
		singer.put("장범준", 0);
		singer.put("BTS", 0);
		singer.put("폴킴", 0); // autoBoxing
		
		/*
		number.put(1, "임영웅");
		number.put(2, "아이유");
		number.put(3, "장범준");
		number.put(4, "BTS");
		number.put(5, "폴킴");
		*/

		Scanner sc = new Scanner(System.in);

		boolean end = false;
		while (!end) {
			// 1차 출력
			Set<String> set = singer.keySet();
			Iterator<String> iter = set.iterator();
			System.out.println("<투표해주세요>");
			while (iter.hasNext()) {
				System.out.println(" - " + iter.next());
			}
			String vote = sc.nextLine(); // 트림을 쓰면 좋다. 그리고 좋다고 생각하는 것 upeerCase같은거
			vote.trim().toUpperCase();
			
			if (singer.containsKey(vote)) {
				singer.put(vote, singer.get(vote) + 1);
				System.out.println(vote + "에게 투표했습니다.");
			} 
			
			else if (vote.equals("그만")) {
				System.out.println("<투표를 종료합니다>");
				end = true;
			} 
			
			else {
				System.out.println(vote + "라는 가수는 없습니다.");
			}

		}
		sc.close();
		
		Set<String> result = singer.keySet();//
		for (String name : result) {
			System.out.println(name + " : " + singer.get(name) + "표");
		}
		
	
		

	}

}