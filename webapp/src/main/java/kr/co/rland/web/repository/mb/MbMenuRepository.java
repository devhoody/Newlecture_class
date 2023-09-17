package kr.co.rland.web.repository.mb;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Repository // component
public class MbMenuRepository implements MenuRepository {
	
	@Autowired // 레포에 팩토리 injection
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public List<Menu> findAll() {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlsession.getMapper(MenuRepository.class);
		
		List<Menu> list = repository.findAll();
		return list;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Menu findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
