<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script>
$(document).ready(function(){
	$('#loginbtn').click( function() {
		$('#mod').addClass('invis');
		$('#ident').addClass('vis');
	});
});

</script>
<style>
.vis{
	display: block;
}
.invis{
	display: none;  
}
</style>
</head>
<body>
	<div class="navbar navbar-static-top navbar-inverse">
		<div class="brand">FYNI</div>
		<div class="navbar-inner">
			<form class="navbar-search pull-left">
				<input type="text" class="search-query" placeholder="Search">
			</form>
			<ul class="nav pull-right">
				<li>
					<button type="button" id = "mod" class="btn btn-primary" data-toggle="modal"
						data-target="#myModal">Open modal</button>
				</li>
				<li>
					<button id = "ident" class = "btn btn-primary">Log off</button>
				</li>
			</ul>
		</div>
		<div class="modal fade" id="myModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">Modal Heading</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
					<div class="modal-body">
						<form method="post" action="login.do" id="loginForm">
							<label class="form-group" for="user_ID">ID : </label> <input
								type="text" class="form-control" name="user_ID"> <label
								class="form-group" for="user_PWD">Password : </label> <input
								type="password" class="form-control" name="user_PWD">
							<!-- 	<input type = "submit" class = "btn btn-success" value = "LOGIN"> -->
							<button type="submit" id="loginbtn" name="loginbtn">LOGIN</button>
						</form>
					</div>
					<!-- Modal footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>