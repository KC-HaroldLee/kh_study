package study.servlet.jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns ="/item/list2.kh")
public class ItemListServlet2dull extends HttpServlet {

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			try {
				ItemDao itemdao = new ItemDao();
				List<ItemDto> list = itemdao.list();
				resp.setContentType("text/plain"); //마임타입 
				resp.setContentType("text/html");
				resp.setCharacterEncoding("UTF-8");
				
			//목표 : list를 HTML 형태로 출력(table태그)
				resp.getWriter().println("<table border='1'>");
				resp.getWriter().println("<thead>");
				resp.getWriter().println("<tr>");
				resp.getWriter().println("<th>itemNo</tn>");
				resp.getWriter().println("</tr>");
				resp.getWriter().println("</thead>");
				resp.getWriter().println("</table>");
			//여기까지가 내 인내심 한계이다.		
			}
			
			catch(Exception e){
				e.printStackTrace();
				resp.sendError(500);
			}
	
		}
}
