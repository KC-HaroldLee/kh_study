package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/jsp/itemInsert.kh" )
public class ItemInsertServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		//준비 : 상품명, 가격 수신 
		ItemDto itemDto = new ItemDto();
		itemDto.setItemName(req.getParameter("itemName"));
		itemDto.setItemNo(Integer.parseInt(req.getParameter("itemPrice")));
		
		//계산
		ItemDao itemDao = new ItemDao();
		itemDao.insert(itemDto);
		
		//출력 : 성공페이지로 리닭. 실패는 필요없음 이미 500을 보내기로 함
		
		//resp.sendRedirect("http://127.0.0.1:8080/study/jsp/itemInsertSuccess.jsp");
		//resp.sendRedirect("//127.0.0.1:8080/study/jsp/itemInsertSuccess.jsp");
		resp.sendRedirect("itemInsertSuccess.jsp");
		
		
	} catch (Exception e) {
	e.printStackTrace();
	resp.sendError(500);
	}
}
}
