<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form method = "post" action ="login.do" id = "loginForm" >
	<label class = "form-group" for="userid">ID : </label>
		<input type = "text" class = "form-control" id = "userid" >
	<label class = "form-group" for="userpwd">Password : </label>
		<input type = "password" class = "form-control" id = "userpwd" >
	<input type = "submit" class = "btn btn-success" value = "LOGIN">
</form>

</div>
</body>
</html>