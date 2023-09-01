package kr.co.rland;
/*
 *  0830
 *  menu 인터페이스 
 *
 *  230831
 *	mybatis DAO(레파지토리)  
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.co.rland.app.entity.Menu;
import kr.co.rland.app.repository.MenuRepository;
import kr.co.rland.app.service.MenuServiceImp;

public class App {
	
	public static SqlSessionFactory sqlSessionFactory; 
	
	public static void main(String[] args) throws IOException {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		
		 
		
	}

}
