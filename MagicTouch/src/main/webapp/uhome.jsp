<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div class="containeru">
		<div class="row">
			<div class="col-md-6">
				<div class="card">
				<%
				   User user=(User)session.getAttribute("userobj");
				%>
					<div class="card-body">
						<h1>Name:<%=user.getFname() %></h1>
						<h2>Email:<%=user.getEmail() %></h2>
						<a href="logoutservlet" class="nav-item nav-link">
							<button type="button" class="btn btn-outline-primary"
								style="color: black; border-color: black;">
								<b>Logout</b>
							</button>
						</a>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>