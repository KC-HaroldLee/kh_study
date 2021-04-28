package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.MemberDao;
import study.beans.MemberDto;
@WebServlet(urlPatterns = "/jsp/memberInsert.kh")
public class memberInsertServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		//준비
		MemberDto memberDto = new MemberDto();
		
		//memberInsert.jsp에서 POST로 바꾸었다.
		//POST방식에서는 아스키로 되니까.
		//모든 수신코드전에 복원코드를 작성한다.
		
		req.setCharacterEncoding("UTF-8"); //이제 에러가 안뜬다.
		memberDto.setMemberId(req.getParameter("memberId"));
		memberDto.setMemberPw(req.getParameter("memberPw"));
		memberDto.setMemberNick(req.getParameter("memberNick"));
		memberDto.setMemberBirth(req.getParameter("memberBirth"));
		memberDto.setMemberPhone(req.getParameter("memberPhone"));
		memberDto.setMemberEmail(req.getParameter("memberEmail"));
		
		MemberDao memberDao = new MemberDao();
		memberDao.regist(memberDto);
		
		
		//resp.sendRedirect("http://localhost:8080/study/jsp/memberInsertSuccess.jsp");
		//resp.sendRedirect("/study/jsp/memberInsertSuccess.jsp");
		resp.sendRedirect("memberInsertSuccess.jsp");
		
	} catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	
}
}
