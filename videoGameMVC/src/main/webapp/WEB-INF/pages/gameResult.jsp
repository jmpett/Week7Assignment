<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Video Game Result</h2>
    <table>
        <tr>
            <td>Bar Code: </td>
            <td>${g.barcode}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td>${g.name}</td>
        </tr>
        <tr>
            <td>Number Owned: </td>
            <td>${g.numOwned}</td>
        </tr>
        <tr>
            <td>Is Owned:</td>
            <td>${g.owned}</td>
        </tr>
    </table>
<a href = "viewAll.mvc">View all Games</a>
</body>
</html>