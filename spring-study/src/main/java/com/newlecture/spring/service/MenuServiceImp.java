package com.newlecture.spring.service;

import java.util.List;

import com.newlecture.spring.dao.dm.DmMenuDao;
import com.newlecture.spring.entity.Menu;

public class MenuServiceImp implements MenuService{
	
	private DmMenuDao dao;
	
	public MenuServiceImp() {
		dao = new DmMenuDao();
	}
	
	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
