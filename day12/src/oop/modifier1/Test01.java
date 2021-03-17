package oop.modifier1;

public class Test01 {
	public static void main(String[] args) {
		Student a = new Student();
		
		a.set("피카츄", 100, 80);
		
		System.out.println(a.getName());
		System.out.println(a.getJava());

	}
}
