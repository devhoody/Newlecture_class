package com.newlecture.spring.dao;

import java.util.List;

import com.newlecture.spring.entity.Menu;

public interface MenuDao {
	List<Menu> findAll();
	int count();
}
