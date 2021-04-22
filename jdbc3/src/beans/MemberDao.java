package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO(Database Access Object)
//= 데이터베이스 관련 코드 작업을 수행하는 객체
public class MemberDao {

	// 필요한 데이터베이스 작업들을 메소드로 구현

	// 회원 탈퇴 메소드
	// = String 2개(아이디,비밀번호)를 이용하여 int(결과행수)를 반환하는 메소드
	public int exit(String memberId, String memberPw) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "delete member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2, memberPw);
		int count = ps.executeUpdate();

		con.close();

		return count;
	}

	public int givePoint(String memberId, int point) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

//		String sql = "update member set member_point = ? where member_id = ?";
		String sql = "update member set member_point = member_point + ? where member_id = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, point);
		ps.setString(2, memberId);
		int count = ps.executeUpdate();

		con.close();

		return count;
	}

	// 비밀번호 변경 메소드
	// = 입력 : 아이디, 기존비밀번호, 신규비밀번호
	// = 출력 : 변경성공여부

	public boolean changePassword(String memberId, String memberPw, String newPw) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "update member set member_pw=? where member_id=? and member_pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, newPw);
		ps.setString(2, memberId);
		ps.setString(3, memberPw);
		int count = ps.executeUpdate();

		con.close();

//		count가 0보다 크면 성공, 아니면 실패임을 반환합니다
//		if(count > 0) {
//			return true;
//		}
//		else {
//			return false;
//		}

//		count가 0보다 큰지 여부를 반환합니다
		return count > 0;

	}

	// 회원등록 메소드
	// 입력 : 문자열 6개(아이디, 비번, 닉, 생년월일, 전번, 멜)
	// 반환 없음

	public void resist(String memberId, String memberPw, String memberNickname, String memberBirth, String memberPhone,
			String memberEmail) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "insert into member values(" + "member_seq.nextval, ?, ?, ?, ?, ? , sysdate, ?, 0, '일반'";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, memberId);
		ps.setString(2, memberPw);
		ps.setString(3, memberNickname);
		ps.setString(4, memberBirth);
		ps.setString(5, memberPhone);
		ps.setString(6, memberEmail);
		ps.execute();

		con.close();
	}

	// 오버로딩(겹쳐도 된다)
	public void resist(MemberDto memberDto) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "insert into member values(member_seq.nextval, ?, ?, ?, ?, ? , sysdate, ?, 0, '일반')";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, memberDto.getMemberId());
		ps.setString(2, memberDto.getMemberPw());
		ps.setString(3, memberDto.getMemberNick());
		ps.setString(4, memberDto.getMemberBirth());
		ps.setString(5, memberDto.getMemberPhone());
		ps.setString(6, memberDto.getMemberEmail());
		ps.execute();

		con.close();
	}

	public List selectList(/* 준비물없음 */) throws Exception { // 매개변수 없다.

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "insert * from member order by member_no asc)";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		// 1.일단 빈 리스트 생성
		List<MemberDto> list = new ArrayList();

		while (rs.next()) {
			MemberDto memberDto = new MemberDto();
			// rs의 ????를 MemberDto로 복사 //변수를 선언하지 않고 바로 넣는다.
			memberDto.setMemberNo(rs.getInt("member_no"));
			memberDto.setMemberId(rs.getString("member_id"));
			memberDto.setMemberPw(rs.getString("member_pw"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberPhone(rs.getString("member_phone"));
			memberDto.setMemberJoin(rs.getDate("member_join"));
			memberDto.setMemberEmail(rs.getString("member_email"));
			memberDto.setMemberPoint(rs.getInt("member_point"));
			memberDto.setMemberGrade(rs.getString("member_grade"));
			// list에 복사된 정보를 가지는 객체를 추가

			list.add(memberDto); // 여기가 살짝 뚜렷하지 않아.
		}

		con.close();
		return list;
	}

	public List<MemberDto> searchList(String column, String keyword) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		// String sql = "select * from member where ? = (select ? from member where
		// member_id = 'test0001')";

		String sql = "select * from member where instr (#1, ?)>0 order by member_no asc";
		sql = sql.replace("#1", column);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();

		List<MemberDto> list = new ArrayList<>();
		
		while(rs.next()) {
		MemberDto memberDto = new MemberDto();
		// rs의 ????를 MemberDto로 복사 //변수를 선언하지 않고 바로 넣는다.
		memberDto.setMemberNo(rs.getInt("member_no"));
		memberDto.setMemberId(rs.getString("member_id"));
		memberDto.setMemberPw(rs.getString("member_pw"));
		memberDto.setMemberNick(rs.getString("member_nick"));
		memberDto.setMemberBirth(rs.getString("member_birth"));
		memberDto.setMemberPhone(rs.getString("member_phone"));
		memberDto.setMemberJoin(rs.getDate("member_join"));
		memberDto.setMemberEmail(rs.getString("member_email"));
		memberDto.setMemberPoint(rs.getInt("member_point"));
		memberDto.setMemberGrade(rs.getString("member_grade"));
		
		list.add(memberDto);
		}
		con.close();
		return list;
	}
	
	public List<MemberDto> find(int inputMemberNo) throws ClassNotFoundException, SQLException {
		//일단 알려주고
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		
		String sql = "select * from member where member_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, inputMemberNo);
		ResultSet rs = ps.executeQuery();

		
	
		List<MemberDto> list = new ArrayList<>();
				
		if(rs.next()) {
		System.out.println("검색성공");
		
		MemberDto memberDto = new MemberDto();
		// rs의 ????를 MemberDto로 복사 //변수를 선언하지 않고 바로 넣는다.
		memberDto.setMemberNo(rs.getInt("member_no"));
		memberDto.setMemberId(rs.getString("member_id"));
		memberDto.setMemberPw(rs.getString("member_pw"));
		memberDto.setMemberNick(rs.getString("member_nick"));
		memberDto.setMemberBirth(rs.getString("member_birth"));
		memberDto.setMemberPhone(rs.getString("member_phone"));
		memberDto.setMemberJoin(rs.getDate("member_join"));
		memberDto.setMemberEmail(rs.getString("member_email"));
		memberDto.setMemberPoint(rs.getInt("member_point"));
		memberDto.setMemberGrade(rs.getString("member_grade"));
				
		list.add(memberDto);
		con.close();
		return list;
		}
		
		else {
		System.out.println("찾는 값이 없어요");	
		con.close();
		return null;
		}
		
	}
	
}
