package study.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway.kh")
public class SubwayServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		준비
		int birth = Integer.parseInt(req.getParameter("birth"));
		
//		계산
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - birth + 1;
		
		int fare;
		if(age >= 65 || age < 8) {
			fare = 0;
		}
		else if(age >= 20) {
			fare = 1250;
		}
		else if(age >= 14) {
			fare = 720;
		}
		else {
			fare = 450;
		}
		
//		출력
		resp.getWriter().println(fare);
		
	}
}