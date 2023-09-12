package kr.co.rland.web.controller.menu;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@WebServlet("/menu/detail")
public class DetailController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext application = req.getServletContext();
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) application.getAttribute("SqlSessionFactory");

		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
		List<Menu> list = repository.findAll();

		long id = Long.parseLong(req.getParameter("id")); // 물음표 뒤에 값 가져오기 (쿼리스트링)
		Menu m = repository.findById(id);

		req.setAttribute("m", m);

		req.getRequestDispatcher("/WEB-INF/view/menu/detail.jsp").forward(req, resp);
	}
}
