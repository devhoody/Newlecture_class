package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Service
public class MenuServiceImp implements MenuService {

	@Autowired
	private MenuRepository repository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Menu> getList() {
		return repository.findAll();
	}

	@Override
	public Menu getById(long id) {
		return repository.findById(id);
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

	@Override
	public List<Category> getCategoryList() {
		return categoryRepository.findCategory();
	}

	@Override
	public List<MenuView> getViewList(Integer page, String query, Long categoryId) {
		int size=9;
		int offset = size*(page-1);
		return  repository.findViewAll(offset, size, categoryId, query);
	}

}
