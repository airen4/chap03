<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Declaration.jsp</title>
</head>
<body>
	<%!
		int x = 99;
		
		int add(int a, int b) {
			return a + b;
		}
		
		int multiply(int a, int b) {
			return a * b;
		}
		
		int sub(int a, int b){
			return a - b;
		}
		
	%>
<h1>10 * 20 = <%= multiply(10, 20) %> </h1>
<h1>10 + 20 = <%= add(10, 20) %> </h1>
<h1>20 - 10 = <%= sub(20, 10) %> </h1>
<h1>x = <%= x %></h1>
<br/>
<br/> 
<h1>Post = <%= request.getLocalPort() %></h1>


</body>
</html>