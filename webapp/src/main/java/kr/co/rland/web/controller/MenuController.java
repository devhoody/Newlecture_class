package kr.co.rland.web.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired // field injection
	private MenuService service;

	@RequestMapping("list")
	public String list(Model model, HttpServletRequest request) {

		ServletContext application = request.getServletContext();

		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) application.getAttribute("SqlSessionFactory");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
		List<Menu> list = repository.findAll();

		model.addAttribute("list", list);

		model.addAttribute("test", "노씨 : 1조");

		return "/WEB-INF/view/menu/list.jsp";
	}

	@RequestMapping("detail")
	public String detail(Model model, HttpServletRequest request) {
		long id = Long.parseLong(request.getParameter("id"));

		ServletContext application = request.getServletContext();
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) application.getAttribute("SqlSessionFactory");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);

		Menu m = repository.findById(id);

		model.addAttribute("m", m);

		return "/WEB-INF/view/menu/detail.jsp";
	}

}
