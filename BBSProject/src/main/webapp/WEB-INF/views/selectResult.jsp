<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<table border="1" bordercolor="red">
	<tr>
		<td bgcolor="lime">ID</td>
		<td bgcolor="lime">TITLE</td>
		<td bgcolor="lime">CONTENT</td>
		<td bgcolor="lime">DATE</td>
	</tr>
	<tr>
		<td>${bbsDTO2.id}</td>
		<td>${bbsDTO2.title}</td>
		<td>${bbsDTO2.content}</td>
		<td>${bbsDTO2.date}</td>
	</tr>
</table>
<br>
<a href = "main.jsp">Return to Main</a>

</body>
</html>