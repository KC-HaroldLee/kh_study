package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;

@WebServlet(urlPatterns = "/jsp/itemDelete.kh") // 서버내부에서 하는 거라서 /study를
public class ItemDeleteServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			//준비 상품번호를 수신
			int itemNo = Integer.parseInt(req.getParameter("itemNo"));
			
			
			//계산
			ItemDao itemDao = new ItemDao();
			boolean result = itemDao.delete(itemNo);
			
			
			//출력은 jsp에 맡기자
			//출력은 목록페이지로 Redirect처리
			//resp.sendRedirect("목록 페이지주소)";
			resp.sendRedirect("/study/jsp/itemList.jsp"); //사용자가 알아야하니 여기는 study 를 입력한다.!?
			//resp.sendRedirect("/itemList.jsp"); 상대경로
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}
}
