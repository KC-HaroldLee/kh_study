package com.kh.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring05.entity.ItemDto;
import com.kh.spring05.repository.ItemDao;

@Controller
public class ItemController {

	
//		@Autowired // 얘는 이제 ItemDaoimpl로 감
//		private JdbcTemplate jdbcTemplate;
	
		@Autowired
		private ItemDao itemDao; //사실 껍데기이지만 스프링에서 임플리먼츠 한 하위 클래스를 인지해서 기능을 가져온다.  
		
		//등록 : GET/POST 구분을 하여 사용할 예정
		//아무것도 안적으면 모든 방식의 요청
//		@RequestMapping(value="/insert", method=RequestMethod.GET)
		@GetMapping("/insert")
		//@PostMapping("/insert")
		public String insert() {
			return "item/insert";
		}
		
//		@RequestMapping(value="/insert", method=RequestMethod.POST)
		@PostMapping("/insert")
		public String insert(@ModelAttribute ItemDto itemDto){
			
			itemDao.insert(itemDto);
			
			//등록된 입력 페이지로 돌아간다.
			return "redirect:insert";
			
		}
}
