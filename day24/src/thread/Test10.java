package thread;

class ATM {
	int money = 10000000;

	//멀티 스레드 환경일 경우 순차적으로 접근을 시켜야한다.
	//대상 범위에 Synchronized 구문을 사용한다.
	//thread-safe을 할 것이다.... StringBuilder에 없던 것.
	synchronized void withdraw(int amount) {
		//System.out.println("출금을 시작합니다. 보유금액 : " + money);
		
		
		System.out.println(Thread.currentThread().getName() + " 출금을 시작합니다. 보유금액 : " + money);
		try {
			Thread.sleep(5000L);

			this.money -= amount;
			Thread.sleep(5000L);
			System.out.println("출금이 완료 되었습니다. 보유금액 : " + money);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Test10 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		
		/*//스레드가 main1개인 경우 순차적으로 실행이 되므로 문제가 없음
		
		atm.withdraw(1000000);
		atm.withdraw(1000000);
		atm.withdraw(1000000);
		atm.withdraw(1000000);
		atm.withdraw(1000000);
		*/
		
		Runnable r = () -> {
			atm.withdraw(1000000);
		};

		Thread t1 = new Thread(r, "피카츄");
		Thread t2 = new Thread(r, "라이츄");
		Thread t3 = new Thread(r, "파이리");
		Thread t4 = new Thread(r, "꼬부기");
		Thread t5 = new Thread(r, "버터플");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
