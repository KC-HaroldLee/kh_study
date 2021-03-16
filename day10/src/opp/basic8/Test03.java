package opp.basic8;

public class Test03 {
	public static void main(String[] args) {
		//앞의 문제를 배열로 풀어
		Student [] data = new Student[3];
		Student a = new Student();
		
		//da
		data[0] = new Student(); // <--a
		data[1] = new Student(); // <--b
		data[2] = new Student(); // <--c
		
		
		
		//초기화
		data[0].input("마리오",1,90,80,70);
		data[1].input("루이지",1,90,80,70);
		data[2].input("쿠파",3,90,80,70);
		
		//출력
		data[0].result();
		data[1].result();
		data[2].result();		
	}
}
