package kr.co.rland.web.controller.admin;

import kr.co.rland.web.config.auth.RlandUserDetails;
import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.security.Principal;
import java.util.List;


@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {

	@Autowired
	private MenuService service;

//	@ResponseBody
	@RequestMapping("list")
	public String list(
			Model model,
			Authentication authentication
	) {

//		RlandUserDetails userDetails = (RlandUserDetails) authentication.getPrincipal();

		RlandUserDetails userDetails = (RlandUserDetails) SecurityContextHolder
										.getContext()
										.getAuthentication()
										.getPrincipal();

		System.err.println(userDetails.getUsername());
		System.out.println("리스트다");
		List<Category> categoryList = service.getCategoryList();
		model.addAttribute("categoryList", categoryList);

		List<MenuView> list = service.getViewList(1,null,null);
		model.addAttribute("list", list);

		return "/admin/menu/list";
	}

//	@ResponseBody
	@RequestMapping("detail")
	public String detail() {

		return "admin/menu/detail";
	}

	@GetMapping("reg")
	public String reg() {

		return "admin/menu/reg";
	}

	@PostMapping ("reg")
	public String reg(
//			Menu menu
			@RequestParam("img-name") MultipartFile imgFile,
			@RequestParam("kor-name") String korName,
			@RequestParam("eng-name") String engName,
			@RequestParam(defaultValue = "0") int price,
			String description,
			@RequestParam("is-small") boolean isSmall
	) throws IOException {



		Menu menu = Menu.builder()
					.korName(korName)
					.engName(engName)
					.price(price)
					.isSmall(isSmall)
					.description(description)
					.img(imgFile.getOriginalFilename())
					.memberId(1L)
					.build();

		service.add(menu);

		System.out.println(imgFile.isEmpty());
		System.out.println(imgFile.getOriginalFilename());

		InputStream fis = imgFile.getInputStream();
		OutputStream fos = new FileOutputStream("/Users/eddy/user/"+ imgFile.getOriginalFilename());

		int size =0;
		byte[] bfr = new byte[1024];
		while((size=fis.read(bfr)) != -1)
			fos.write(bfr, 0, size);

		fis.close();
		fos.close();

//		System.out.println(engName);
//		System.out.println(korName);
//		System.out.println(price);
//		System.out.println(menu);
//		System.out.println(isSmall);
		return "redirect:list";
	}
}
