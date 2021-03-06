package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.MemberDao;
import study.beans.MemberDto;

@WebServlet(urlPatterns = "/member/login.kh")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			준비
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(req.getParameter("memberId"));
			memberDto.setMemberPw(req.getParameter("memberPw"));
			
//			계산
			MemberDao memberDao = new MemberDao();
			MemberDto result = memberDao.login(memberDto);//성공시 회원정보를 반환
//			boolean result = memberDao.login(memberDto);//성공여부를 반환
			
//			출력
			resp.setCharacterEncoding("MS949");
			if(result == null) {
				resp.getWriter().println("로그인 실패");
			}
			else {
				resp.getWriter().println("로그인 성공");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}