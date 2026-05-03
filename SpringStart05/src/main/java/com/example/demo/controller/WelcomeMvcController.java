package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WelcomeMvcController {
	
	//	ブラウザから次のURLにアクセスされたときに処理されます。
//	http://localhost:8080/welcome-m
//	http://localhost:8080/welcome-mv
	
	@GetMapping("/welcome-m")
	public String welcomeM(Model model) {
		
		model.addAttribute("greeting", "Hello");
		model.addAttribute("welcome", "Welcome MVC (Model)");
		
		return "welcome-mvc";
	}
	
	@GetMapping("/welcome-mv")
	public ModelAndView welcomeMv(ModelAndView mv) {
		mv.addObject("greeting", "mvのHello");
		mv.addObject("welcome", "mvのWelcome MVC (ModelAndView)");
		
//		ここで表示するHTMLテンプレートを指定
		mv.setViewName("welcome-mvc");
		
		//データと画面名を持った ModelAndView をSpringに返す　
		return mv;
		
	}

}
