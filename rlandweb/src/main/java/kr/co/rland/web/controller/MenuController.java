package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@ResponseBody
	@RequestMapping("list")
	public String list() {

		return "list"; // template에서 list.html을 찾음.
	}

	@ResponseBody
	@RequestMapping("detail")
	public String detail() {

		return "detail"; // template에서 detail.html을 찾음.
	}
}
