package module;

import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class Test09 {
	public static void main(String[] args) throws Exception {
		
		//MemberDto memberDto = new MemberDto();
		//데이터 준비 : 없음
		//데이터베이스 조회 : MemberDao ---> List<MemberDto>
		
		
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.selectList();
		
		//출력
		for(MemberDto memberDto : list) {
			System.out.print(memberDto.getMemberNo());
			System.out.print("/");
			System.out.print(memberDto.getMemberId());
			System.out.print("/");
		}
	}
}
