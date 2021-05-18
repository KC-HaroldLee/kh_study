package module;

import beans.MemberDao;
import beans.MemberDto;

public class Test07 {
	public static void main(String[] args) throws Exception {
		
		MemberDto memberDto = new MemberDto(); // 두 개 다 해야하는군!
		memberDto.setMemberId("DTOtests");
		memberDto.setMemberPw("test");
		memberDto.setMemberNick("디티오");
		memberDto.setMemberBirth("2000-01-01");
		memberDto.setMemberPhone( "010-1212-3434");
		memberDto.setMemberEmail("DTO@iei.co.kr");
		
		
		//계산(데이터베이스 작업)

		MemberDao memberDao = new MemberDao();
		memberDao.regist(memberDto);
		
		System.out.println("끝");
	}
}
