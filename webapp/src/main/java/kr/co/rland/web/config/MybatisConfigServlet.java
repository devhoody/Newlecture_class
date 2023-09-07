package kr.co.rland.web.config;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/*" , loadOnStartup = 1)
public class MybatisConfigServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("초기화");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서비스");
	}
	
	@Override
	public void destroy() {
		System.out.println("삭제");
	}
	
}
