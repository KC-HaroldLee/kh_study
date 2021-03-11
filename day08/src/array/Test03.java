package array;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
	//배열을 종류별로 생성해보자!
	//10, 20, 30, 40, 50을 저장하기 위한 배열 생성
		
	int [] a = new int[5]; // 이게 보기에도 편하네
	// int b []=new int [5] 도 되긴하다. C언어에서 넘어 온 것
	// a ------> [?][?][?][?][?]

	// new를 이요하면 초기값이 설정된다. 정수는 "0"
	System.out.println(a); //리모컨을 찍은 것일뿐! 뜨는건 일련번호
	
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	//a[5] = 50; 오류가 뜬다. ㅋㅋㅋ 귀신집
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	}
}
