package com.newlecture.spring;

import java.util.List;

import com.newlecture.spring.entity.Menu;
import com.newlecture.spring.service.MenuServiceImp;

public class App {

	public static void main(String[] args) {
		MenuServiceImp service = new MenuServiceImp();
		List<Menu> list = service.getList();
		
		System.out.println(list);

	}

}
