package kr.co.rland.app.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.rland.App;
import kr.co.rland.app.entity.Menu;
import kr.co.rland.app.repository.MenuRepository;

public class MenuServiceImp implements MenuService {
	
	private MenuRepository repository;
	
	public MenuServiceImp() {
		try (SqlSession session = App.sqlSessionFactory.openSession()) {
				repository = session.getMapper(MenuRepository.class);
			}
	}
	

	@Override
	public List<Menu> getList() {
		List<Menu> list = repository.findAll();
		return list;
	}

	@Override
	public List<Menu> getListByCategotyId(long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> getListByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu getById(long id) {
		Menu menu = repository.findById(id);
		return menu;
	}

	@Override
	public void like(long id, Long memberId, boolean on) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCart(long id, Long memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCart(long id) {
		// TODO Auto-generated method stub
		
	}



}
