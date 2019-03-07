<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>登陆</title>
</head>
<body>
	<table  border="2">
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td colspan="2">&nbsp;&nbsp;&nbsp;操作</td>
		</tr>
	     <c:if test="${!empty users}">
	         <c:forEach items="${users}" var="user">
	        	 	<tr>
	                    <td>${user.uid }</td>
	                    <td>${user.name }</td>
	                    <td><a href="delete?uid=${user.uid }">删除</a></td>
	                    <td><a href="getone?name=${user.name }">修改</a></td>
	                </tr>
	        </c:forEach>
	    </c:if>
    </table>
  
    <a href="addt"><button>添加</button></a>
</body>
</html>

