package beans;

public class MusicDto {
	private int musicNo;
	private String musicName;
	private String musicArtist;
	private String musicAlbum;
	private int musicPlayCount;
	private int musicLikeCount;

	public MusicDto() {
		super();
	}

	public int getMusicNo() {
		return musicNo;
	}

	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicArtist() {
		return musicArtist;
	}

	public void setMusicArtist(String musicArtist) {
		this.musicArtist = musicArtist;
	}

	public String getMusicAlbum() {
		return musicAlbum;
	}

	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}

	public int getMusicPlayCount() {
		return musicPlayCount;
	}

	public void setMusicPlayCount(int musicPlayCount) {
		this.musicPlayCount = musicPlayCount;
	}

	public int getMusicLikeCount() {
		return musicLikeCount;
	}

	public void setMusicLikeCount(int musicLikeCount) {
		this.musicLikeCount = musicLikeCount;
	}

}
