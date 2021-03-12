package array;

import java.lang.*;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		// 사용자에게 5명이름 입력받기

		
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		
		int num = 5;
		String[] list = new String[num];

		
		System.out.println("사람이름 입력 5명");
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextLine();
		}
		sc.close();

		//출력
		
			for (int i = 0; i < list.length-1; i++) {
			System.out.print(list[i] + "\t");
		}

	}
}