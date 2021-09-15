<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Data</h2>
<input type="button" onclick="window.location.href='addUser_Form'" value="Add USer"/><br><br>
	<table border="">
		<tr>
			<th>Name</th>
			<th>Address</th>
			<th>City</th>
			<th>Age</th>
			<th>Number</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${employeelist}" var="e">
			<c:url var="updateLink" value="/update">
				<c:param name="employeeId" value="${e.id}" />
			</c:url>

			<c:url var="deleteLink" value="/delete">
				<c:param name="employeeId" value="${e.id}" />
			</c:url>

			<tr>
				<td>${e.name}</td>
				<td>${e.address}</td>
				<td>${e.city}</td>
				<td>${e.age}</td>
				<td>${e.no}</td>
				<td><a href="${updateLink}"><input type="button" value="update"/></a> | 
				<a href="${deleteLink}" onclick="if(!(confirm('Are you sure want to delete this Employee permanently?')))  return false"><input type="button" value="Delete"/></a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>