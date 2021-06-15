
package com.kh.spring03;

public class TestDto {
	private int a, b;
	public TestDto() {
		super();
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		System.out.println("a : " + a);
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		System.out.println("b : " + b);
		this.b = b;
	}
}