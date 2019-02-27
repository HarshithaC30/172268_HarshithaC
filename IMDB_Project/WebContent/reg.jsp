<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>

<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
String user=request.getParameter("name"); 
session.putValue("userid",user); 
String email=request.getParameter("email"); 
String phone=request.getParameter("ph"); 
String pwd=request.getParameter("pswd"); 

Class.forName("oracle.jdbc.driver.OracleDriver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:oracle://localhost:1521?user=system&password=orcl11g"); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into users values ('"+user+"','"+email+"','"+phone+"',	'"+pwd+"')"); 

out.println("Registered"); 


%>
<a href ="Login.html">Login</a><br/><br/>
<a href="index.html">Home</a>

</body>
</html>