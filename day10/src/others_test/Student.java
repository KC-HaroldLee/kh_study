package others_test;

public class Student {

	String name;
	int grade, kor, eng, mat, sum;
	double avg;
	
	void set(String n, int g, int k, int e, int m) {
		this.name = n;
		this.grade = g;
		this.kor = k;
		this.eng = e;
		this.mat = m;
		
		sum = this.kor + this.eng + this.mat;
		avg = sum / 3.0;
	}
	
	void out() {
		System.out.println("<학생 성적 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.grade);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}