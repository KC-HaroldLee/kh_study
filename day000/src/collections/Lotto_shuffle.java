package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto_shuffle {
	public static void main(String[] args) {

		List<Integer> win = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; win.size()<6; i++) {
			int ball = r.nextInt(45)+1;
			if(!win.contains(ball)) {
			win.add(ball);}	
		}
		
		System.out.println(win);

	}
}
