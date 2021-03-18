package oop.constructor2;

public class Test01 {
	public static void main (String [] args) {
		Info a = new Info("뽀로로", "전사", 50, 5000);
		Info b = new Info("크롱", "마법사", 35, 20000);
		Info c = new Info("루피", "전사");
		
		a.result();
		b.result();
		c.result();
	
		
		//Q. a를 레벨업 해보세요!
		a.setLv(a.getLv()+1); // 이렇게 하는 거 보다.
		
		a.levelUp(); // 차라리 이걸 만드는 게 낫지
		
		a.levelUp(5);
		
		
	}
}
