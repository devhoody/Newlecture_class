package com.newlecture.spring.dao.dm;

import java.util.ArrayList;
import java.util.List;

import com.newlecture.spring.dao.MenuDao;
import com.newlecture.spring.entity.Menu;

public class DmMenuDao implements MenuDao {

	@Override
	public List<Menu> findAll() {
		// TODO Auto-generated method stub
		List<Menu> list = new ArrayList<Menu>();
		list.add(new Menu(1L,"아메리카노","americano",3600,"coffee.png",null,0,1L));
		list.add(new Menu(1L,"아이스 아메리카노","ice americano",4100,"coffee1.png",null,0,1L));
		return list;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 12;
	}

}
