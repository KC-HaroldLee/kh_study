package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MusicDao {

	// 메소드 01.
	// 사용자에게 제목, 가수, 앨범명을 입력받아 음원을 등록하는 메소드.

	public void resist(String musicName, String musicArtist, String musicAlbum) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "insert into music values(music_seq.nextval, ?, ?, ?, 0, 0)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, musicName);
		ps.setString(2, musicArtist);
		ps.setString(3, musicAlbum);
		ps.execute();
		con.close();
	}

	// 메소드 02.
	// 사용자에게 음원번호와 변경할 정보를 입력받아 해당하는 번호의 음원정보를 수정하는 메소드.

	public void modify(int musicNo, String target, String newValue) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "update music set #1 = ? where music_no = ?";
		sql = sql.replace("#1", target);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, newValue);
		ps.setInt(2, musicNo);
		ps.execute();
		con.close();
	}

	// 메소드 03.
	// 사용자에게 음원번호를 입력받아 재생횟수를 1 증가시키는 메소드

	public void addPlayCount(int musicNo) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "update music set music_play_count = music_play_count + 1 where music_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, musicNo);
		ps.execute();
		con.close();
	}

	// 메소드 04.
	// 사용자에게 음원번호를 입력받아 좋아요 횟수를 1 증가시키는 메소드 (+중복 제거)

	public boolean addLikeCount(int userNo, int musicNo) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		System.out.println(userNo + "번 사용자가 " + musicNo + "번 곡에 좋아요를 누르려고 합니다...");

		// 1. like_list 테이블에 유저no 노래no 조회 (로그인 연습과 비슷 + 복합키 설정으로 중복방지)

		String sql = "select * from like_list where user_no = ? and music_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, userNo);
		ps.setInt(2, musicNo);
		ResultSet rs = ps.executeQuery();

		System.out.println("이미 '좋아요'를 눌렀는지 확인 중입니다");

		if (rs.next()) { // 중복값이 있다면 한 줄이 나오므로...
			System.out.println("이미 '좋아요'를 누르셨습니다");
			return (false); // "실패"를 반환
		} else { // 한 줄이 나오지 않는다면...

			// 2. like_list에 '좋아요' 누른 내역을 저장
			sql = "insert into like_list values(?, ?)"; // 찜 목록처럼 userNo와 musicNo를 추가.
			ps = con.prepareStatement(sql); // 새로운 로켓만들기
			ps.setInt(1, userNo);
			ps.setInt(2, musicNo);
			ps.execute();

			// 3. 원래 music테이블에 좋아요 +1 하기
			sql = "update music set music_like_count = music_like_count + 1 where music_no = ?";
			ps = con.prepareStatement(sql); // 새로운 로켓만들기
			ps.setInt(1, musicNo);
			ps.execute();
			con.close();
			System.out.println("'좋아요' 반영을 합니다.");
			return (true); // "성공"을 반환
		}
	}

	// 메소드 05.
	// 모든 음원 목록을 출력하는 메소드

	public List<MusicDto> allSelect() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		String sql = "select * from music";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<MusicDto> list = new ArrayList<>();

		while (rs.next()) {
			MusicDto musicDto = new MusicDto();

			musicDto.setMusicNo(rs.getInt("music_no"));
			musicDto.setMusicName(rs.getString("music_name"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicPlayCount(rs.getInt("music_play_count"));
			musicDto.setMusicLikeCount(rs.getInt("music_like_count"));

			list.add(musicDto);

		}
		con.close();
		return list;
	}

	// 메소드06.
	// 가장 많이 재생된 음원 목록 3개만 출력

	public List<MusicDto> top3() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		String sql = "select * from (\r\n" + "    select TMP.*, rownum rn from (\r\n"
				+ "        select * from music order by music_play_count desc\r\n" + "    ) TMP\r\n"
				+ ") where rn between 1 and 3";

		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<MusicDto> list = new ArrayList<>();

		while (rs.next()) {
			MusicDto musicDto = new MusicDto();

			musicDto.setMusicNo(rs.getInt("music_no"));
			musicDto.setMusicName(rs.getString("music_name"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicPlayCount(rs.getInt("music_play_count"));
			musicDto.setMusicLikeCount(rs.getInt("music_like_count"));

			list.add(musicDto);
		}
		return list;
	}
	
	// 메소드07
	// 사용자에게 제목을 입력받아 해당하는 제목의 음원을 조회하는 메소드
	public List<MusicDto> searchOne(int MusicNo) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		String sql = "select * from music";
		return null;
	}
}
