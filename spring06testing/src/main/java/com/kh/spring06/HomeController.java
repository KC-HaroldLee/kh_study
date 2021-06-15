package com.kh.spring06;


import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Locale locale, Model model) {
				
		return "home";
	}
	
}
