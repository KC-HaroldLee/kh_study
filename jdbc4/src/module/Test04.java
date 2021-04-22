package module;

import java.util.Scanner;

import beans.MusicDao;

public class Test04 {
	public static void main(String[] args) throws Exception {
		
		//사용자에게 음원번호를 입력받아 좋아요 횟수를 1 증가시키도록 구현
		
		//이미 로그인 되었다고 가정.
		
		int userNo = 1;
		//int userNo = 2;
		//int userNo = 3;
		//int userNo = 4;
		
		System.out.println("'좋아요'를 반영하고 싶은 곡 번호를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int musicNo = sc.nextInt();
			
		MusicDao musicDao = new MusicDao();
		boolean active = musicDao.addLikeCount(userNo, musicNo);
		
		sc.close();
		if(active == true) {
		System.out.println("좋아요 반영 성공");
		}
		else {
		System.out.println("좋아요 반영 실패");
		}
	}
}
