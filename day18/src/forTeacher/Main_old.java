package forTeacher;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main_old{
	public static void main(String[] args)  {
		// 사용자에게 이름, 국어, 영어, 수학점수를 입력받아 총점과 평균을 구현
		// 이름은 2~7글자
		// 또한 점수는 정수로만 입력 0~100점사이의 값으로 입력 가능
		// 이외의 값 입력으로 생기는 문제는 예외 메시지 출력하기.

		
	
		try(Scanner sc = new Scanner(System.in);) {
			Teacher tt = new Teacher();
		
			
			
			
			/*
			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			

			//String[] subjName = { "국어", "영어", "수학" };
			
			if (subjCount < 0) {
			throw new InputMismatchException("과목수는 1개 이상으로 입력하세요.");
			}
			String [] subjName = new String [subjCount];
			
			for (int i = 0; i < subjName.length; i++) {
				;
				subjName[i] = sc.next();
				System.out.println(subjName[i] + "과목이 " + (i+1) + "번째 과목으로 등록되었습니다");
			}
			
			
			int[] subjScore = new int[subjName.length];
			for (int i = 0; i < subjName.length; i++) {
				System.out.println(subjName[i] + "점수를 입력하세요");

				subjScore[i] = sc.nextInt();
				if (subjScore[i] < 0 || subjScore[i] > 100 ) {
					throw new InputMismatchException("점수엔 음수 입력불가");
				}
			}

			int total = 0;

			for (int i = 0; i < subjName.length; i++) {
				total += subjScore[i];
			}

			double avg = total / subjName.length;

			System.out.println(name + "의 평균 점수는" + avg + "점");

		}
		
		

		catch (InputMismatchException e1) {
			System.out.println("예외 : InputMismatchException");
			e1.printStackTrace();
			sc.close();
		}*/
		sc.close();
	}
}}