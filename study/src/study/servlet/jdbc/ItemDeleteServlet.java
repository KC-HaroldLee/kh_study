package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.ItemDao;

@WebServlet(urlPatterns = "/item/delete.kh")
public class ItemDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			준비 : 기본키(PK)
			int itemNo = Integer.parseInt(req.getParameter("itemNo"));
			
//			계산
			ItemDao itemDao = new ItemDao();
			boolean result = itemDao.delete(itemNo);
			
//			출력
			resp.setCharacterEncoding("MS949");
			if(result) {
				resp.getWriter().println("삭제 완료");
			}
			else {
				resp.getWriter().println("존재하지 않는 번호");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}