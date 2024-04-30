<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!--  
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

 -->
 
 <link href="bootstrap/bootstrap.css" rel="stylesheet" > </link>

</head>
<body>

<div class="container">

	<form action="LoginServlet" method="post">
	
	<label>Username::</label>
	<input type="text" name="username" class="form-control" placeholder="Enter the Username..."><br><br>
	<label>pssword::</label>
	<input type="password" class="form-control" name="password" placeholder="Enter the password..."><br><br>
	<button class="btn btn-success" type="submit">Submit</button>
	
	</form>

</div>

</body>
</html>