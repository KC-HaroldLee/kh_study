package thread;

public class Test09 {
	public static void main(String[] args) {
		// runnable은 실행 가능한 종류의 클래스들의 최상위 계층
		// Thread, TimerTask등의 부모 인터페이스

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		//r을 멀티스레드로 실행하려면?
		//=Thread 클래스를 활용한다.
		Thread  t = new Thread(r);
		t.start();
	}

}