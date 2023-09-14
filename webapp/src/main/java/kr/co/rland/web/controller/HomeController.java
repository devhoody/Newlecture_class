package kr.co.rland.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String index(String s) {
		System.out.println(s);

		return "/WEB-INF/view/index.jsp";
//		return "hello hello hello hello";
	}
}
