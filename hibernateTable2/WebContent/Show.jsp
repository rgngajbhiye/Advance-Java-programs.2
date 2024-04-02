<%@page import="model.Adminentity2"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Admindao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Admindao db=new Admindao();
Adminentity2 ad=db.getoneuser(Integer.parseInt(request.getParameter("id")));
%>
<table>
<tr><th>Id</th><th>Name</th><th>Pass</th><th>Action</th></tr>

<form action="serv2">
ID:<input type="text" name="id" value="<%=ad.getId()%>"><br><br>
NAME:<input type="text" name="name" value="<%=ad.getName()%>"><br><br>
PHONE:<input type="text" name="phone" value="<%=ad.getPhone() %>"><br><br>
EMAIL:<input type="text" name="email" value="<%=ad.getEmail() %>"><br><br>
PASSWORD:<input type="text" name="password" value="<%=ad.getPassword() %>"><br><br>
<input type="submit" value="Register Update">

</form>

</body>
</html>