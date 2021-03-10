package loop_change;

import java.lang.*;

public class Test06 {
	public static void main(String[] args) {

		/*
		int count=0;
		for (int i = 1; i <= 100; i += 1) {
			if ( i%10==5 || i/10==5) {
				System.out.println("i = " + i);
				count+=1;
			}
		}
		*/
		
		int count=0;
		int i = 1;
		while (i <= 100) {
			i += 1; 
			if (i%10==5 || i/10==5) {
				System.out.println("i = " + i);
				count+=1;
			}
		}
		System.out.println("모두" + count + "개");
	}
}
