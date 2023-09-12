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

public class DetailController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		long id = Long.parseLong(request.getParameter("id")); // 물음표 뒤에 값 가져오기 (쿼리스트링)
		ServletContext application = request.getServletContext();
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) application.getAttribute("SqlSessionFactory");

		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
//		List<Menu> list = repository.findAll();

		Menu m = repository.findById(id);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/menu/detail.jsp");
		mv.addObject("m", m);

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
//		long id = Long.parseLong(req.getParameter("id")); // 물음표 뒤에 값 가져오기 (쿼리스트링)
//		Menu m = repository.findById(id);
//
//		req.setAttribute("m", m);
//
//		req.getRequestDispatcher("/WEB-INF/view/menu/detail.jsp").forward(req, resp);

}
