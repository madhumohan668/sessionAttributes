<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
FirstName is :: ${firstName}<br>
LastName  is :: ${lastName}<br>
</P>
<p>
Address ::: ${address}
</p>
<a href="/sessionAttribute/${next}"> Next ${next}</a>
</body>
</html>