package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.MenuView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Service
public class MenuServiceImp implements MenuService {

	@Autowired
	private MenuRepository repository;
	
	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Menu getById(long id) {
		return repository.findById(id);
	}

	@Override
	public List<MenuView> getViewList() {
		return repository.findViewAll();
	}

	@Override
	public Menu add(Menu menu) {
		repository.save(menu);
		Menu newOne = repository.last();
		return newOne;
	}

	@Override
	public Menu modify(Menu menu) {
		repository.save(menu);
		Menu mOne = repository.findById(menu.getId());
		return mOne;
	}

}
