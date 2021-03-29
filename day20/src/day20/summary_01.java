package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class summary_01 {
	public static void main(String[] args) {
		
	
	//1. 비복원추출
	
	List<Integer>lotto = new ArrayList<>();
	
	for(int i = 1; i<=45; i++) {
		lotto.add(i);
	}
	
	//2. 정하고 해당위치 삭제
	
	Random r = new Random();
	int index = r.nextInt(lotto.size())+0;
	int number = lotto.get(index);
	System.out.println("number " + number);
	lotto.remove(index);
	}
}
