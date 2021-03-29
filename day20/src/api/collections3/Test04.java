package api.collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		// 투표 프로그램
		// 음악 경연 프로그램에
		// 다음과 같은 것들이 출연했다고 가정합시다.
		// 임영웅, 아이유, 장범준, BTS, 폴킴 (을 등록하고)
		// 사용자에게 투표하고 싶은 가수 이름을 입력받도록 구현

		Map<String, Integer> singer = new HashMap<>();
		singer.put("임영웅", 0);
		singer.put("아이유", 0);
		singer.put("장범준", 0);
		singer.put("BTS", 0);
		singer.put("폴킴", 0);

		Scanner sc = new Scanner(System.in);
		
		boolean end = false;
		while(!end){
		System.out.println("임영웅, 아이유, 장범준, BTS, 폴킴 중에 투표하고 싶은 가수 이름을 적어주세요... \"그만\"을 입력하면 끝납니다.");
		String vote = sc.nextLine();
			if(singer.containsKey(vote)) {
				singer.put(vote, singer.get(vote)+1);
				System.out.println(vote + "에게 투표했습니다. 현재 " + singer.get(vote) + "표입니다." );
			}
			else if(vote.equals("그만")) {
				System.out.println("투표를 종료합니다");
				end = true;
			}
			else {
			System.out.println(vote + "라는 가수는 없습니다.");
			}
			
		}
		
		Set<String> result = singer.keySet();
		for(String name : result) {
			System.out.println(name + " : " + singer.get(name) + "표");
		}
		
		
	}

}