package home.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.ProductDao;
import home.beans.ProductDto;
@WebServlet (urlPatterns = "/product/productInsert.kh")
public class ProductInsertServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		//준비
		req.setCharacterEncoding("UTF-8");
		ProductDto productDto = new ProductDto();
		
		productDto.setName(req.getParameter("name"));
		productDto.setType(req.getParameter("type"));
		productDto.setPrice(Integer.parseInt(req.getParameter("price")));
		productDto.setMade(req.getParameter("made"));
		productDto.setExpire(req.getParameter("exprie"));

		//처리
		ProductDao productDao = new ProductDao();
		productDao.registItem(productDto); //여기서 DB로 감
		
		//출력
		resp.sendRedirect("productList.jsp");
		
	} catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
}
}
