package module;

import java.util.Scanner;

import beans.MusicDao;

public class Test03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("플레이하실 곡 번호를 입력해주세요");
		int musicNo = sc.nextInt();
		sc.close();
		
		MusicDao musicDao = new MusicDao();
		musicDao.addPlayCount(musicNo);
		
		System.out.println("재생 횟수 +1 ");
	}
}
