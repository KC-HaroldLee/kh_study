package summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class summary {
	public static void main(String[] args) {
		//로또먼저
		List<Integer> lotto = new ArrayList<>(); //Collection은 원시형 데이터를 저장할 수 없다.
		
		//추가
		Random r = new Random();
		
		/*
		//복원추출 sampling with replacement
		for(int i=0; i<6; i++) {
			int number = r.nextInt(45)+1;
			lotto.add(number);
		}
		*/
		
		/*
		//중복값을 처리해야한다.
		//1번 방법 > i를 ++ -- 를 활용하여 상쇄시킨다. 
		for(int i=0; i<6; i++) {
			int number = r.nextInt(45)+1;
			if(!lotto.contains(number)) {
				lotto.add(number);
			}
			else {
			i--;
			}
		}
		*/
		
		//2번 방법 >
		while(lotto.size() <6) {
			int number = r.nextInt(45) +1;
			if(!lotto.contains(number)) {
				lotto.add(number);
			}
		}
		
		//
		//출력
		System.out.println(lotto);
	}
}
