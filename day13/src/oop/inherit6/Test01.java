package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
	Chrome ch = new Chrome();
	Edge ed = new Edge();

	//크롬
	ch.set("https://www.google.com", "89.0.4389.90");
	ch.move();
	ch.refresh();
	ch.develop();
	
	//엣지
	ed.set("https://www.microsoft.com", "89.0.774.54");
	ed.move();
	ed.refresh();
	ed.windows();
	
	}
}
