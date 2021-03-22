package oop.poly2_sol;

import java.util.Random;

public class Main03 {
	public static void main(String[] args) {
		//1개의 전화기를 랜덤으로 생성
		//약속 : 갤럭시 21(0), 갤럭시노트(1), 아이폰11(2), 아이폰12(3)
		
		Random r = new Random();
		int choice = r.nextInt(4) + 0;
		System.out.println(choice);
		
		
		Phone p;
		if(choice ==0) {
			p= new Galaxy21s("010-1212-3434", "골드");
		}
		if(choice ==1) {
			p= new GalaxyNote10("010-1212-3434", "골드");
		}
		if(choice ==2) {
			p= new IPhone11("010-1212-3434", "화이트");
		}
		if(choice ==3) {
			p= new IPhone12("010-1212-3434", "화이트");
		}
	}
}
