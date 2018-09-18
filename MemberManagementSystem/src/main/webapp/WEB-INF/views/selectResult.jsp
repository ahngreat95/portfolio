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
	<td bgcolor="lime">PW</td>
	<td bgcolor="lime">NAME</td>
	<td bgcolor="lime">TEL</td>
</tr>
<tr>
	<td>${memberDTO2.id}</td>
	<td>${memberDTO2.pw}</td>
	<td>${memberDTO2.name}</td>
	<td>${memberDTO2.tel}</td>
</tr>
</table>








</body>
</html>