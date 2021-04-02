package thread;

import java.util.Timer;
import java.util.TimerTask;

public class Test08 {
	public static void main(String[] args) {
		// 쓰레드를 사용하지 않고 시작 시점을 지정하여 이럴 수 있다.
		// run은 여기에서도 등장한다.
		// Timer 와 TimerTask
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Hello Timer");

			}
		};
		//daemon 설정은 되지 않는다.
		timer.scheduleAtFixedRate(task, 5000L, 1000L); // 5초 뒤부터 1초 각격으로 실행
	}
}
