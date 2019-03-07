<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>登陆</title>
</head>
<body>
	
    <form action='<c:url value="/sys/update"></c:url>' method="post">
    
    	id:<input type="hidden" name="uid" value="${user.uid }">  <p>
    		<input type="text" name="uid" value="${user.uid }" disabled="disabled"><p>
    	用户名： <input type="text" name="name" value="${user.name }">  <p>
    	密&nbsp;&nbsp;&nbsp;码： <input type="text" name="password" value="${user.password }">  <p>
    	<input type="submit" value="修改" >
  
    </form>
</body>
</html>

