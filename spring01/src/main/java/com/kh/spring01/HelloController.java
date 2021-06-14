package com.kh.spring01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//Spring은 요청처리를 위해 컨트롤러 생성하도록 요구한다.
//=과거의 스프링에서는 Controller라는 인터페이스를 상속받도록 요구한다.
//=여기서 ModelAndView라는 새로운 객체가 나온다.
// =view : 결과가 표시될 화면의 정보 (ex : jsp)
// =model : 결과가 표시될 화면으로 전달될 데이터 정보
public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	//이 컨트롤러에서는 ModelAndView 객체를 만들어서 다음 페이지와 연결시키는 것이 목적이다.
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("Message", "스프링에 온 걸 환영합니다.");
		mv.setViewName("/WEB-INF/views/hello.jsp");
		return mv;
	}

		
}
