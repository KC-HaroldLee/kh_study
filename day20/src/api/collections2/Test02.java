package api.collections2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		Random r = new Random();
		
		int no;
		//if로 한다!
		
		for(int i=0; i<6; i++) {
			no=r.nextInt(45)+1;
			if(lotto.contains(no)) {
				i--;
			}
			else{
			lotto.add(no);
			// 어 근데 궁금함 ㅋㅋ
			//System.out.println(lotto); // 별거 못 찾음.
		}
		}
		
		/*
		while (lotto.size() < 6) {
			no = r.nextInt(45) + 1;
			if (!lotto.contains(no)) {
				lotto.add(no);
			}
		}*/
		System.out.println(lotto);
	}
}
