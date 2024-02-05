<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<a class="btn btn-primary" href="/student/add" role="button">Add
		Student</a>

	
	<table class="table table-success table-striped">
	
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student RollNo</th>
			<th>Student Marks</th>
			<th>Action</th>
		</tr>
		
		<c:forEach var="stu" items="${data}">
		 	<tr>
		 		<td>${stu.studentId}</td>
		 		<td>${stu.studentName }</td>
		 		<td>${stu.studentRollNo}</td>
		 		<td>${stu.marks }</td>
		 		<td><a class="btn btn-primary" href="/student/delete/${stu.studentId}" role="button">Delete</a> | <a class="btn btn-primary" href="/student/edit/${stu.studentId}" role="button">Edit</a></td>
		 	</tr>
		</c:forEach>
	</table>
</body>
</html>