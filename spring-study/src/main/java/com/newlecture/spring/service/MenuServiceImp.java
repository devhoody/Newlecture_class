package com.newlecture.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.newlecture.spring.dao.MenuDao;
import com.newlecture.spring.entity.Menu;

@Component
//@Component("service") - 이름 명명
public class MenuServiceImp implements MenuService {

	private MenuDao dao; // 인터페이스를 쓰는 이유??

	public MenuServiceImp() {
//		dao = new DmMenuDao();
	}

	@Autowired // 자동으로 Dao와 연결해주는 Annotation
	public void setDao(MenuDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
