package array;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
	//10일 동안, 첫날은 10개 둘째날부터 전날 보다 3개씩 늘려서 푸쉬업을 할때
	//매일매일 하게 되는 푸쉬업 개수를 배열에 저장한 뒤 한 번에 출력해보세요.
	
	int days = 30;
	
	int pushup = 10;
	int [] count = new int[days];
	
	for(int i=0; i<days; i++){
		count[i] = pushup;
		pushup +=3;
	}
	for(int i=0; i<days; i++) {
		System.out.println(i+1 + "번째날엔 " + count[i] + "개");
	}
		
	}
}
