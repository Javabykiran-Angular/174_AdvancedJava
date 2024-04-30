<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome To JSP...</h2>

<%!
		int count=0; // Forward declaration & Defination
%>

<%
	count++;

	if(count%2==0){
	//	out.println("Number is Even...");
	%>
	<h2 style="color:green;">Number is Even..</h2>
	
	<%	
	}else{
		//out.println("Number is Odd...");
	%>
	<h2 style="color:red;">Number is Odd...</h2>
	<%
	}

	//out.print("Count is "+count);  
%>

<h2><%=count %></h2>




</body>
</html>