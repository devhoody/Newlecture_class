package com.newlecture.spring;
/*
 * 230913
 * DI
 */

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newlecture.spring.entity.Menu;
import com.newlecture.spring.service.MenuService;

public class App {

	public static void main(String[] args) {
//		MenuDao dao = new Dm2MenuDao(); // Dependency - 종속객체 -> 부품
//		
//		MenuServiceImp service = new MenuServiceImp();
//		service.setDao(dao); // Injection - 주입 -> 결합

		// ApplicationContext = 스프링

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConpig.class);

		// 객체를 가져오는 2가지 방법(MenuService)
		MenuService service = context.getBean(MenuService.class); // class 이용, 이름을 사용하지않을때
//		MenuService service = (MenuService) context.getBean("service"); // bean id 사용, 이름을 사용할 때
		List alist = (List) context.getBean("list");
		System.out.println(alist);
		
		List<Menu> list = service.getList();

		System.out.println(list);

	}

}
