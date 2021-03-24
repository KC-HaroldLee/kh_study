package api.lang.string;
import java.util.Scanner;
public class Test07_sol {
	public static void main(String[] args) {
		//욕필터링
		Scanner sc = new Scanner(System.in);
		System.out.println("채팅 : ");
		String input = sc.nextLine();
		//String input = "안녕 십장생아";
		
		String [] badWords = {"십장생", "신발끈", "개나리", "식빵", "시베리아", "주옥"};

		for(int i=0; i<badWords.length; i++) {
			int length =badWords[i].length();
			input = input.replace(badWords[i], Test07_Star.generate(length));
			}
		System.out.println(input);
		}	
	
	
}