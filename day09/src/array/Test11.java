package array;
import java.lang.*;
public class Test11 {
	public static void main(String[] args) {
		
		int [] data = new int [] {30, 50, 20, 10, 40};
		
		int c; // 중개인 등장
		
		c = data[1]; // c는 50
		data[1] = data[3]; // data[1]은 10
		data[3] = c; //data[3]은 50
		
		//출력
		for(int i=0; i<5; i++) {
		System.out.println(data[i]);
		}

	}

}
