package opp.basic8_array;
//import java.util.Scanner; 메모 : 여기선 쓸 필요가 없당
public class Test01 {
	public static void main(String[] args) {
		
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		Student d = new Student();
		Student e = new Student();
		
		/*
		Student [] st = new Student[5];	
		
		for(int i=0; i<st.length; i++) {
			
		*/
		a.input();
		b.input();
		c.input();
		d.input();
		e.input();
		
		a.result();
		b.result();
		c.result();
		d.result();
		e.result();
	}
}
