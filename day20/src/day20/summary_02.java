package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class summary_02 {
	public static void main(String[] args) {

		// 1. 비복원추출
		List<Integer> lotto = new ArrayList<>();
		for (int i = 1; i <= 45; i++) {
			lotto.add(i);
		}

		// 2. List의 데이터를 무작위로 섞는다.
		Collections.shuffle(lotto);
		System.out.println(lotto);
		
		// 3. 0번위치 부터 6개를 추첨한다.
		for(int i=0; i<6; i++) {
			System.out.println("번호 " + lotto.get(i));
		}
	}
}
