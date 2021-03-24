package api.lang.string;

public class Test07_Star {
//별생성기
	public static String generate(int size) {
		String star ="";
		for(int i = 0; i<size; i++){
			star +="*";
		}
		return star;
	}
}
