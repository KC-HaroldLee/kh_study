package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ProductDao;


@WebServlet(urlPatterns = "/jsp/productDelete.kh")
public class productDeleteServlet extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비
			int no = Integer.parseInt(req.getParameter("no"));
			
			//계산
			ProductDao productdao = new ProductDao();
			boolean result = productdao.delete(no);
			
			if(result) {
				resp.sendRedirect("study/jsp/productDeleteSuccess.jsp");
			}
			else {
				resp.sendRedirect("study/jsp/productDeleteFail.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
