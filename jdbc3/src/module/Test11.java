package module;

import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class Test11 {
	public static void main(String[] args) throws Exception {
//		Q : 회원 검색
		
//		데이터 준비
		String column = "member_id";
		String keyword = "kh";
		
//		데이터베이스 조회
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.searchList(column, keyword);
		
//		출력
		for(MemberDto memberDto : list) {
			System.out.print(memberDto.getMemberNo());
			System.out.print("/");
			System.out.print(memberDto.getMemberId());
			System.out.println();
		}
	}
}