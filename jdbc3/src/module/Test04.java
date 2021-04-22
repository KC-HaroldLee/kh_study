package module;

import beans.MemberDao;

public class Test04 {
	public static void main(String[] args) throws Exception {
		
		//준비
		String memberId = "khacademy";
		String memberPw = "khacademy";
		String memberNickname = "학생하나";
		String memberBirth = "2000-01-01";
		String memberPhone = "010-1212-3434";
		String memberEmail = "khacademy@iei.co.kr";
		
		
		//계산(데이터베이스 작업)
		MemberDao memberDao = new MemberDao();
		memberDao.resist(memberId, memberPw, memberNickname, 
											memberBirth, memberPhone, memberEmail);
		
		
		//출력
		System.out.println("가입완료");
	}
}
