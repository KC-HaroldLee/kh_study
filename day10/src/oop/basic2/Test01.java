package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		Olympic top = new Olympic();
		Olympic a = new Olympic();
		Olympic b = new Olympic();
		Olympic c = new Olympic();
		
		
		top.name = "이름";
		top.sports = "종목";
		top.type1 = "금메달";		
		top.type2 = "은메달";
		top.type3 = "동메달";
		
		a.name = "김연아";
		a.sports = "피겨스케이팅";
		a.gold = 2;
		a.silver = 0;
		a.bronze = 1;
		
		b.name = "이상화";
		b.sports = "스피드스케이팅";
		b.gold = 1;
		b.silver = 2;
		b.bronze = 0;
		
		c.name = "윤성빈";
		c.sports = "스켈레톤";
		c.gold = 1;
		c.silver = 0;
		c.bronze = 1;
		
		System.out.print(top.name + "\t");
		System.out.print(top.sports + "\t");
		System.out.print(top.type1 + "\t");
		System.out.print(top.type2 + "\t");
		System.out.print(top.type3 + "\n");
		
		
		System.out.print(a.name + "\t");
		System.out.print(a.sports + "\t");
		System.out.print(a.gold + "\t");
		System.out.print(a.silver + "\t");
		System.out.print(a.bronze + "\n");
		
		System.out.print(b.name + "\t");
		System.out.print(b.sports + "\t");
		System.out.print(b.gold + "\t");
		System.out.print(b.silver + "\t");
		System.out.print(b.bronze + "\n");
		
		System.out.print(c.name + "\t");
		System.out.print(c.sports + "\t");
		System.out.print(c.gold + "\t");
		System.out.print(c.silver + "\t");
		System.out.print(c.bronze + "\n");
	}
}
