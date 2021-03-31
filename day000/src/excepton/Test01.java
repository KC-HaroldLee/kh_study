package excepton;

public class Test01 {
	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}
}
