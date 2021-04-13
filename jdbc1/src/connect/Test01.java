package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//JDBC Java Database Connectivity
		//=자바에서 정보를 파일 대신 데이터베이스에 저장하기 위한 활동
		//=데이터베이스에는 "구조화된 중요 정보"를 보관한다.

		//class.forName("실행할 클래스 경로")
		Class.forName("oracle.jdbc.OracleDriver");
		//Class.forName("oracle.jdbc.driver.OracleDriver"); 둘 다 되지만 위에거를 권장한다. 
		System.out.println("드라이버 설치 성공");
		//연결 코드 
		//주소 /아이디 /비번
		
		//DriverManager.getConnection(
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		System.out.println("성공?");
		
		
		//연결종료
		con.close();
	}
}
