<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script> -->
	<link href="bootstrap/bootstrap.css" rel="stylesheet" >
<title>Insert title here</title>
</head>
<body>

	<h2 class="text-success">Login Page Display</h2>
	
	
	<div class="container">
		<div class="mb-2 mt-2">
		<form action="login" method="post">
			<div class="mb-2 mt-2">
			<label>Username:: </label>
			<input type="text" 
			placeholder="Enter The Username" 
			name="username" 
			class="form-control w-25">
			</div>
			<div class="mb-2 mt-2">
			<label>Password:: </label>
			<input type="password" 
			name="password" 
			placeholder="Enter The Password" 
			class="form-control w-25">
			</div>
			<button type="submit" class="btn btn-success">Login</button>
		</form>
		</div>
	</div>
	

</body>
</html>