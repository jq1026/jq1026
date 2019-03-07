<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>登陆</title>
</head>
<body>
	
    <form action='<c:url value="/sys/add"></c:url>' method="post">
    	id:<input type="text" name="uid">  <p>
    	用户名： <input type="text" name="name"> <p>
    	密&nbsp;&nbsp;&nbsp;码： <input type="password" name="password"> <p>
    	<input type="submit" value="添加" >
    </form>
</body>
</html>

