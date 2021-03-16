package opp.basic6;

public class Student2_bk {
	//과목코드
	//1 국어
	//2 영어
	//3 수학
	
	//멤버변수
	String name;
	int grade, sub1, sub2, sub3;
	int total = (sub1 + sub2+ sub3);
	double avg = total/3;
	
	void input(String name, int grade, int sub1, int sub2, int sub3){
	this.name = name;
	this.grade = grade;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3; 
	this.total = sub1 + sub2+ sub3;
	this.avg = (double)total/3;
	}
	
	void result() {
		System.out.println(this.name);
		System.out.println(this.grade);
		System.out.println(this.sub1);
		System.out.println(this.sub2);
		System.out.println(this.sub3);
		System.out.println(this.total);
		System.out.println(this.avg);
	}
}
