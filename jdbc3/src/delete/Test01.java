package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) throws Exception {
		
//		준비
		String memberId = "test12345";
		String memberPw = "test12345";
		
//		데이터베이스 삭제
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "delete member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2, memberPw);
		int count = ps.executeUpdate();
		
		con.close();
		
		if(count > 0) {
			System.out.println("탈퇴가 완료되었습니다. 그동안 이용해주셔서 감사합니다");
		}
		else {
			System.out.println("입력하신 정보가 잘못되었습니다");
		}
		
	}
}
