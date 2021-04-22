package module;

import java.util.Scanner;

import beans.MusicDao;

public class Test02 {
public static void main(String[] args) throws Exception {
	//Test02 : 사용자에게 음원번호와 변경할 정보를 입력받아 해당하는 번호의 음원정보를 수정하도록 구현
	
	Scanner sc = new Scanner(System.in);
	System.out.println("음원 번호를 입력해주세요");
	int musicNo = sc.nextInt();
	sc.nextLine();
	System.out.println("변경할 컬럼이름을 입력해주세요");
	String target = sc.nextLine();
	System.out.println("변경할 값을 입력해주세요");
	String newValue = sc.nextLine();
	
	MusicDao musicDao = new MusicDao();
	musicDao.modify(musicNo, target, newValue);
	
	System.out.println("변경 성공!");
}
}
