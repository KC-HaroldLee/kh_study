package home.servlet.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import home.beans.ProductDao;
import home.beans.ProductDto;

@WebServlet(urlPatterns = "/product/productSearch.kh")
public class ProductSearchServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 try {
		 //준비
		 	req.setCharacterEncoding("UTF-8");
		 	String type =  req.getParameter("type");
		 	String name =req.getParameter("name");		 	
		 
		 //계산
		 	ProductDao productDao = new ProductDao();
		 	List<ProductDto> productList = productDao.search(type, name);
		 
		 //출력
			for(ProductDto productDto : productList) {
				resp.getWriter().println(productDto);
			}
			resp.sendRedirect("/productSearchResult.jsp");
		
	} catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	}
}
