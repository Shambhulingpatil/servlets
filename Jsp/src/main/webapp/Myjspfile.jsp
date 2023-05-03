<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is html code
</h1>
<% System.out.println("This is java"); %>
<% int a=5;

%>
<% System.out.print(a); 
System.out.print(b); %>

<%! int b=25; %>//Global variable
<%-- This is comment --%>
<%
List<Integer> list=Arrays.asList(1,4,2,6,9,5); 
System.out.println(list);
%>
<%out.print("<h1>"+list+"</h1>"); %>
<h1><%=a %></h1>//Used to print the value in the front end directly
<%@ include file="index.jsp" %>
</body>
</html>