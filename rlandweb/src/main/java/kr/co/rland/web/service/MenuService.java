package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;

public interface MenuService {
	List<Menu> getList();

	Menu getById(long id);

    Menu add(Menu menu);

	Menu modify(Menu menu);

	List<Category> getCategoryList();

	List<MenuView> getViewList(Integer page, String query, Long categoryId);
}