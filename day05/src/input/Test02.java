package input;
import java.lang.*;
import java.util.Scanner; // 이젠 쪼끔 익숙해졌구나.
public class Test02 {
	public static void main(String[] args) {
		//목표 : 도구(Scanner)를 이용한 입력방법을 살펴본다.
		//기본적으로 제공되는 도구는 아니다. 직접 만들어야한다.
		
		//도구 생성 구문을 만든다.
		Scanner sc = new Scanner(System.in); //에러가 떴었다. 자바가 "스캐너가 뭐예요?"라고 묻는 거다.
		//new : 내가 오른쪽에 있는 것을 만들 것이다.
		//System.in 표준입력통로
		//즉 표준 입력통로와 결합된 스캐너 생성.
		//sc : 내가 만든 리모콘이다. !!참조형!!
		
		//[1].next(); : 띄어쓰기 전까지 문자열을 입력받아 String형태로 저장
		String a = sc.next();
		System.out.println(a);
		
		//[2].nextInt(); : 띄어쓰기 전까지 int형태로 저장
		int b = sc.nextInt();
		System.out.println(b);
		
		//[3].nextDouble();
		//[4].nextFloat(); 이렇게 데이터 형태를 입력하면 해당되는 것을 받아들인다. 
		
		//주의! : 다 쓰고 나면 내가 만든 도구는 정리를 해야한다?
		sc. close(); // 아하 이 도구를 그만 쓰겠다라고 하는건가보다.
		}
}