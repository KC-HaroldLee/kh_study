package module;

import beans.AcademyDao;
import beans.AcademyDto;

public class Test12 {
	public static void main(String[] args) throws Exception {
		
	
	//Q. Dao, Dto를 이용한 상세보기 구현
	
	//데이터준비 
	int academy_no = 10;
	
	//데이터베이스 조회
	AcademyDao academyDao = new AcademyDao();
	AcademyDto academyDto = academyDao.find(academy_no);
	//???? = academyDao.find(???)  
	
	//출력
	
	System.out.println("번호 : " + academyDto.getAcademyNo());
	System.out.println("이름 : " + academyDto.getAcademyName());
}
}