package kr.co.rland.web.controller;

import kr.co.rland.web.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.rland.web.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;

//	@ResponseBody	
	@RequestMapping("list")
	public String list(Model model) {
		
		model.addAttribute("list", service.getList());

		Menu menu = Menu
				.builder()
				.id(1L)
				.korName("아메리카노")
				.build();

		System.out.println(menu);

		return "menu/list"; // template에서 list.html을 찾음.
	}

//	@ResponseBody
	@RequestMapping("detail")
	public String detail() {

		return "menu/detail"; // template에서 detail.html을 찾음.
	}
}
