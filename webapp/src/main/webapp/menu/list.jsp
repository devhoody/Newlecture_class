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
	
	pageContext.setAttribute("list", list);
	/* System.out.println(list); */ 
%>

<%= sqlSessionFactory %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메뉴목록</h1>
	<ul>
		<% for(Menu m : list) { 
			pageContext.setAttribute("m",m);
		%>
			<li><a href="detail.jsp?id=${m.id}">${m.korName}</a>(${m.engName})</li>
		<% } %>
	</ul>
</body>
</html>

