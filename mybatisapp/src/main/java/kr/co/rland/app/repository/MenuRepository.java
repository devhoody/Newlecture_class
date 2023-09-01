package kr.co.rland.app.repository;

/*
 *  230831
 *	mybatis DAO(레파지토리)  
 */

import java.util.List;

import kr.co.rland.app.entity.Menu;

public interface MenuRepository {
	List<Menu> findAll();
	int count(); // SELECT count(id) FROM ...
	
	Menu findById(long id);
	int save(Menu menu); // 왜 int? 왜 id가 아닌 menu? 
	int update(Menu menu);
	int delete(long id);
}
