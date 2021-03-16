package opp.basic6;

import java.util.Scanner;

public class Student_impoveed {
	// 멤버변수
	String name;
	int grade;
	int total;
	double avg;
	String[] subs = { "국어", "영어", "수학"};
	int[] subScore = new int[subs.length];

	// 입력부
	// 학생이름 입력
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름을 입력해주세요");
		this.name = sc.nextLine();

		// 학년 입력
		System.out.println(name + "의 학년을 입력해주세요");
		this.grade = sc.nextInt();

		// 각 과목 점수 입력
		for (int i = 0; i < subs.length; i++) {
			System.out.println(name + "의 " + subs[i] + "점수를 입력해주세요");
			this.subScore[i] = sc.nextInt();
		}
		sc.close(); // 이제 안 씀
		// 합계 계산
		for (int i = 0; i < subs.length; i++) {
			this.total += subScore[i];
		}

		// 평균 계산
		this.avg = (double) total / subs.length;

	}

	void result() {
		System.out.println("학생이름 : " + this.name);
		System.out.println(this.grade + "학년");
		for (int i = 0; i < subs.length; i++) {
			System.out.println(subs[i] + "점수 : " + subScore[i] + "점");
		}
		System.out.println("총점 : " + this.total + "점");
		System.out.println("평균 : " + this.avg + "점");
	}
}
