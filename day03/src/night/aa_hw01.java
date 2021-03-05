package night;
	import java.lang.*;
public class aa_hw01 {
	public static void main (String [] args) {
		System.out.printf("%d\n", 123); //결과 값 : 123
		System.out.printf("5%d\n", 123); //결과 값 : 5123
		System.out.printf("05%d\n", 123); //결과 값 : 05123
		
		System.out.printf("%f\n", 123.45); // 123.450000
		System.out.printf("7.1%f\n", 123.45);// 7.1123450000
		System.out.printf("77.3%f\n", 123.45);// 77.3123450000
		
		System.out.printf("%s\n", "Hello Java!");
		System.out.printf("%10s\n", "Hello Java!");
	}

}
