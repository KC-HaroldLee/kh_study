package thread;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) throws InterruptedException {
		// 쓰레드란 무엇인가? (필요성을 느껴야한다.
		// 우리 프로그램의 문제점!
		// 무조건 동시에 한 가지만 처리할 수 있다. (멀티 태스킹이 안된다)
		// java.lang.Thread

		// 현재는 main이라는 Thread만 존재한다.

		// 작업 2
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			Thread.sleep(1000L);
		}
	
		// 작업 1
		JOptionPane.showMessageDialog(null, "테스트");

	}
}