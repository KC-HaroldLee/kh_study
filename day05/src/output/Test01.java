package output;
	import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//System.out을 이용한 출력방법과 주의사항
		//System.out.print --> 그냥 출력
		//System.out.println --> 출력 후 줄 바꿈(개행)
		
		System.out.print("안");
		System.out.print("녕");
		
		//주의사항 문자열 특성상 특구문자(Escape squence)가 존재한다.
		
		//안댕
		//System.out.println("나는 지금 "피자"가 먹고싶어요"); //
		
		System.out.println("나는 지금 \"피자\"가 먹고싶어요"); // 이렇게 한다.
		// \표시는 뒤에 있는 글자가 특수한 글자임을 나타된다.
		// /n /t정도는 기억하면 좋다.
		
		System.out.println("배/t고/t파"); //탭
		System.out.println("배/n고/n파");	//개행
		
		System.out.println("// // // //");
	}
}
