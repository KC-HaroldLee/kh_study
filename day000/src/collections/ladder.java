package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ladder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("사람수?");
		int people = sc.nextInt();
		sc.nextLine();

		List<String> names = new ArrayList<>();
		System.out.println("사람들 이름?");
		for (int i = 0; i < people; i++) {
			names.add(sc.nextLine());
		}

		List<String> doing = new ArrayList<>();
		System.out.println("벌칙 이름?");
		for (int i = 0; i < people; i++) {
			doing.add(sc.nextLine());
		}
		sc.close();
		
		Collections.shuffle(doing);
		
		System.out.println(names);
		System.out.println(doing);
		
		System.out.println(names.get(0) + "은" + doing.get(0));
		System.out.println(names.get(1) + "은" + doing.get(1));
		System.out.println(names.get(2) + "은" + doing.get(2));
		System.out.println(names.get(3) + "은" + doing.get(3));
		System.out.println(names.get(4) + "은" + doing.get(4));

	}
}
