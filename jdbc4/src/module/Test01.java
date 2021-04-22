package module;

import java.util.Scanner;

import beans.MusicDao;

public class Test01 {
public static void main(String[] args) throws Exception {
	
	//사용자에게 제목, 가수, 앨범명을 입력받아 음원을 등록하는 프로그램을 구현
	
	Scanner sc = new Scanner(System.in);
	System.out.println("노래 제목을 입력해주세요");
	String musicName = sc.nextLine();
	System.out.println("가수 이름을 입력해주세요");
	String musicArtist = sc.nextLine();
	System.out.println("앨범명을 입력해주세요");
	String musicAlbum = sc.nextLine();
	
	MusicDao musicDao = new MusicDao();
	musicDao.resist(musicName, musicArtist, musicAlbum);
	
	System.out.println("등록 성공!");
}
}
