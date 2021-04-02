package thread;

import javax.swing.JOptionPane;

//익명클래스를 만들고 싶지 않다면 별개의 클래스를 만들고 상속을 통해 해당 메소드를 재정의해야 한다
//= Thread는 run이라는 메소드에 실행내용이 정의되도록 구성되어 있다.
//= 해당 메소드를 재정의하여 원하는 내용을 작성하면 실행내용이 변경된다.
class MyThread extends Thread {
	@Override
	public void run() {
//		작업2
		for(int i=1; i <= 100; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Test03 {
	public static void main(String[] args) {
//		작업2를 t에게 위임
		MyThread t = new MyThread();
		t.start();
		
//		작업1
		JOptionPane.showMessageDialog(null, "테스트");
	}
}

