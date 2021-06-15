package com.kh.spring04.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring04.beans.ItemDao;
import com.kh.spring04.beans.ItemDaoImpl;
import com.kh.spring04.beans.ItemDto;

@Controller
public class itemController {
	
	@RequestMapping("/")
	public String home() {
		//return "/WEB-INF/views/home.jsp"
		return "home";
	}
	
	//ItemController가 생성되는 시점부터
	//미리등록된 ItemDao를 사용하도록 자동주입설정을 한다.
	//=의존성 주입(DI) = Spring의 2번쨰 특징
	//=ItemDao 또는 그의 자식 클래스 중에서  등록된 요소를 주입해라! =Spring의 3번째 특징
	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<ItemDto> list = new ArrayList<ItemDto>();
		list = itemDao.list();

		model.addAttribute("list", list);
		
		return "list";
	}
}
