<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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
	$(document).ready(function() {
		$('#logbtn').click(function() {
			var userid = $('#user_ID').val();
			var userpwd = $('#user_PWD').val();
			$.ajax({
				url : 'login.do',
				type : 'POST',
				data : {
					'user_ID' : userid,
					'user_PWD' : userpwd
				},
				success : function(a, b, c) {
					if (a == "fail") {
						alert("login Failed!")
						$('user_ID').val("");
						$('user_PWD').val("");
					} else {
						$('#myModal').modal('hide');
						$('#mod').addClass('invis');
						$('#ident').removeClass('invis');
						$('#ident').html(a);
					}
				}
			});
		});
	});
</script>
<style>
.vis {
	display: inline;
}

.invis {
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
				<c:if test="${user_ID == null}">
					<li>
						<button type="button" id="mod" class="btn btn-primary"
							data-toggle="modal" data-target="#myModal">Log In</button>
					</li>
				</c:if>
				<li>
					<button id="ident" class="btn btn-primary invis">${user_ID }님</button>
				</li>
				<c:if test="${user_ID != null}">
					<li>
						<button id="mod" class="btn btn-primary">${user_ID }님</button>
					</li>
				</c:if>


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
						<label class="form-group" for="user_ID">ID : </label> <input
							type="text" class="form-control" id="user_ID"> <label
							class="form-group" for="user_PWD">Password : </label> <input
							type="password" class="form-control" id="user_PWD">
					</div>
					<!-- Modal footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" id="logbtn">LOG</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>