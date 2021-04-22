package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test03_0 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String characterId = sc.next();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");//ojdbc8.jar 등록된 경우만 가능
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "insert into character(character_no, character_name) "
						+ "values(character_seq.nextval, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, characterId);
		ps.execute();
		
		con.close();
		System.out.println("성공");
		
	}
}
