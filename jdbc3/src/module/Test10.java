package module;

import java.util.List;
import java.util.Scanner;

import beans.AcademyDao;
import beans.AcademyDto;

public class Test10 {
	public static void main(String[] args) throws Exception {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("검색어 입력");
	String text = sc.nextLine();
	
	
	AcademyDao academyDao = new AcademyDao();
	List<AcademyDto> list = academyDao.searchList(text);
	//List<AcademyDto> list = academyDao.searchList("%"+text+"%"); ///ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	
	System.out.println("검색결과" + list.size() + "개");
	for(AcademyDto academyDto : list) {
		System.out.print(academyDto.getAcademyNo());
		System.out.print("/");
		System.out.print(academyDto.getAcademyName());
		System.out.println();
	}
		
}
}
