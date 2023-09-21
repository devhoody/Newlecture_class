package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.rland.web.entity.Menu;

@Mapper
public interface MenuRepository {
	
	@Select("select * from menu")
	List<Menu> findAll();
	
}
