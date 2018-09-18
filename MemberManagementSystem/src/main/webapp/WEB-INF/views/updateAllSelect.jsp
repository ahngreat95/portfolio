<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="updateAllFinal.do">
<table border="1" bordercolor="red">
<tr>
	<td bgcolor="yellow">ID</td>
	<td bgcolor="yellow">PW</td>
	<td bgcolor="yellow">NAME</td>
	<td bgcolor="yellow">TEL</td>
</tr>
<tr>
	<td><input type="text" value="${memberDTO2.id}" name="id"></td>
	<td><input type="text" value="${memberDTO2.pw}" name="pw"></td>
	<td><input type="text" value="${memberDTO2.name}" name="name"></td>
	<td><input type="text" value="${memberDTO2.tel}" name="tel"></td>
</tr>
</table>
<input type="submit" value="회원 정보 최종 수정">
</form>







</body>
</html>