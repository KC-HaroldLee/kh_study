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
		//if�� �Ѵ�!
		
		for(int i=0; i<6; i++) {
			no=r.nextInt(45)+1;
			if(lotto.contains(no)) {
				i--;
			}
			else{
			lotto.add(no);
			// �� �ٵ� �ñ��� ����
			//System.out.println(lotto); // ���� �� ã��.
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
