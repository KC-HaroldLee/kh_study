package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class Test04_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//회원 정보 입력받는 코드
		String memberId = "test12345";
		String memberPassword = "test12345";
		String memberNickname = "운영자";
		String memberBirth = "2000-01-01";
		String memberPhone = "010-1234-5678";
		String memberEmail = "test@kh.com";
		
		//데이터베이스에 입력받은 정보를 등록하는 코드
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
			String sql = "insert into member "
							+ "values(member_seq.nextval, ?, ?, ?, ?, ?, sysdate, ?, 0, '일반')";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			ps.setString(2, memberPassword);
			ps.setString(3, memberNickname);
			ps.setString(4, memberBirth);
			ps.setString(5, memberPhone);
			ps.setString(6, memberEmail);
			ps.execute();
			
			con.close();
			System.out.println("회원 가입 완료");
		}
		catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("이미 사용중인 아이디입니다");
			System.out.println("이미 사용중인 닉네임입니다");
			//e.printStackTrace();
		}
	}
}
