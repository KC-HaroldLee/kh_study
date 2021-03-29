package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class summary_03 {
	public static void main(String[] args) {

		// 1. 비복원추출
		List<Integer> lotto = new ArrayList<>();
		for (int i = 1; i <= 45; i++) {
			lotto.add(i);
		}

		// 2. List의 데이터를 무작위로 섞는다.
		Collections.shuffle(lotto);
		System.out.println(lotto);

		// 2-1. 0번위치부터 6개를 뽑아 분할하여 리스트로 만든다.
		List<Integer> current = lotto.subList(0, 6);

		// 3. 정렬
		Collections.sort(current);
		System.out.println(current);
	}
}
