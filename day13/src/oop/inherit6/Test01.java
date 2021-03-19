package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
	
	/* 생성자 만들면서...
	Chrome ch = new Chrome();
	Edge ed = new Edge();
	*/
		
	//크롬
	Chrome ch = new Chrome("https://www.google.com", "89.0.4389.90");
	ch.move();
	ch.refresh();
	ch.develop();
	
	//엣지
	Edge ed = new Edge("https://www.microsoft.com", "89.0.774.54");
	ed.move();
	ed.refresh();
	ed.windows();
	
	}
}
