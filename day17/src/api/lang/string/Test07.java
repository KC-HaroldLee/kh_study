package api.lang.string;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		//욕필터링
		Scanner sc = new Scanner(System.in);
		System.out.println("채팅 : ");
		String input = sc.nextLine();
		//String input = "안녕 십장생아";
		
		String [] badWords = {"십장생", "신발끈", "개나리", "식빵", "시베리아", "주옥"};
		
		int idx = 0;
		for(int i=0; i<badWords.length; i++) {
			if(input.contains(badWords[i])){
				idx=i;
			}		
		}

		int count = badWords[idx].length();
		
		String mosaic="*";
		for(int i=1; i<count; i++){
			mosaic = (mosaic + "*");
		}
		System.out.println(input.replace(badWords[idx], mosaic));
	
}
}
