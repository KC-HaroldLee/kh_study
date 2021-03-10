package loop2;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
		System.out.println("i " + i);	
		}
		
		int n =1; // 선언부
		while(n<=10) { //조건부(필수)
		System.out.println("n " +n);
		n++; //(증감부)
		}
	}

}
