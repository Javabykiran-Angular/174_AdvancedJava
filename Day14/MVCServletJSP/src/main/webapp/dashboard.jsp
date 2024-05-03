<%@page import="com.tka.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="bootstrap/bootstrap.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>

<h2> Welcome <%=(String)session.getAttribute("username") %> </h2>

<table class="table table-bordered">
<thead>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Mobile no</th>
	</tr>
</thead>

<tbody>



<%  
	List<Employee> list= (List<Employee>) session.getAttribute("emplist");
	for(Employee emp:list){
		%>
		
		<tr>
			<td><%=emp.getId() %> </td>
			<td><%=emp.getName() %></td>
			<td><%=emp.getMobileno() %></td>
		</tr>		

		
<%		
	}
	%>


</tbody>
</table>

</body>
</html>