package opp.keyword5;

public class Compute {
	//변수 필요없다.
	public static int multiple (int a, int b) {
		return a* b;
	}
	
	public static int square (int a) {
		return a * a;
	}
	
	public static double triangle (int a, int b) {
		return a * b / 2f;
	}
	
	public static double circle (int a) {
		//return a * a * 3.14f;
		return 3.14f * square(a);
				}
}
