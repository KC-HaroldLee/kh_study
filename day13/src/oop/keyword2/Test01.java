package oop.keyword2;

public class Test01 {
public static void main(String[] args) {
	
	Caculator c = new Caculator();
	
	c.setFirst(10);
	c.setSecond(15);
	
	System.out.println(c.plus());
	System.out.println(c.minus());
}
}
