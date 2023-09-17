package kr.co.rland.web.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;


@Service 
public class MenuServiceImp implements MenuService {
	
	@Autowired // 서비스에 repository injection
	private MenuRepository repository;
	
	
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
