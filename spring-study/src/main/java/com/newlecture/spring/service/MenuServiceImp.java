package com.newlecture.spring.service;

import java.util.List;

import com.newlecture.spring.dao.MenuDao;
import com.newlecture.spring.entity.Menu;

public class MenuServiceImp implements MenuService {

	private MenuDao dao; // 인터페이스를 쓰는 이유??

	public MenuServiceImp() {
//		dao = new DmMenuDao();
	}

	public void setDao(MenuDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
