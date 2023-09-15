package kr.co.rland.web.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

	@Bean
	SqlSessionFactory sqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("마이바티스 세션 팩토리 생성과 콩자루에 담기");

		return sqlSessionFactory;
	}
}
