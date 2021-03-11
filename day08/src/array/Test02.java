package array;

import java.lang.*;

public class Test02 {
	public static void main(String[] args) {
		// 배열
		// 철수는 1번쨰 학생 (+0지점)
		// 영희는 2번째 학생 (+1지점)
		// 영수는 3번째 학생 (+2지점)
		String[] name = new String[3];
		// 이름과 개수를 정해준다.
		// name이라는 '리모콘이 나온다.'

		name[0] = "철수";
		name[1] = "영희";
		name[2] = "영수";

		System.out.println("a = " + name[0]);
		System.out.println("b = " + name[1]);
		System.out.println("c = " + name[2]);

	}
}