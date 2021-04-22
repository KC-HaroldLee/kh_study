package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AcademyDao {

	public List<AcademyDto> select() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "select * from academy";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(); // RS는 연결이 끊기면 사용할 수 없으니... 그전에 list 형태의 객체로 만들어 버린다.

		// 1.일단 빈 리스트 생성
		List<AcademyDto> list = new ArrayList();

		// 2.반복적으로 줄단위 데이터를 DTO로 바꾸어 List에 추가
		while (rs.next()) {
			AcademyDto academyDto = new AcademyDto();
			// rs의 academy_no를 academyDto로 복사
			academyDto.setAcademyNo(rs.getInt("academy_no"));
			// rs의 academy_name을 academyDto로 복사
			academyDto.setAcademyName(rs.getString("academy_name"));

			// list에 복사된 정보를 가지는 객체를 추가
			list.add(academyDto);
		}

		con.close();
		return list;
	}

	public List<AcademyDto> searchList(String text) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");

		String sql = "select * from academy where instr(academy_name, ?) > 0 " + "order by academy_no";
		// String sql = "select * from academy where academy_name like ?"; //Test10가면
		// 웃긴거 있음
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, text);

		// 난 이거 떨어뜨려 놔야지...!
		ResultSet rs = ps.executeQuery();

		List<AcademyDto> list = new ArrayList();
		while (rs.next()) {
			AcademyDto academyDto = new AcademyDto();

			academyDto.setAcademyNo(rs.getInt("academy_no"));
			academyDto.setAcademyName(rs.getString("academy_name"));

			list.add(academyDto); // 이해가 조금씩된다. list.size()를 쳐보자
		}
		con.close();
		return list;
	}
	
	public AcademyDto find (int academyNo) throws Exception{
		Class.forName("oracle.jdbc.oracore");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		
		String sql = "select * from academy where academy_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, academyNo);
		ResultSet rs = ps.executeQuery();
		
		AcademyDto academyDto;
		if(rs.next()) {
			academyDto = new AcademyDto();
			
			//데이터 복사
			academyDto.setAcademyNo(rs.getInt("academy_no"));
			academyDto.setAcademyName(rs.getString("academy_name"));
		}
		else {
		 academyDto = null;
		}
		con.close();
		return academyDto;
		
	}
}
