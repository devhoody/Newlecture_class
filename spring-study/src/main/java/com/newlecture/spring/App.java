package com.newlecture.spring;
/*
 * 230913
 * DI
 */

import java.util.List;

import com.newlecture.spring.dao.MenuDao;
import com.newlecture.spring.dao.dm.Dm2MenuDao;
import com.newlecture.spring.entity.Menu;
import com.newlecture.spring.service.MenuServiceImp;

public class App {

	public static void main(String[] args) {
		MenuDao dao = new Dm2MenuDao(); // Dependency - 종속객체 -> 부품
		
		MenuServiceImp service = new MenuServiceImp();
		service.setDao(dao); // Injection - 주입 -> 결합 
		
		List<Menu> list = service.getList();
		
		System.out.println(list);

	}

}
