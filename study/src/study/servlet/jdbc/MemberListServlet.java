package study.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.ItemDto;
import study.beans.MemberDao;
import study.beans.MemberDto;

@WebServlet // 안만들래
public class MemberListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			MemberDao memberDao = new MemberDao();
			List<MemberDto> memberList = memberDao.selectList();

			resp.setCharacterEncoding("MS949");
			for (MemberDto memberDto : memberList) {
				resp.getWriter().println(memberDto);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
