<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello :- ${name}</h1>
	
	
	
	<table border="3" style="width:100%">
	<tr>
		<td>Employee Id</td>
		<td>Employee Name</td>
		<td>Employee Department</td>
		<td>Student Salary</td>
		<td>Gender</td>
	</tr>
	<c:forEach var="abc" items="${name}">
	
		<tr>	
			<td>${abc.empId }</td>
			<td>${abc.empName }</td>
			<td>${abc.empDept }</td>
			<td>${abc.empSalary }</td>
			<td>${abc.gender }</td>
		</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>