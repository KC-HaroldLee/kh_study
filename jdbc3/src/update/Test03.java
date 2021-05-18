package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test03 {
	public static void main(String[] args) throws Exception {
		
//		준비
		String memberId = "test12345";
		int point = 500;
		
//		데이터베이스 수정
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		String sql = "update member set member_point = ? where member_id = ?";
		String sql = "update member set member_point = member_point + ? where member_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, point);
		ps.setString(2, memberId);
		int count = ps.executeUpdate();
		
		con.close();
		
		if(count > 0) {
			System.out.println(memberId+" 회원에게 "+point+" 포인트를 지급하였습니다");
		}
		else {
			System.out.println(memberId+" 회원은 존재하지 않습니다");
		}
	}
}
