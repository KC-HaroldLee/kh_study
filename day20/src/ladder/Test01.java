package ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	//인원수 설정
	Scanner sc = new Scanner(System.in); 
	System.out.println("인원 수를 입력");
	int no = sc.nextInt();
	String temp = sc.nextLine();
	System.out.println("인원수는 "+ no + "명");
	
	//이름 설정
	System.out.println("이름을 각각 입력");
	List<String>names = new ArrayList<>();

	
	for(int i= 0; i<no; i++) {
		names.add(sc.nextLine());
	}
	System.out.println(names + "가 게임에 참가합니다.");
	//벌칙설정 
	System.out.println("벌칙을 각각 입력");
	List<String>doing = new ArrayList<>();
	for(int i= 0; i<no; i++) {
		doing.add(sc.nextLine());
	}
	
	sc.close();
	//이름을 섞는게 맞는듯
	//Collections.sort(names);
	Collections.sort(doing);
	
	for(int i=0; i<no; i++) {
	System.out.println(names.get(i) + " -> " + doing.get(i));
	}
	
	
	
}
}
