package thread;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) throws InterruptedException {
//		Thread간의 종속관계 설정이 가능한가?
//		= 주 스레드가 종료되면 종 스레드가 같이 따라서 종료되도록 설정

		Thread t = new Thread() {
			@Override
			public void run() {
//				작업2
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
//		thread를 start 하기 전에 주 스레드와 종료를 함께하도록 종속 설정
//		= thread가 여러 개일 경우 전체가 daemon이거나 전체가 daemon이 아니거나 둘 중 하나
//		t.setName("test-thread");//이름을 지정하지 않으면 Thread-0부터 자동부여
//		t.setPriority(Thread.NORM_PRIORITY);
		t.setDaemon(true);
		t.start();

//		작업1
		JOptionPane.showMessageDialog(null, "테스트");

	}
}