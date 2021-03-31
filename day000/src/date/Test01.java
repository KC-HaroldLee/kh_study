package date;

import java.util.Date;

public class Test01 {
	public static void main(String[] args) {

		Date a = new Date();
		Date b = new Date(2021, 3, 26);

		System.out.println("a = " + a);
		System.out.println("b = " + b); //1970 , 1, 1기준 // Year 2038 Problem, Y2K38
	}
}
