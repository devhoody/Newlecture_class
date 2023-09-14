package com.newlecture.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.spring.dao.MenuDao;
import com.newlecture.spring.dao.dm.DmMenuDao;
import com.newlecture.spring.entity.Menu;

@Service
//@Component("service") - 이름 명명
public class MenuServiceImp implements MenuService {

	@Autowired // field injection
	private MenuDao dao; // 인터페이스를 쓰는 이유??

//	@Autowired // constructor injection
	public MenuServiceImp() {
//		System.out.println("constructor");
//		dao = new DmMenuDao();
	}
	
//	@Autowired // setter injection
	public void setDao(MenuDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
