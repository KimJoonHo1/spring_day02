<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="<%=request.getContextPath() %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 페이지 입니다.</h2>
	el표기법 : ${login } <br/>
	<a href="${contextPath }/member/logout">로그아웃 페이지</a>
	<a href="${contextPath }/member/index">기본 페이지</a>
</body>
</html>