<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to Lima's basic website</h1>
<h2>Where all the funs at!...</h2>
<%
//String x = request.getParameter("x");
String X = "true";
%>

<% if (X.equals("true"))     {    %> 
<form action="LoginServlet2" method="get">
Email:<input type="text" name="email" value= "lima@gmail.com"/><br>
Password:<input type="password" name="password" value="blue"/><br>
<input type="hidden" name="action" value="login">
<input type="submit" value="Press here">
<input type="hidden" name="nextPage" value= "Output.jsp"/>
</form>
<% }else{ %>
<hr>
<form action="LoginServlet2" method="get">
<input type="hidden" name="action" value="logout">
<input type="submit" value="Goodbye"/>
</form>
<% } %> 
</body>
</html>