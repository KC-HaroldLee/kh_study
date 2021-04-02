package thread;

import javax.swing.JOptionPane;

public class Test02 {
	public static void main(String[] args) throws InterruptedException {
//		main Thread 외에 1개의 Thread를 추가로 생성하여 2개의 작업을 동시에 진행
		
//		상속은 안받으면서 이번 객체만 특정 메소드를 재정의(=익명클래스, 무명클래스)
		Thread t = new Thread() {
			@Override
			public void run() {
//				작업2
				for(int i=1; i <= 100; i++) {
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
		
//		작업1
		JOptionPane.showMessageDialog(null, "테스트");

	}
}
