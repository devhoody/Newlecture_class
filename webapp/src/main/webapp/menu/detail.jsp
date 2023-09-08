<%@page import="kr.co.rland.web.entity.Menu"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.rland.web.repository.MenuRepository"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="org.apache.ibatis.session.SqlSessionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	

	SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)application.getAttribute("SqlSessionFactory");
	
	SqlSession sqlSession = sqlSessionFactory.openSession();
	MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
	List<Menu> list = repository.findAll();
	
	long id = Long.parseLong(request.getParameter("id")); // 물음표 뒤에 값 가져오기 (쿼리스트링)
	Menu menu = repository.findById(id);
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<dl>
	<dt>메뉴이름</dt>
	<dd><%= menu.getKorName()%></dd>
	<dt>가격</dt>
	<dd><%= menu.getPrice() %></dd>
	<dt>이미지</dt>
	<dd><%= menu.getImg() %></dd>
	</dl>
	<a href="list.jsp">목록 </a>

</body>
</html>