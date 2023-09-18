package kr.co.rland.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {

	@ResponseBody
	@RequestMapping("list")
	public String list() {

		return "- 관리자메뉴리스트";
	}

	@ResponseBody
	@RequestMapping("detail")
	public String detail() {

		return "관리자 세부사항";
	}
}
