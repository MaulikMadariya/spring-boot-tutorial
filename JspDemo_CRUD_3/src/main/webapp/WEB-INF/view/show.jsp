<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<a class="btn btn-primary" href="/add" role="button">add car</a>

	<table class="table table-dark table-striped w-100" >
	
		<tr>
		
			<th>Id</th>
			<th>Car Name</th>
			<th>Company Name</th>
			<th>Car Price</th>
			<th>Car Type</th>
			<th>Action</th>
		</tr>
	 	<c:forEach var="s" items="${name }">
	 	
	 	<tr>
	 		<th>${s.id }</th>
	 		<th>${s.name }</th>
	 		<th>${s.company }</th>
	 		<th>${s.price }</th>
	 		<th>${s.type }</th>
	 		<th><a class="btn btn-primary" href="/edit?id=${s.id }" role="button">Edit</a> | <a class="btn btn-primary" href="/delete?id=${s.id }" role="button">Delete</a></th>
	 	</tr>
		</c:forEach>
	</table>
</body>
</html>