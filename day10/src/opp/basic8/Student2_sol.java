package opp.basic8;

public class Student2_sol {

	
	String name;
	int grade, sub1, sub2, sub3;
	int total;	
	double avg;
	//int total = (sub1 + sub2+ sub3); // 아래에 있음 
	//double avg = total/3;
	
	void input(String name, int grade, int sub1, int sub2, int sub3){
	this.name = name;
	this.grade = grade;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3; 
	}
	
	void result() {
		int total = sub1 + sub2+ sub3;
		double avg = (double)total/3;
				
		System.out.println(this.name);
		System.out.println(this.grade);
		System.out.println(this.sub1);
		System.out.println(this.sub2);
		System.out.println(this.sub3);
		System.out.println(total);
		System.out.println(avg);
	}
}
