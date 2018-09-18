<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	


<c:forEach items="${list}" var="bbsDTO">
	<tr>
		<td>${bbsDTO.id}</td>
		<td>${bbsDTO.title}</td>
		<td>${bbsDTO.content}</td>
		<td>${bbsDTO.date}</td>
	</tr>
</c:forEach>
</table>

</body>
</html>