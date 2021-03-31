package lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class random {
	public static void main(String[] args) {
		String [] easy = {"운동", "식용유", "악기", "롯데월드", "부먹",
				"잘생기다", "요리", "세종대왕", "동물", "인싸", "혈액형",
				"요리왕", "청소", "중학생", "계절", "편안하다",
				"거칠다", "취미", "목표", "자녀계획", "수다쟁이", 
				"버릇", "교회", "마피아", "코로나", "샐카", "민트초코" , 
				"외국어" , "여행", "야식", "색깔", "대중교통", "성탄절",
				"영화", };
		System.out.println(easy.length);
		List <String> card = new ArrayList<>();
		
		for(int i = 0; i <easy.length; i++) {
			card.add(easy[i]);
		}
		
		Collections.shuffle(card);
		
		List<String>choose = card.subList(0, 3);
		System.out.println(choose);
	}
}
