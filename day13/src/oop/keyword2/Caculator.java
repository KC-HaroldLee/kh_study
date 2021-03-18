package oop.keyword2;

//계산기 : 사칙연산 도우미
public class Caculator {
	// 변수 (일단 최소 두개)
	private int first;
	private int second;

	
	//setter
	public void setFirst(int first) {
		this.first = first;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	//getter
	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	//생성자
	public Caculator() {
		
	}
	
	public Caculator(int first, int second) {
		this.setFirst(first);
		this.setSecond(second);
	}
	
	//계산기능
	public int plus() {
		return this.first + this.second;
	}
	
	public int minus() {
		return this.first - this.second;
	}
}
