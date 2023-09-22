package kr.co.rland.web.controller;

import kr.co.rland.web.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.rland.web.service.MenuService;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;

//	@ResponseBody	
	@RequestMapping("list")
	public String list(Model model) {

		List<Menu> list = service.getList();

		System.out.println(list);

		model.addAttribute("list", list);


		return "menu/list"; // template에서 list.html을 찾음.
	}

//	@ResponseBody
	@RequestMapping("detail")
	public String detail() {

		return "menu/detail"; // template에서 detail.html을 찾음.
	}
}
