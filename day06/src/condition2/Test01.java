package condition2;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//if 구문의 2%부족한점 
		//ex : 방향키를 입력받아 처리하는 예제(2:아래쪽, 4:왼쪽, 6:오른쪽, 8위쪽)
		//= 실행을 위한 과정이 다르다.
		//= 순차적으로 검사하기 때문에 위에 있는 구문 더 적은 검사 횟수로 실행된다.
		//= 많아지면 오래 걸리기도 하고, 아 일단 줄이면 좋잖아!
		
		//입력
		int direction = 2;		
		
		//출력
		if(direction == 2) {
			System.out.println("아래쪽으로 이동!"); //검사횟수 1번
		}
		else if(direction == 4) {
			System.out.println("왼쪽으로 이동!"); //검사횟수 2번
		}
		else if(direction == 6) {
			System.out.println("위쪽으로 이동!"); //검사횟수 3번
		}
		else{
			System.out.println("오른쪽으로 이동!"); //검사횟수 3번
		}
	}

}
