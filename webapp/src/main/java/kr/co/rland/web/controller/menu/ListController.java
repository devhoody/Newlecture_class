package kr.co.rland.web.controller.menu;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ServletContext application = request.getServletContext();
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) application.getAttribute("SqlSessionFactory");

		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
		List<Menu> list = repository.findAll();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/menu/list.jsp");
		mv.addObject("list", list);

		// forwarding
		return mv;
	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		ServletContext application = req.getServletContext();
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) application.getAttribute("SqlSessionFactory");
//
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
//		List<Menu> list = repository.findAll();
//
//		req.setAttribute("list", list);
//
//		req.getRequestDispatcher("/WEB-INF/view/menu/list.jsp").forward(req, resp);
//	}
}
