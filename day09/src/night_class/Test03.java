package night_class;
public class Test03 {
	public static String numbering(int init, int limit) { // 정의해두고
		int i = init;
		String output = ""; //일단 빈 곳을 만든다.
		while (i < limit) {
			output += i; //???
			i++;
		}
		return output; // 이래야 밖으로 나오나보다.
	}

	public static void main(String[] args) { 
		
		String result = numbering(1, 5);
		System.out.println(result);
	}
}
