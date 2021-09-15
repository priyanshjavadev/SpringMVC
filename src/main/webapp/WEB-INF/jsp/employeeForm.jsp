<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style> .error{color:red} </style>
</head>

<body>
	<h2>Employee details</h2>
	
	<s:form action="save" method="post" modelAttribute="employee">
		<table border="">
            <s:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><s:input path="name"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><s:input path="address" /></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><s:select path="city">
                	<s:option value="0">---Select City---</s:option>
                	<s:option value="Ahmedabad">Ahmedabad</s:option>
                	<s:option value="Surat">Surat</s:option>
                	<s:option value="Baroda">Baroda</s:option>
                </s:select></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><s:input path="age" /></td>
            </tr>
            <tr>
                <td>Number:</td>
                <td><s:input path="no" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
	</s:form>
</body>

</html>