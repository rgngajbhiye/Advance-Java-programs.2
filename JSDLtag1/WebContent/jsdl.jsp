<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> query tag</title>
</head>
<body>
<% String uname=request.getParameter("uname");
String lname=request.getParameter("lname");
String pass=request.getParameter("pass");
   
     %>
   


        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver" 
    url="jdbc:mysql://localhost:3306/jsdl"
    user="root" password="abc123"/> 
    
    
    
    
    
    
    
   
    
   
     <sql:update dataSource="${snapshot}" var="count">
    INSERT INTO user (uname,lname,pass) VALUES (?,?,?);
    <sql:param value="${param.uname}"></sql:param>
    <sql:param value="${param.lname }"></sql:param>
    <sql:param value="${param.pass}"></sql:param>
    </sql:update>
    
    <c:set var="id" value="2"></c:set>
    
    <sql:update dataSource="${snapshot}" var="count">
    DELETE FROM user WHERE ID=?
    <sql:param value="${id}"></sql:param>
    
    </sql:update>
    
    
    <sql:query dataSource= "${snapshot}" var="result">
    SELECT * FROM user;
    </sql:query>
   
   
   <table border="1" width="100%">
   
   <tr>
    <th>User id</th>
    <th>Username</th>
    <th>Lastname</th>
    <th>Password</th>
    </tr>
   
   
   
   <c:forEach var="row" items="${result.rows}">
    
    <tr>
    <td> <c:out value="${row.id}"/></td>
     <td><c:out value="${row.uname}"/></td>
     <td><c:out value="${row.lname}"/></td>
    <td><c:out value="${row.pass}"/></td>
    </tr>
    
    </c:forEach>
    
    </table>
    
</body>
</html>