package api.collections3;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map <K, V>
		//Set(K)에 값(v) 붙은 형태
		//세트 데이터 장소
		
		//ex : 학생명과 점수를 저장하기 위한 Map 생성
		//K = key. 식별자, 유일해야하는 항목(중복 불가)
		//V = value. 데이터. 중복이 허용되는 항목.
		
		Map<String, Integer> map = new HashMap<>();
		
		//추가 : .add()가 아니라 .put() - set데이터를 추가하는 것은 put
		map.put("서인환",100);
		map.put("이석현",90);
		map.put("김성하",70);
		map.put("최성민",60);
		map.put("이해문",65);
		
		//검색 , 항목이 2개이다...
		//-containsKey();
		//-containsKValue();
		System.out.println(map.containsKey("김성하")); //key에 김성하가 있습니까?
		System.out.println(map.containsValue(65)); //
		
		//추출 : key를 이용해서 value를 추출하는 것만 가능하며 반대는 불가능.
		//그래서 key인가?

		System.out.println(map.get("김성하"));
		System.out.println(map.get("임다정")); //null, 에러는 안나지만 이걸 int값에 넣으려면 에러
		//그러니까
		//int a = map.get("임다정"); // 에러
		Integer score = map.get("임다정");
		
		//삭제
		map.remove("최성민");
		map.remove("최성민, 60");
		
		System.out.println(map);
	}
}
