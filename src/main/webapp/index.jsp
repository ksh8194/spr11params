<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
**요청 파라미터 연습 **<p/>
<a href="kic/login?type=admin">관리자</a><br>
<a href="kic/login?type=user">일반고객</a><br>
<a href="kic/login">기타</a><br>
<form action="kic/login" method="post">
data : <input type="text" name="type">
<input type="submit">
</form>
<br>
<form action="ent/antena/singer/leejina" method="post">
title song: <input type="text" name="title">
<input type="submit">
</form>

<form action="ent/sm/singer/redvelvet" method="post">
title song: <input type="text" name="title">
<input type="submit">
</form>
</body>
</html>