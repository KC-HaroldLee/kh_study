package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto_random {
	public static void main(String[] args) {

		List<Integer> balls = new ArrayList<>();
		for (int i = 1; i <= 45; i++) {
			balls.add(i);
		}

		Collections.shuffle(balls);

		for (int i = 0; i < 6; i++) {
			System.out.println(balls.get(i));
		}

	}
}
