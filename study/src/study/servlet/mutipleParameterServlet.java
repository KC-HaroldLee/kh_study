package study.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/multiple.kh")
public class mutipleParameterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		//목표 : 같은 이름으로 여러개의 파라미터가 전달될 경우 수신하기 위한 코드
		//샘플주소 : /multiple.kh?a=10&a=20&a=30&a=40&a=50
	
	
	//1.기존의 명령으로 수신하여 출력
	//처음데이터만 읽을 수 있다.
	String a = req.getParameter("a");
	resp.getWriter().println("a = " +a );
	
	
	//2.중복 파라미터 수신명령을 사용
	String[]data = req.getParameterValues("a");
	resp.getWriter().println("data = " + Arrays.toString(data)); //이거 왜
	
	
	}
	catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	
	}
	
	
}
