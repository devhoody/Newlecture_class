package kr.co.rland.app.service;

import java.util.List;

import kr.co.rland.app.entity.Menu;	

public interface MenuService {

	List<Menu> getList();
	List<Menu> getListByCategotyId(long categoryId);
	List<Menu> getListByName(String name);
	
	Menu getById(long id);
	void like(long id, Long memberId, boolean on ); 
	// 누가, 뭐를, 좋아요! 까지 들어가야지 
	
	void addToCart(long id, Long memberId); 
	void addToCart(long id); 
	// 검색엔 필드명, 질의어가 들어감 
}