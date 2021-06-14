package com.kh.spring02;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DiceController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		Random r = new Random();
		int result = r.nextInt(6)+1;
		mv.setViewName("/WEB-INF/views/dice.jsp");
		mv.addObject("result", result);
		return mv;
	}
	
}
