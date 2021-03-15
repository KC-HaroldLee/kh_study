package night_class;
public class Test02 {
	public static void numbering(int limit) { // 정의해두고
		int i = 0;
		while (i < limit) {
			System.out.print(i);
			i++;
		}
	}

	public static void main(String[] args) { //호출한다.
		numbering(5);
		numbering(4);
		numbering(6);
		numbering(9);
		numbering(1);
		numbering(5);
		
	}
}
