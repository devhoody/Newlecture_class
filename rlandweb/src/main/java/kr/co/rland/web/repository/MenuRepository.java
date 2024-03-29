package kr.co.rland.web.repository;

import java.util.List;

import kr.co.rland.web.entity.MenuView;
import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.Menu;

@Mapper
public interface MenuRepository {


//	@Select("select * from menu")
	List<Menu> findAll();

	int count(); // select count(id) from ..

	Menu findById(long id);
	int save(Menu menu);
	int update(Menu menu);
	int delete(long id);

	List<MenuView> findViewAll(int offset, int size, Long categoryId, String query);
	Menu last();
}
