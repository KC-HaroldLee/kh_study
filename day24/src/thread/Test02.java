package thread;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) throws InterruptedException {
		// main Thread의외에 1개를 Thread를 생성하여 2개의 작업을 동시에 진행

		// 상속은 안 받으면서 이번 객체만 특정 메소드를 재정의 =익명클래스 , 무명 클래스

		Thread t = new Thread() {
			@Override // 했기때문에 throw를 못한다. 이미있는 놈 아니겠니? 	
			public void run() {

				for (int i = 1; i <= 100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		t.start();

		// 작업 1
		JOptionPane.showMessageDialog(null, "테스트");

		// 작업 2

	}
}
