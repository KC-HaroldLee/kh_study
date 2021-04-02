package thread;

public class Test09_1 {
	public static void main(String[] args) {
		// 추상클래스와 달리 인터페이스 중에서 "메소드가 1개뿐인" 메소드는 "추론"적용가능.

		// 인터페이스는 생성자가 없으니까 A a = new A(){---}; 그리고 "---"안에는 run 오버라이드가 들어온다.
		// 함수형 인터페이스라고 부르며, 최근 트렌드인 "함수형 언어"를 흉내낼 수 있다.
		// 안봐도 비디오인 부분은 쓰지 않아도 자바가 추론해준다.
		// 1.8 부터 추가된 람다식(Lambda Expression)

		/*
		 * 그래서 뒤에는 뻔할 것인 아래 코드를 Runnable r = new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Hello"); } };
		 */
		Runnable r = () -> {
			System.out.println("Hello");
		};

		// r을 멀티스레드로 실행하려면?
		// =Thread 클래스를 활용한다.
		Thread t = new Thread(r);
		t.start();
	}
}