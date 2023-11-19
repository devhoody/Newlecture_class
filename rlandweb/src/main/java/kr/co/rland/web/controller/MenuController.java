package kr.co.rland.web.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import kr.co.rland.web.service.MenuService;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService service;

//	@ResponseBody	
	@RequestMapping("list-dom")
	public String listDom(Model model,
					   HttpServletRequest request,
					   HttpServletResponse response) {

		Cookie cookie = new Cookie("test", "hello");
		if(request.getCookies() == null || request.getCookies().length <1)
			response.addCookie(cookie);

//		List<Menu> list = service.getList();
		List<MenuView> list = service.getViewList(1,null,null);
		List<Category> categoryList = service.getCategoryList();

		System.out.println(list);
		System.out.println(categoryList);

//		model.addAttribute("list", list);
//		model.addAttribute("categoryList", categoryList);

		return "/menu/list"; // template에서 list.html을 찾음.
	}

	@RequestMapping("list")
	public String list(Model model) {

		List<Category> categoryList = service.getCategoryList();
		model.addAttribute("categoryList", categoryList);
		List<MenuView> list = service.getViewList(1,null,null);
		return "/menu/list-vue"; // template에서 list.html을 찾음.
	}

	@PostMapping("reg")
	public String reg(
			@RequestParam("kor-name") String korName,
			@RequestParam(defaultValue = "0") int price,
			String description,
			@RequestParam("is-small") boolean isSmall,
			String img
	) {

		System.out.println(price);
		System.out.println(isSmall);
		System.out.println(img);

		return "redirect:list";
	}

//	@ResponseBody
	@RequestMapping("detail")
	public String detail(Model model,
//						 HttpServletRequest request
				 		@CookieValue String test) {

		System.out.println(test);

//		Cookie[] cookies = request.getCookies();

//		for(Cookie c: cookies)
//			if(c.getName().equals("test")) {
//				System.out.println(c.getValue());
//				break;
//			}

		Menu menu = service.getById(20);

		model.addAttribute("menu", menu);

		return "menu/detail"; // template에서 detail.html을 찾음.
	}
}
