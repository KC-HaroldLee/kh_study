package module;

import java.sql.SQLException;
import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class Test13 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//준비물 : 회원번호
		int inputMemberNo = 1;
		
		//데이터베이스 조회
		MemberDao memberDao = new MemberDao(); //방법을 아는 사람
		List<MemberDto> list = memberDao.find(inputMemberNo); //원하는 결과물
		//이것은inputMemberNo를 재료로 find 방법으로 만든 List입니다.
		
		`
		//출력
		for(MemberDto memberDto : list) {
			System.out.print(memberDto.getMemberNo());
			System.out.print("/");
			System.out.print(memberDto.getMemberId());
			System.out.println();
		}
				
	}
}
