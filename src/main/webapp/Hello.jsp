<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello.jsp</title>
</head>
<body>
<h1>Hello jsp..</h1>
 현재시간: <%= new Date() %><br>
 name = <%= request.getParameter("name") %>	<br>
 addr = <%= request.getParameter("addr") %>	<br>
 HTTP METHOD = <%= request.getMethod() %>
</body>
</html>
