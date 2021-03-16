package opp.basic6;

import java.util.Scanner;

public class Test02_Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[3];
		
		for(int i=0; i<stu.length; i++) {
			stu[i] =new Student();
		}
	
		//초기화
		for(int i=0; i<stu.length; i++) {
			System.out.println("이름 : ");
			String name = sc.next();
			
			System.out.println("학년 : ");
			int grade = sc.nextInt();
			
			System.out.println("국어 : ");
			int sub1 = sc.nextInt();
			
			System.out.println("영어 : ");
			int sub2 = sc.nextInt();
			
			System.out.println("수학 : ");
			int sub3 = sc.nextInt();	
		}
		sc.close();
		
		//문제점 2 총점과 평균이 실시간으로 반영X
		for(int i=0; i<stu.length; i++) {
			stu[i].result();
		}
	}
}
