<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Game Registration Form</h2>
<mvc:form modelAttribute="videoGame" action="result.mvc">
	<table>
		<tr>
	        <td><mvc:label path="barcode">Bar Code</mvc:label></td>
	        <td><mvc:input path="barcode" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="name">Name</mvc:label></td>
	        <td><mvc:input path="name" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="numOwned">Number Owned</mvc:label></td>
	        <td><mvc:input path="numOwned" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="owned">Owned</mvc:label></td>
	        <td><mvc:checkbox path="owned" /></td>
	    </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Users</a>
</body>
</html>