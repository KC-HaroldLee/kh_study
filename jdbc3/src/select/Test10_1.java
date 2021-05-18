package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test10_1 {
	public static void main(String[] args) throws Exception {
//		2. 사용자에게 아이디를 입력받아 Member 테이블에서 해당 인원의 정보를 출력. 없으면 없다고 출력
		
//		아이디 준비
		String memberId = "test1234";
		
//		데이터베이스 단일조회
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		
		String sql = "select * from member where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.println("이미 사용중인 아이디입니다");
		}
		else {
			System.out.println("사용 가능한 아이디입니다");
		}
		
		con.close();
		
	}
}