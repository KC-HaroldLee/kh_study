package module;

import java.sql.SQLException;
import java.util.List;
import java.util.TreeSet;

import beans.AcademyDao;
import beans.AcademyDto;

public class Test08 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Q. AcademyDao, AcademyDto를 활용하여 데이터베이즈 조회(read<-?)
		
		//준비데이터 (일단) 없음

		//데이터베이스 조회
		AcademyDao acedemyDao = new AcademyDao();
		List<AcademyDto> list = acedemyDao.select(); //();입력 할 매개변수가 없다.
		System.out.println();
		
		//출력
		System.out.println("데이터 개수 : " + list.size());
		
		for(AcademyDto academyDto : list) {
			System.out.println(academyDto.getAcademyName());
		}
	}
}
