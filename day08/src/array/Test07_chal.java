package array;
import java.lang.*;

public class Test07_chal {
	public static void main(String[] args) {

		
		//옛날 배열
		String[] listOld = {"철수", "영희", "영수"};

		for (int i = 0; i < listOld.length; i++) {
			System.out.println(listOld[i]);
		}
		
		
		System.out.println("-------------");
		//새 배열
		String[] listNew = new String[5];
		
		
		
		
		//배열 복사?
		for (int i = 0; i < listOld.length; i++) {
			listNew[i]=listOld[i];
		}
		
		
		//새 배열 나머지 공간에 추가
		listNew[3] = "Tom";
		listNew[4] = "Harold";
		
		
		for (int i = 0; i < listNew.length; i++) {
			System.out.println(listNew[i]);
		}

	}
}
