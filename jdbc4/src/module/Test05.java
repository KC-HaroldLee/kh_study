package module;

import java.util.List;

import beans.MusicDao;
import beans.MusicDto;

public class Test05 {
	public static void main(String[] args) throws Exception {
		
		//모든 음원 목록을 출력
		
		MusicDao musicDao = new MusicDao();
		List<MusicDto>list = musicDao.allSelect();
		for(MusicDto musicDto : list) {
			System.out.print(musicDto.getMusicNo());
			System.out.print("|");
			System.out.print(musicDto.getMusicName());
			System.out.print("|");
			System.out.print(musicDto.getMusicArtist());
			System.out.print("|");
			System.out.print(musicDto.getMusicAlbum());
			System.out.print("|");
			System.out.print(musicDto.getMusicPlayCount());
			System.out.print("|");
			System.out.print(musicDto.getMusicLikeCount());
			System.out.println();
		}
	}
}
