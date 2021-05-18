package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		R(read) 작업을 JDBC로 진행
//		1. 목록 조회(데이터 여러개 = 0개 이상)
//		2. 단일 조회(PK/Unique 조회 = 0개 또는 1개)
//		3. 집계함수 조회(sum,max,min,avg,count,... = 무조건 1개)
		
//		목록 조회
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		
		String sql = "select * from academy order by academy_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
//		ps.execute();//실행만..select에 적합하지 않다
		ResultSet rs = ps.executeQuery();//실행 후 결과집합에 접근할 수 있도록 참조(rs) 제공
		
		System.out.println(rs.next());//1줄 이동한 뒤 데이터 유무를 반환하라!
		System.out.println(rs.next());//1줄 이동한 뒤 데이터 유무를 반환하라!
		System.out.println(rs.next());//1줄 이동한 뒤 데이터 유무를 반환하라!
		System.out.println(rs.next());//1줄 이동한 뒤 데이터 유무를 반환하라!
		System.out.println(rs.next());//1줄 이동한 뒤 데이터 유무를 반환하라!
		
		con.close();
		System.out.println("완료!");
	}
}