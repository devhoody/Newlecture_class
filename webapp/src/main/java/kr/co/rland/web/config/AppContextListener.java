package kr.co.rland.web.config;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("서버 시작 이벤트 발생");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("서버 종료 이벤트 발생");
	}
}
