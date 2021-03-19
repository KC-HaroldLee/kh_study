package oop.inherit7;

public class Test01 {
public static void main(String[] args) {
	Chrome ch = new Chrome();
	Edge ed = new Edge();
	
	ch.move();
	ch.search();  // Chrome.java에 없으니까 super class인 browser
	
	ed.move();
	ed.search();
}
}
